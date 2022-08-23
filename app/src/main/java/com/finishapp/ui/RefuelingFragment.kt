package com.finishapp.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.finishapp.database.FuelType
import com.finishapp.databinding.RefuelingFragmentBinding



class RefuelingFragment : Fragment() {
    private lateinit var binding: RefuelingFragmentBinding
    //private lateinit var adapter: FuelTypeAdapter
    private val fuelList = listOf<FuelType>(
        FuelType("ДТ", 0),
        FuelType("АИ-95", 1),
        FuelType("Газ", 2),
        FuelType("Электричество",3)
        )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RefuelingFragmentBinding.inflate(inflater)
        init()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        @JvmStatic
      fun newInstance() = RefuelingFragment()
    }


   private fun init() {
        binding.apply {
            rcViewFuel.layoutManager = GridLayoutManager(requireContext(),1)
            rcViewFuel.adapter = FuelTypeAdapter()
            for (index in 0..3){
            val fuel = FuelType(fuelList[index].name,index)
                FuelTypeAdapter().addFuelType(fuel)
            }
        }

    }
}

