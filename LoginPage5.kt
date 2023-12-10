package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class LoginPage5 : AppCompatActivity() {
    private lateinit var buttonNextPage: ImageButton
    private lateinit var buttonPage2: Button
    private lateinit var buttonPage3: Button
    private lateinit var buttonPage4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page5)

        buttonNextPage = findViewById(R.id.bNext)
        buttonNextPage.setOnClickListener {
//            val i = Intent(this@LoginPage5, Registration::class.java)
//            startActivity(i)i
        }

        buttonPage2 = findViewById(R.id.bLoginPage3)
        buttonPage2.setOnClickListener{
            val i = Intent(this@LoginPage5, LoginPage2::class.java)
            startActivity(i)
        }

        buttonPage3 = findViewById(R.id.bLoginPage4)
        buttonPage3.setOnClickListener{
            val i = Intent(this@LoginPage5, LoginPage3::class.java)
            startActivity(i)
        }

        buttonPage4 = findViewById(R.id.bLoginPage5)
        buttonPage4.setOnClickListener{
            val i = Intent(this@LoginPage5, LoginPage4::class.java)
            startActivity(i)
        }
    }
}