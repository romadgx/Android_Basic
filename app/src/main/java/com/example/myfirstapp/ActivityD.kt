package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        Log.i("INFO_FIRST", "onCreate D")
    }

    override fun onStart() {
        super.onStart()
        Log.i("INFO_FIRST", "onStart D")
    }

    override fun onResume() {
        super.onResume()
        Log.i("INFO_FIRST", "onResume D")
    }

    override fun onPause() {
        super.onPause()
        Log.i("INFO_FIRST", "onPause D")
    }

    override fun onStop() {
        super.onStop()
        Log.i("INFO_FIRST", "onStop D")
    }

//    override fun onRestart() {
//        super.onRestart()
//        Log.i("INFO_FIRST", "onRestart D")
//    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("INFO_FIRST", "onDestroy D")
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        Log.i("INFO_FIRST", "onSaveInstanceState D")
//    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        Log.i("INFO_FIRST", "onNewIntent D")
    }
}