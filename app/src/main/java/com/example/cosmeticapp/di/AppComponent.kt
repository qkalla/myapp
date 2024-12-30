package com.example.yourapp.di

import com.example.yourapp.MyApp
import com.example.yourapp.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: MyApp)
    fun inject(activity: MainActivity)
}