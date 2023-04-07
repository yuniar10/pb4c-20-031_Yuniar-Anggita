package com.example.tpwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ButtonAdd=findViewById<Button>(R.id.ButtonAdd)
        ButtonAdd.setOnClickListener {
            Toast.makeText(this,"Data Berhasil Disimpan!", Toast.LENGTH_SHORT).show()
        }

             }
         }








