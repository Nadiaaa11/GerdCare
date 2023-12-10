package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginPage3 : AppCompatActivity() {
    private lateinit var buttonNextPage: Button
    private lateinit var buttonPage2: Button
    private lateinit var buttonPage4: Button
    private lateinit var buttonPage5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page3)

        buttonNextPage = findViewById(R.id.bNext)
        buttonNextPage.setOnClickListener {
            val i = Intent(this@LoginPage3, LoginPage4::class.java)
            startActivity(i)
        }

        buttonPage2 = findViewById(R.id.bLoginPage2)
        buttonPage2.setOnClickListener{
            val i = Intent(this@LoginPage3, LoginPage2::class.java)
            startActivity(i)
        }

        buttonPage4 = findViewById(R.id.bLoginPage4)
        buttonPage4.setOnClickListener{
            val i = Intent(this@LoginPage3, LoginPage4::class.java)
            startActivity(i)
        }

        buttonPage5 = findViewById(R.id.bLoginPage5)
        buttonPage5.setOnClickListener{
            val i = Intent(this@LoginPage3, LoginPage5::class.java)
            startActivity(i)
        }
    }
}