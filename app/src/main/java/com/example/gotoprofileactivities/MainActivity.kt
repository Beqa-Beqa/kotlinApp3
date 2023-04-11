package com.example.gotoprofileactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var skipBut: Button
    private lateinit var nextBut:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listeners()

        skipBut = findViewById(R.id.skipNowButton)
        nextBut  = findViewById(R.id.nextButton)
    }
    private fun listeners(){
        skipBut.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        nextBut.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}