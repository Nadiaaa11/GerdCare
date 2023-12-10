package com.example.alarmpage

import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayout

class AlarmAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarm)

        lateinit var imageButton: ImageButton

        imageButton = findViewById(R.id.edit1) as ImageButton

        imageButton.setOnClickListener {
            onEditAlarmButtonClick()
        }
    }

    private fun onEditAlarmButtonClick() {
        val intent = Intent(this, AddAlarmAct::class.java)
        startActivity(intent)
    }
}