package com.finishapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finishapp.R
import com.finishapp.database.FuelType
import com.finishapp.databinding.FuelItemBinding


class FuelTypeAdapter :
    RecyclerView.Adapter<FuelTypeAdapter.FuelViewHolder>() {

    val fuelViewModel = ArrayList<FuelType>()


    class FuelViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = FuelItemBinding.bind(item)
        fun bind(fuelType: FuelType) = with(binding) {
            buttonFuelType.text= fuelType.name
        }
    }
    override fun onBindViewHolder(holder: FuelViewHolder, position: Int) {
        holder.bind(fuelViewModel[position])
        holder.binding.buttonFuelType.text= fuelViewModel[position].name
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuelViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.fuel_item, parent, false)
        return FuelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fuelViewModel.size
    }
    fun addFuelType(fuelType: List<FuelType> ){
        fuelViewModel.addAll(fuelType)
        notifyDataSetChanged()
    }


}

