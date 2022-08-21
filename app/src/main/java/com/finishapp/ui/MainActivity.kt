package com.finishapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.finishapp.BrandListViewModel
import com.finishapp.R
import com.finishapp.databinding.ActivityMainBinding
import org.koin.androidx.fragment.android.setupKoinFragmentFactory
import org.koin.androidx.viewmodel.ext.android.getViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonStart.setOnClickListener {
            val viewModel = getViewModel<BrandListViewModel>()
            viewModel.configureRetrofit()
            supportFragmentManager.beginTransaction().replace(
                R.id.fragmentContainerView,
                RegistrationFragment.newInstance()
            ).commit()
        }


    }
}
