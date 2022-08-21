package com.finishapp.ui

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.finishapp.databinding.RefuelingFragmentBinding

class RefuelingFragment: Fragment() {

    private lateinit var  binding : RefuelingFragmentBinding

    fun setType (){
        binding.rcViewFuel.adapter = FuelTypeAdapter()

    }




}