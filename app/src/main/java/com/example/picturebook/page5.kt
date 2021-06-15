package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        var btnlast=findViewById<Button>(R.id.btnlast)
        btnlast.setOnClickListener{
            var intent= Intent(baseContext,Page4::class.java)
            startActivity(intent)
        }
    }
}