package com.example.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import com.example.firstandroidapp.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {

    lateinit var editIncomeNumber: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Display first activity (main screen)
        setContentView(R.layout.activity_main)

        // Pull id for the main go button.
        val buttonMain: Button = findViewById(R.id.buttonMain)

        // This pulls the input box for income by special id editIncomeNumber.
        editIncomeNumber = findViewById(R.id.editIncomeNumber)

        buttonMain.setOnClickListener {
            // This will get incomenumber input and multiply it by 50% to get needs value.
            var needs = Integer.valueOf(editIncomeNumber.getText().toString()) * .5

            // This will get incomenumber input and multiply it by 30% to get wants value.
            var wants = Integer.valueOf(editIncomeNumber.getText().toString()) * .3

            // This will get incomenumber input and multiply it by 20% to get savings value.
            var savings = Integer.valueOf(editIncomeNumber.getText().toString()) * .2

            // Create an intent in order to switch to second activity(second screen)
            val intent = Intent(this, SecondActivity::class.java).apply {

                // Whatever value I have in income will turn to text form.
                putExtra("income", editIncomeNumber.text.toString())

                // Whatever value I have in needs will turn to text form.
                putExtra("needs", needs.toInt().toString())

                // Whatever value I have in wants will turn to text form.
                putExtra("wants", wants.toInt().toString())

                // Whatever value I have in savings will turn to text form.
                putExtra("savings", savings.toInt().toString())
            }
            // Run the intent
            startActivity(intent)
        }
    }
}
