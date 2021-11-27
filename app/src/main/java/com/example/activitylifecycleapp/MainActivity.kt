package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(baseContext, "OnCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(baseContext, "onStart", Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(baseContext, "onResume", Toast.LENGTH_SHORT).show()


    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(baseContext, "onPause", Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(baseContext, "onStop", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(baseContext, "onDestroy", Toast.LENGTH_SHORT).show()

    }
}