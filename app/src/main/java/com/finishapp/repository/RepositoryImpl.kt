package com.finishapp.repository

import com.finishapp.BrandListModel
import com.finishapp.network.CarApi
import io.reactivex.Single
import retrofit2.Retrofit


class RepositoryImpl(private val retrofit: Retrofit) : Repository {

    private val carApi by lazy { retrofit.create(CarApi::class.java) }

    override fun getCarBrands(): Single<BrandListModel> = carApi.getCarBrands()

}


