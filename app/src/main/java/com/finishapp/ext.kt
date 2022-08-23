package com.finishapp

import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

fun <T> Single<T>.applySchedulers(
    subscribeOn: Scheduler = Schedulers.io(),
    observeOn: Scheduler = AndroidSchedulers.mainThread(),
    unsubscribeOn: Scheduler = Schedulers.io()
): Single<T> =
    this.subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .unsubscribeOn(unsubscribeOn)