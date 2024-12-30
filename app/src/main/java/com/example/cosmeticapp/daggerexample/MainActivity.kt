package com.example.cosmeticapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cosmeticapp.di.SomeDependency
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var someDependency: SomeDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as MyApp).appComponent.inject(this)
        setContentView(R.layout.activity_main)

        // Use the injected dependency
        someDependency.doSomething()
    }
}