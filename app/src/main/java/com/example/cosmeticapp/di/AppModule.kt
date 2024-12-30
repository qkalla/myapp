package com.example.yourapp.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideSomeDependency(): SomeDependency {
        return SomeDependencyImpl()
    }
}