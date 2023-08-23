package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAbrirActivity = findViewById<Button>(R.id.login)
        btnAbrirActivity.setOnClickListener {
            val i = Intent(this,Home::class.java)//this quer sdizer que ess aagora vai chamar outra
            startActivity(i)
        }
    }
}