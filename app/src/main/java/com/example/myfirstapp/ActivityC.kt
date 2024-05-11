package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityC : AppCompatActivity() {

    private var btnOpenActD: Button? = null
    private var btnOpenActA: Button? = null
    private var btnCloseActC: Button? = null
    private var btnCloseStack: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        Log.i("INFO_FIRST", "onCreate C")

        btnOpenActD = findViewById(R.id.btn_open_act_d)
        btnOpenActA = findViewById(R.id.btn_open_act_a)
        btnCloseActC = findViewById(R.id.btn_close_act_c)
        btnCloseStack = findViewById(R.id.btn_close_stack)

        btnOpenActD?.setOnClickListener {
            val intent= Intent(this, ActivityD::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }

        btnOpenActA?.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)

        }

        btnCloseActC?.setOnClickListener {
            finish()
        }

        btnCloseStack?.setOnClickListener {
            finishAffinity()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("INFO_FIRST", "onStart C")
    }

    override fun onResume() {
        super.onResume()
        Log.i("INFO_FIRST", "onResume C")
    }

    override fun onPause() {
        super.onPause()
        Log.i("INFO_FIRST", "onPause C")
    }

    override fun onStop() {
        super.onStop()
        Log.i("INFO_FIRST", "onStop C")
    }

//    override fun onRestart() {
//        super.onRestart()
//        Log.i("INFO_FIRST", "onRestart C")
//    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("INFO_FIRST", "onDestroy C")
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        Log.i("INFO_FIRST", "onSaveInstanceState C")
//    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        Log.i("INFO_FIRST", "onNewIntent C")
    }
}
