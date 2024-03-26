package com.example.lab_1_first_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ServiceActivity : AppCompatActivity() {
    private lateinit var backButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_service)

        val buttonSingout: Button = findViewById(R.id.btn_loggaUt)

        buttonSingout.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))

        }

        backButton = findViewById(R.id.btn_back2)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}