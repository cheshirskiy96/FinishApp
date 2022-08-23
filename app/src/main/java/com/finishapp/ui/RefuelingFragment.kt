package com.finishapp.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.finishapp.database.FuelType
import com.finishapp.databinding.RefuelingFragmentBinding



class RefuelingFragment(private val adapter: FuelTypeAdapter) : Fragment() {
    private val fuelList = listOf(
        "ДТ",
        "Газ",
        "Электричество"
    )
    var index: Int = 0
    lateinit var binding: RefuelingFragmentBinding

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
        fun newInstance() = RefuelingFragment(adapter = FuelTypeAdapter())
    }


    fun init() {
        binding.apply {
            rcViewFuel.layoutManager = GridLayoutManager(requireContext(),1)
            rcViewFuel.adapter = adapter
            if (index > 4)
                adapter.addFuelType(FuelType(fuelList[index], index))
            index++
        }

//            FuelTypeAdapter().fuelTypes.add(FuelType("ДТ", 0))
//            FuelTypeAdapter().fuelTypes.add(FuelType("АИ-95", 1))
//            FuelTypeAdapter().fuelTypes.add(FuelType("Газ", 2))
//            FuelTypeAdapter().fuelTypes.add(FuelType("Электричество",3))
    }
}

