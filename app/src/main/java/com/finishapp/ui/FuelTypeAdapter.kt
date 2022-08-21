package com.finishapp.ui


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finishapp.R
import com.finishapp.database.FuelType
import com.finishapp.databinding.FuelItemBinding
import com.finishapp.databinding.RefuelingFragmentBinding

class FuelTypeAdapter : RecyclerView.Adapter<FuelTypeAdapter.FuelTypeHolder>() {

    val fuelTypes = ArrayList<FuelType>()

    class FuelTypeHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = FuelItemBinding.bind(item)
        var count: Int = 0
        fun bind(fuelType: FuelType) = with(binding) {
            buttonFuelType.text = fuelType.name
            count++

        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuelTypeHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fuel_item, parent, false)
        return FuelTypeHolder(view)
    }

    override fun onBindViewHolder(holder: FuelTypeAdapter.FuelTypeHolder, position: Int) {
        addFuelType(FuelType("ДТ"))
        addFuelType(FuelType("Газ"))
        addFuelType(FuelType("Электричество"))

        holder.bind(fuelType = fuelTypes[position])
    }

    override fun getItemCount(): Int {
        return fuelTypes.size
    }


fun addFuelType(fuelType: FuelType) {
    fuelTypes.add(fuelType)
    return

}
}


