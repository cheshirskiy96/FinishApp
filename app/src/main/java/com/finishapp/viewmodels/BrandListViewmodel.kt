package com.finishapp


import androidx.lifecycle.*
import com.finishapp.network.CarApi
import com.finishapp.repository.Repository
import com.finishapp.ui.RegistrationFragment
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.flow.flow
import java.util.concurrent.Flow

class BrandListViewModel(
    private val repository: Repository
) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()
    private val dataList = MutableLiveData(BrandListModel.EMPTYLIST)



    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()


    }

    fun configureRetrofit() {
        compositeDisposable.add(
            repository.getCarBrands()
                .applySchedulers()
                .subscribe({ data ->
                    dataList.value = data
                }, Throwable::printStackTrace)
        )
    }
    fun getBrand()  = dataList
}