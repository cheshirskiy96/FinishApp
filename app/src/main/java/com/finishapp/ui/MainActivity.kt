package com.finishapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.finishapp.BrandListViewModel
import com.finishapp.R
import com.finishapp.databinding.ActivityMainBinding
import com.finishapp.network.CarApi
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.getViewModel


class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.buttonStart.setOnClickListener {
        val viewModel = getViewModel<BrandListViewModel>()
        viewModel.configureRetrofit()


//            supportFragmentManager.beginTransaction().replace(
//                R.id.fragmentContainerView,
//               RegistrationFragment.newInstance()
//            ).commit()


    }
}


//}
