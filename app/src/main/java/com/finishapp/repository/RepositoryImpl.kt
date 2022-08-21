package com.finishapp.repository

import com.finishapp.di.appDIModule



class RepositoryImpl() : Repository {
    override fun configureRetrofit() {
        appDIModule

    }

}


