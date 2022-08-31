package com.finishapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.finishapp.BrandInfo
import com.finishapp.BrandListModel
import io.reactivex.Single

interface Repository {
    fun getCarBrands():Single<BrandListModel>


}

