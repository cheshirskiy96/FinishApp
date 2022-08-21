package com.finishapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finishapp.BrandListModel
import com.finishapp.R
import com.finishapp.databinding.BrandItemBinding

class BrandAdapter : RecyclerView.Adapter<BrandAdapter.BrandHolder>() {
    val brandList = ArrayList<BrandListModel>()


    class BrandHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = BrandItemBinding.bind(item)
        var count: Int = 0
        fun bind(brandListModel: BrandListModel) = with(binding) {
            buttonBrandName.text = brandListModel.Result.get(count).brandName
            count++
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.brand_item, parent, false)
        return BrandHolder(view)
    }

    override fun onBindViewHolder(holder: BrandHolder, position: Int) {
        holder.bind(brandListModel = brandList[position])
    }


    override fun getItemCount(): Int {
        return brandList.size
    }

    fun addBrand(brandListModel: BrandListModel) {
        brandList.add(brandListModel)
        notifyDataSetChanged()
    }

}