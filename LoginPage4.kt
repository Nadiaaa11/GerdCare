package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginPage4 : AppCompatActivity() {
    private lateinit var buttonNextPage: Button
    private lateinit var buttonPage2: Button
    private lateinit var buttonPage3: Button
    private lateinit var buttonPage5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page4)

        buttonNextPage = findViewById(R.id.bNext)
        buttonNextPage.setOnClickListener {
            val i = Intent(this@LoginPage4, LoginPage5::class.java)
            startActivity(i)
        }

        buttonPage2 = findViewById(R.id.bLoginPage2)
        buttonPage3.setOnClickListener{
            val i = Intent(this@LoginPage4, LoginPage2::class.java)
            startActivity(i)
        }

        buttonPage3 = findViewById(R.id.bLoginPage3)
        buttonPage3.setOnClickListener{
            val i = Intent(this@LoginPage4, LoginPage3::class.java)
            startActivity(i)
        }

        buttonPage5 = findViewById(R.id.bLoginPage5)
        buttonPage5.setOnClickListener{
            val i = Intent(this@LoginPage4, LoginPage5::class.java)
            startActivity(i)
        }
    }
}