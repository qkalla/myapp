package com.example.cosmeticapp

import android.app.Application
import com.example.cosmeticapp.di.DaggerAppComponent

class MyApp : Application() {
    val appComponent = DaggerAppComponent.create()

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}