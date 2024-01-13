package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //return
        Calculator()
    }

    fun Calculator(){

        //declared the element are used in the activity
        var num1 = findViewById<EditText>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var addbutton = findViewById<Button>(R.id.addButton)
        var subbutton = findViewById<Button>(R.id.subButton)
        var multiplyButton = findViewById<Button>(R.id.multiplyButton)
        var divbutton = findViewById<Button>(R.id.divButton)
        var clearbutton = findViewById<Button>(R.id.clearButton)
        var resultView = findViewById<TextView>(R.id.result)

        addbutton.setOnClickListener {
            var addnumber1 = num1.text.toString().toIntOrNull() ?: 0
            var addnumber2 = num2.text.toString().toIntOrNull() ?: 0
            var result = addnumber1  + addnumber2
            resultView.text = result.toString()
//          Toast.makeText(this, "The Number is :  $resultC", Toast.LENGTH_SHORT).show()
        }

        subbutton.setOnClickListener {
            var subButton1 = num1.text.toString().toIntOrNull() ?: 0
            var subButton2 = num2.text.toString().toIntOrNull() ?: 0
            var result = subButton1  - subButton2
            resultView.text = result.toString()
//          Toast.makeText(this, "The Number is :  $result", Toast.LENGTH_SHORT).show()
        }

        multiplyButton.setOnClickListener {
            var multiButton1 = num1.text.toString().toIntOrNull() ?: 0
            var multiButton2 = num2.text.toString().toIntOrNull() ?: 0
            var result = multiButton1  * multiButton2
            resultView.text = result.toString()
//          Toast.makeText(this, "The Number is :  $result", Toast.LENGTH_SHORT).show()
        }

        divbutton.setOnClickListener {
            var divButton1 = num1.text.toString().toIntOrNull() ?: 0
            var divButton2 = num2.text.toString().toIntOrNull() ?: 0
            var result = divButton1  / divButton2
            resultView.text = result.toString()
//          Toast.makeText(this, "The Number is :  $result", Toast.LENGTH_SHORT).show()
        }

        clearbutton.setOnClickListener {
            try {
                // Clear the text in resultView and EditText views
                resultView.text = "0"
                num1.text.clear()
                num2.text.clear()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}