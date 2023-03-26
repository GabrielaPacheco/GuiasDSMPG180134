package com.example.sumar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtNumero1 : EditText
    lateinit var txtNumero2 : EditText
    lateinit var btnSumar : Button
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNumero1 = findViewById(R.id.txtNumero1)
        txtNumero2 = findViewById(R.id.txtNumero2)
        btnSumar = findViewById(R.id.btnSumar)
        txtResultado = findViewById(R.id.txtResultado)

        btnSumar.setOnClickListener(View.OnClickListener {

            val num1 = txtNumero1.text.toString().toFloat()
            val num2 = txtNumero2.text.toString().toFloat()
            txtResultado.text = "Resultado: " + sumar(num1,num2)

        })
    }

    fun sumar(numero1: Float, numero2: Float) : String {
        val resultado = numero1 + numero2
        return resultado.toString()
    }
}