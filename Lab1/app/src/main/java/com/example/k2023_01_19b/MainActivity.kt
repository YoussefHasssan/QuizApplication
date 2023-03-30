package com.example.k2023_01_19b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val oncreate: String = "oncreate"
    private val onstart: String = "onstart"
    private val onresume: String = "onresume"
    private val onpause: String = "onpause"
    private val onstop: String = "onstop"
    private val ondestroy: String = "ondestroy"

    private var count: Int = 0
    private val TAG:String = "TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "OnCreate() called")
    }

    override fun onStart() {
        super.onStart()

        Log.i(TAG, "On start")
    }
    override fun onResume() {
        super.onResume()

        Log.i(TAG, "On resume")
    }
    override fun onStop() {
        super.onStop()

        Log.i(TAG, "on stop")
    }
    override fun onDestroy() {
        super.onDestroy()

        Log.i(TAG, "on destroy")
    }
    override fun onPause() {
        super.onPause()

        Log.i(TAG, "on pause")
    }

}