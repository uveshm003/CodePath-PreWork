package com.example.helloworldprework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btnHello)
        btn.setOnClickListener{
            Toast.makeText(this,"Hello to you too!",Toast.LENGTH_LONG).show()
        }
    }
}