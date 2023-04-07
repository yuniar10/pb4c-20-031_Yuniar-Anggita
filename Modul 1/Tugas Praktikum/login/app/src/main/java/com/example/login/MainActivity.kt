package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttontwo = findViewById<Button>(R.id.btn2)
        buttontwo.setOnClickListener {
         val Intent = Intent (this, secondActivity:: class.java)
            startActivity(Intent)
        }
    }
}