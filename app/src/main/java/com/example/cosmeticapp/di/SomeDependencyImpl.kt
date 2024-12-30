package com.example.yourapp.di

import javax.inject.Inject

class SomeDependencyImpl @Inject constructor() : SomeDependency {
    override fun doSomething() {
        // Implementation of the method
    }
}