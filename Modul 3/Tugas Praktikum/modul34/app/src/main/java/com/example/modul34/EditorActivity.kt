package com.example.modul34

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.modul34.data.AppDatabase
import com.example.modul34.data.entity.User

class EditorActivity : AppCompatActivity() {
    private lateinit var fullname: EditText
    private lateinit var email: EditText
    private lateinit var telpon: EditText
    private lateinit var alamat: EditText
    private lateinit var btnsave: Button
    private lateinit var database: AppDatabase

        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_editor)
            fullname=findViewById(R.id.fullname)
            email=findViewById(R.id.email)
            telpon=findViewById(R.id.telpon)
            alamat=findViewById(R.id.alamat)
            btnsave=findViewById(R.id.btnsave)

            database=AppDatabase.getInstance(applicationContext)

            val intent=intent.extras
            if (intent != null) {
                val id=intent.getInt("id", 0)
                val user=database.userDao().get(id)

                fullname.setText(user.fullName)
                email.setText(user.email)
                telpon.setText(user.telpon)
                alamat.setText(user.alamat)
            }

            btnsave.setOnClickListener {
                if (fullname.text.isNotEmpty() && email.text.isNotEmpty() && telpon.text.isNotEmpty() && alamat.text.isNotEmpty()) {
                    if (intent != null) {
                        // coding edit data
                        database.userDao().update(
                            User(
                                intent.getInt("id", 0),
                                fullname.text.toString(),
                                email.text.toString(),
                                telpon.text.toString(),
                                alamat.text.toString()

                            )
                        )
                    }else {
                        // coding tambah data
                        database.userDao().insertAll(
                            User(
                                null,
                                fullname.text.toString(),
                                email.text.toString(),
                                telpon.text.toString(),
                                alamat.text.toString()
                            )
                        )
                    }
                    finish()
                } else {
                        Toast.makeText(
                            applicationContext,
                            "Silakan isi data dengan valid dan Lengkap!",
                            Toast.LENGTH_SHORT
                        ).show()
                }
            }
        }
}
