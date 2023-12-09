package com.example.medicinereminder

import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var imageButton: ImageButton

        imageButton = findViewById(R.id.bPlus) as ImageButton

        imageButton.setOnClickListener {
            openActivity2()
        }
        bottomNavBar();
    }
    fun openActivity2() {
        val intent = Intent(this, AddMedicineReminder::class.java)
        startActivity(intent)
    }

    private fun bottomNavBar() {
        val tabLayout: TabLayout = findViewById(R.id.bottom_navbar_menu)
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.document), 0)
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.home), 1)
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.profile), 2)

        tabLayout.getTabAt(0)?.icon?.setColorFilter(
            ContextCompat.getColor(this, R.color.gray),
            PorterDuff.Mode.SRC_IN
        )
        tabLayout.getTabAt(1)?.icon?.setColorFilter(
            ContextCompat.getColor(this, R.color.pink),
            PorterDuff.Mode.SRC_IN
        )
        tabLayout.getTabAt(2)?.icon?.setColorFilter(
            ContextCompat.getColor(this, R.color.gray),
            PorterDuff.Mode.SRC_IN
        )
    }
}



