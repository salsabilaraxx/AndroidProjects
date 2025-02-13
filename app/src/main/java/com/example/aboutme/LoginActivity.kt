package com.example.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.aboutme.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        setup()
    }

    private fun setup() {
        binding.btnLogin.setOnClickListener{
            if(binding.etUsername.text.toString() == "rrsty" && binding.etPassword.text.toString() == "sls") {
                Toast.makeText(this@LoginActivity, "Login Sukses", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                Toast.makeText(this@LoginActivity, "Login Gagal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}