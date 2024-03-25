package com.example.lab_1_first_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSingIn: Button = findViewById(R.id.btn_sing_in)
        val buttonAbout: Button = findViewById(R.id.btn_about)
        val buttonMember:Button = findViewById(R.id.btn_already_member)

        buttonSingIn.setOnClickListener {
            startActivity(Intent(this, SingInActivity::class.java))

        }

        buttonAbout.setOnClickListener{
            startActivity(Intent(this, AboutActivity::class.java))

        }

        buttonMember.setOnClickListener{
            startActivity(Intent(this, ServiceActivity::class.java))

        }
    }
}