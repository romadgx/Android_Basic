package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {

    private var btnOpenActB: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.i("INFO_FIRST", "onCreate A")

        this.btnOpenActB = findViewById(R.id.btn_open_act_b)

        btnOpenActB?.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }


    }

    override fun onStart() {
        super.onStart()
        Log.i("INFO_FIRST", "onStart A")
    }

    override fun onResume() {
        super.onResume()
        Log.i("INFO_FIRST", "onResume A")
    }

    override fun onPause() {
        super.onPause()
        Log.i("INFO_FIRST", "onPause A")
    }

    override fun onStop() {
        super.onStop()
        Log.i("INFO_FIRST", "onStop A")
    }

//    override fun onRestart() {
//        super.onRestart()
//        Log.i("INFO_FIRST", "onRestart A")
//    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("INFO_FIRST", "onDestroy A")
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        Log.i("INFO_FIRST", "onSaveInstanceState A")
//    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        Log.i("INFO_FIRST", "onNewIntent A")
    }
}