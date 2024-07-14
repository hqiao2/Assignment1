package com.example.views

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Content1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content1)

        val buttonBackToMain: Button = findViewById(R.id.buttonBackToMain)
        buttonBackToMain.setOnClickListener {
            onBackPressed() // Or navigate to MainActivity explicitly
        }
    }

}