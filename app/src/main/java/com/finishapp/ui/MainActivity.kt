package com.finishapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.finishapp.BrandListViewModel
import com.finishapp.R
import com.finishapp.databinding.ActivityMainBinding
import com.finishapp.viewmodels.RefuelingViewModel
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
        binding.buttonRefuel.setOnClickListener {
//            val viewModel = getViewModel<RefuelingViewModel> ()
                supportFragmentManager.beginTransaction().replace(
                    R.id.fragmentContainerView,
                    RefuelingFragment.newInstance()
                ).commit()

        }


    }
}
