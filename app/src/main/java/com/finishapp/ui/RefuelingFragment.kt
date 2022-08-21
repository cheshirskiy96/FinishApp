package com.finishapp.ui

import androidx.appcompat.app.AppCompatActivity
import com.finishapp.databinding.RefuelingFragmentBinding

class RefuelingFragment: AppCompatActivity() {

    private lateinit var  binding : RefuelingFragmentBinding

    fun setType (){
        binding.rcViewFuel.adapter = FuelTypeAdapter()

    }


}