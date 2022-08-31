package com.finishapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finishapp.BrandInfo
import com.finishapp.R
import com.finishapp.databinding.BrandItemBinding

class BrandAdapter : RecyclerView.Adapter<BrandAdapter.BrandHolder>() {

    val brandView = ArrayList<BrandInfo>()

    class BrandHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = BrandItemBinding.bind(item)
        fun bind(brandList: BrandInfo) = with(binding) {
            buttonBrandName.text = brandList.brandName
                 }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.brand_item, parent, false)
        return BrandHolder(view)
    }

    override fun onBindViewHolder(holder: BrandHolder, position: Int) {
        holder.bind(brandList = brandView[position])
        }


    override fun getItemCount(): Int {
        return brandView.size
    }

    fun addBrand(brandInfo:List <BrandInfo>) {
        brandView.addAll(brandInfo)
        notifyDataSetChanged()
    }

}