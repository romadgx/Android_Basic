package com.example.myfirstapp

import android.app.Application
import android.util.Log

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.i("INFO_APP", "onCreate Application")
    }
}