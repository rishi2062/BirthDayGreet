package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.greetButton)
        button.setOnClickListener{
            val textEdit : EditText = findViewById(R.id.inputText)
            val name = textEdit.editableText.toString()
            val intent = Intent(this,BirthdayCard::class.java)
            intent.putExtra(BirthdayCard.Name,name)
            startActivity(intent)
        }


    }
}