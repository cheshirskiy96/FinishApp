package com.finishapp.repository

import com.finishapp.BrandListModel
import io.reactivex.Single

interface Repository {
    fun getCarBrands():Single<BrandListModel>
}

