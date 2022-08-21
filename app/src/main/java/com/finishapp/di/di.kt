package com.finishapp.di

import com.finishapp.BrandListViewModel
import com.finishapp.network.CarApi
import com.finishapp.repository.Repository
import com.finishapp.repository.RepositoryImpl
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val appDIModule = module {
    single {
        private val compositeDisposable = CompositeDisposable()
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
        Retrofit.Builder()
           .baseUrl("https://vpic.nhtsa.dot.gov/api/")
           .client(okHttpClient)
           .addConverterFactory(GsonConverterFactory.create())
           .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
           .build()
           .create(CarApi::class.java).getCarBrands()

            compositeDisposable.add()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {

                    },
                    {

                    }
                ))

        }
    }
}
val repositoryModule = module {
    single<Repository> { RepositoryImpl() }
    viewModel {
        BrandListViewModel(get())
    }
}
val fragmentModule = module {

}