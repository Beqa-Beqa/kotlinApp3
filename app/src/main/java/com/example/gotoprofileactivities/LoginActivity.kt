package com.example.gotoprofileactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var skipBut: Button
    private lateinit var loginBut: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        skipBut = findViewById(R.id.skipBut)
        loginBut = findViewById(R.id.logBut)
        listeners()
    }

    private fun listeners(){
        skipBut.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
        loginBut.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))

        }
    }

}