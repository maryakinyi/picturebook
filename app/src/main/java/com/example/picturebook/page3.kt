package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        var btnbutton=findViewById<Button>(R.id.btnPage3)
        btnbutton.setOnClickListener{
            var intent= Intent(baseContext,Page4::class.java)
            startActivity(intent)
        }
        var btnNextPage=findViewById<Button>(R.id.btnprev)
        btnNextPage=findViewById(R.id.btnprev)
        btnNextPage.setOnClickListener {
            var intent=Intent(baseContext,NextPage::class.java)
            startActivity(intent)
        }

    }
}