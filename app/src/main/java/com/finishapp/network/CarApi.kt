package com.finishapp.network

import com.finishapp.BrandListModel
import io.reactivex.Single
import retrofit2.http.GET

interface CarApi {
    @GET ("vehicles/GetAllMakes?format=json")
    fun getCarBrands(): Single <BrandListModel>
}