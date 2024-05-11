package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityB : AppCompatActivity() {

    private var btnOpenActC: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        Log.i("INFO_FIRST", "onCreate B")

        btnOpenActC = findViewById(R.id.btn_open_act_c)

        btnOpenActC?.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("INFO_FIRST", "onStart B")
    }

    override fun onResume() {
        super.onResume()
        Log.i("INFO_FIRST", "onResume B")
    }

    override fun onPause() {
        super.onPause()
        Log.i("INFO_FIRST", "onPause B")
    }

    override fun onStop() {
        super.onStop()
        Log.i("INFO_FIRST", "onStop B")
    }

//    override fun onRestart() {
//        super.onRestart()
//        Log.i("INFO_FIRST", "onRestart B")
//    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("INFO_FIRST", "onDestroy B")
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        Log.i("INFO_FIRST", "onSaveInstanceState B")
//    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        Log.i("INFO_FIRST", "onNewIntent B")
    }
}