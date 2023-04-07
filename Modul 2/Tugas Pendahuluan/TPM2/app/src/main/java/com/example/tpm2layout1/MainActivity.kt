package com.example.tpm2layout1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonone = findViewById<Button>(
            R.id.button1
        )
        buttonone.setOnClickListener {
            val Intent = Intent(this, layout1::class.java)
            startActivity(Intent)

            val buttontwo = findViewById<Button>(
                R.id.button2
            )
            buttontwo.setOnClickListener {
                val Intent = Intent(this, layout2::class.java)
                startActivity(Intent)


                val buttonthree = findViewById<Button>(
                    R.id.button3
                )
                buttonthree.setOnClickListener {
                    val Intent = Intent(this, layout3::class.java)
                    startActivity(Intent)
                }
            }
        }

    }
}