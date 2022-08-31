package com.finishapp

import com.google.gson.annotations.SerializedName

data class BrandListModel(
    var Count: Int?,
    var Message: String?,
    var SearchCriteria: String?,
    var Result: List <BrandInfo>
)
{
    companion object {
        val EMPTYLIST = BrandListModel(0, "","", listOf())
    }
}

data class BrandInfo(
    @SerializedName("Make_ID")
    val brandId: Int?,
    @SerializedName ("Make_Name")
    val brandName: String?
)

