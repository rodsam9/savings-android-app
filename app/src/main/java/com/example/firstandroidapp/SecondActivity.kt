package com.example.firstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.firstandroidapp.databinding.ActivityMainBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Set the go back button to backButton, by looking up it's id.
        val backButton: Button = findViewById(R.id.backButton);

        // Set up intent in order to display contents from income input into second screen.
        val intentValue = intent.getStringExtra("income")
        findViewById<TextView>(R.id.receivedIncomeNum).apply {
            text = intentValue.toString()
        }

        // Set up a new intent in order to display contents from income input * 50% into second screen.
        val intentValue2 = intent.getStringExtra("needs")

        // Find id needs and turn it into a string. Then display.
        findViewById<TextView>(R.id.needs_output).apply {
            text = intentValue2.toString()
        }

        // Set up a new intent in order to display contents from income input * 30% into second screen.
        val intentValue3 = intent.getStringExtra("wants")

        // Find id wants and turn it into a string. Then display.
        findViewById<TextView>(R.id.wants_output).apply {
            text = intentValue3.toString()
        }

        // Set up a new intent in order to display contents from income input * 20% into second screen.
        val intentValue4 = intent.getStringExtra("savings")

        // Find id savings and turn it into a string. Then display.
        findViewById<TextView>(R.id.savings_output).apply {
            text = intentValue4.toString()
        }

        // When go back button is clicked.
        backButton.setOnClickListener {

            // Set up new intent that will direct us to main activity (first page) when button clicked.
            val intent = Intent(this, MainActivity::class.java)

            // Run the intent
            startActivity(intent)
        }

    }
}