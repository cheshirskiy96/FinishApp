package com.finishapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.finishapp.BrandInfo
import com.finishapp.BrandListModel
import com.finishapp.BrandListViewModel
import com.finishapp.R
import com.finishapp.databinding.ActivityMainBinding
import com.finishapp.viewmodels.RefuelingViewModel
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val viewModel = getViewModel<BrandListViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonStart.setOnClickListener {
            viewModel.configureRetrofit()
            supportFragmentManager.beginTransaction().replace(
                R.id.fragmentContainerView,
                RegistrationFragment.newInstance()
            ).commit()
        }
        binding.buttonRefuel.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(
                R.id.fragmentContainerView,
                RefuelingFragment.newInstance()
            ).commit()

        }
        lifecycleScope.launch {
            viewModel.getBrand().observe(this@MainActivity, androidx.lifecycle.Observer {
                it.let {

                }
            })
            }
        }
    }