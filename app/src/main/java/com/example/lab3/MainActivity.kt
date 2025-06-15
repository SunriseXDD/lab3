package com.example.lab3

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputString = findViewById<EditText>(R.id.inputString)
        val inputChar = findViewById<EditText>(R.id.inputChar)
        val searchButton = findViewById<Button>(R.id.searchButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        searchButton.setOnClickListener {
            val str = inputString.text.toString()
            val charToFind = inputChar.text.toString()

            //обращение через переменную str
            val lastIndexByName = str.indexOfLast { it == charToFind[0] }
            //обращение по индексу
            val lastIndexByAddress = inputString.text.toString().indexOfLast { it == charToFind[0] }
        }
    }
}


