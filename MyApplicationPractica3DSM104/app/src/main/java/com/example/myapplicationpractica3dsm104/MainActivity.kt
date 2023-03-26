package com.example.myapplicationpractica3dsm104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(MyLifeCycleObserver())
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()
    }
    override fun onStart(){
        super.onStart()
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume(){
        super.onResume()
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause(){
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop(){
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
        super.onStop()
    }
    override fun onDestroy(){
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}
