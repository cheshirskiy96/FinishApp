package com.finishapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.Scheduler

class BrandListViewModel(application: Application):AndroidViewModel(application) {

    private val compositeDisposable = CompositeDisposable()

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }

    fun fetchBrandList(carApi: CarApi){
        compositeDisposable.add(carApi.getCarBrands()
 //          .subscribeOn(Scheduler)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {

                },
                {

                }
            ))

    }
}