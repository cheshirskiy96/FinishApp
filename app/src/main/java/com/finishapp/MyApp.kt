package com.finishapp

import android.app.Application
import com.finishapp.di.appDIModule
import com.finishapp.di.fragmentModule
import com.finishapp.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApp():Application() {

    override fun onCreate() {
        super.onCreate()
    startKoin {
        androidLogger(Level.INFO)
        androidContext(this@MyApp)
        modules(appDIModule, repositoryModule, fragmentModule)
        fragmentFactory()
    }
    }

}