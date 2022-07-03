package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayCard : AppCompatActivity() {
    companion object{
        const val Name = "name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)
        val name = intent?.extras?.getString(Name)
        val textView : TextView = findViewById(R.id.textView)
        textView.text = "Happy Birthday\n $name!"
    }
}