package com.example.myapplicationpractica05recursos01


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater =menuInflater
        // Inflate the menu; this adds items to the action bar if it is present.
        inflater.inflate(R.menu.menu_muestra, menu)
        return true
    }
}