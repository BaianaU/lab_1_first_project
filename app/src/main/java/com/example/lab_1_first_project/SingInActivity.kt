package com.example.lab_1_first_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SingInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)

        val userLogin: EditText = findViewById(R.id.et_username)
        val userEmail: EditText = findViewById(R.id.et_user_email)
        val userPass: EditText = findViewById(R.id.et_user_pass)
        val buttonRegister: Button = findViewById(R.id.btn_reg)

        buttonRegister.setOnClickListener{
            startActivity(Intent(this, AboutActivity::class.java))

        }

        buttonRegister.setOnClickListener {
            val username = userLogin.text.toString()
            val useremail = userEmail.text.toString()
            val password = userPass.text.toString()

            if (isValidCredentials(username,useremail,password)) {
                val intent = Intent(this, ServiceActivity::class.java)
                intent.putExtra("USERNAME", username)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidCredentials(username: String,useremail:String, password: String): Boolean {
        val validUsername = "user"
        val validPassword = "password"

        return username == validUsername && password == validPassword
    }
}