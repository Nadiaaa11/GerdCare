package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginPage1 : AppCompatActivity() {

    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page1)

        startButton = findViewById(R.id.bStart)
        startButton.setOnClickListener {
            val i = Intent(this@LoginPage1, LoginPage2::class.java)
            startActivity(i)
        }
    }
}