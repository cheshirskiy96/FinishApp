package com.finishapp


import androidx.lifecycle.ViewModel
import com.finishapp.network.CarApi
import com.finishapp.repository.Repository
import com.finishapp.repository.RepositoryImpl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class BrandListViewModel (
    private val repository: Repository): ViewModel(){

    private val compositeDisposable = CompositeDisposable()



    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
    fun configureRetrofit(){
        repository.configureRetrofit()

    }


//    fun fetchBrandList(carApi: CarApi){
//        compositeDisposable.add(carApi.getCarBrands()
//           .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(
//                {
//
//                },
//                {
//
//                }
//            ))
//
//    }
}