package com.example.myapplicationpractica04permisos02dsm104

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private val TAG = "Practica 04 - Permisos"
    private val CODIGOSOLICITUDGRABAR = 101
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configurarPermisos()
    }

    private fun configurarPermisos() {
        val permission = ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
        if(permission != PackageManager.PERMISSION_GRANTED)
        {
            Log.i(TAG, "Permiso para grabar denegado")
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,android.Manifest.permission.RECORD_AUDIO))
            {
                val builder = AlertDialog.Builder(this)
                builder.setMessage("Permiso para acceder al micrófono es requerido por esta App para grabar audio.").setTitle("Permission required")
                builder.setPositiveButton("OK"){
                    dialog,id-> Log.i(TAG,"Seleccionado")
                    hacerSolicitudPermiso()
                }
                val dialog = builder.create()
                dialog.show()
            } else {
                hacerSolicitudPermiso()
            }
        }
    }

    private fun hacerSolicitudPermiso(){
        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.RECORD_AUDIO),CODIGOSOLICITUDGRABAR)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode){
            CODIGOSOLICITUDGRABAR ->  {
                if(grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED){
                    Log.i(TAG,"Permiso ha sido denegado por el usuario")
                 Toast.makeText(applicationContext,"Permiso ha sido denegado por el usuario",Toast.LENGTH_SHORT).show()
                } else {
                    Log.i(TAG,"Permiso concedido por el usuario")
                    Toast.makeText(applicationContext,"Permiso concedido por el usuario",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}