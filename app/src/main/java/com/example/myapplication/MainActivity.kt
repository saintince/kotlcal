package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rtrr)

        val myText = findViewById<TextView>(R.id.textView)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button19 = findViewById<Button>(R.id.button19)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)
        val button12 = findViewById<Button>(R.id.button12)
        val button13 = findViewById<Button>(R.id.button13)
        val button14 = findViewById<Button>(R.id.button14)
        val button15 = findViewById<Button>(R.id.button15)
        val button16 = findViewById<Button>(R.id.button16)
        val button17 = findViewById<Button>(R.id.button17)
        val button18 = findViewById<Button>(R.id.button18)
        val button1 = findViewById<Button>(R.id.button1)



        button2.setOnClickListener {
            val text: String = myText.text.toString()
            android.util.Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "1"
        }

        button1.setOnClickListener {
            myText.text = ""

        }

        button3.setOnClickListener {
            val text: String = myText.text.toString()
            android.util.Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "2"
        }

        button4.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "3"
        }

        button19.setOnClickListener {
            val text: String = myText.text.toString()
            try {
                val result = eval(text)
                myText.text = result.toString()
            } catch (e: Exception){
                myText.text = "Ошибка"
            }
        }

        button8.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "4"
        }

        button9.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "5"
        }

        button10.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "6"
        }

        button11.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "7"
        }

        button12.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "8"
        }

        button13.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "9"
        }

        button14.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "0"
        }

        button15.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "+"
        }

        button16.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "-"
        }

        button17.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "*"
        }

        button18.setOnClickListener {
            val text: String = myText.text.toString()
            Log.d("TextViewContent", "Текст в TextView: $text")
            myText.text = text + "/"
        }




    }

    fun eval(expr: String): Double {
        val regex = Regex("""(-?\d+(?:\.\d+)?)([+\-*/])(-?\d+(?:\.\d+)?)""")
        val matchResult = regex.matchEntire(expr.replace(" ", ""))
        if (matchResult != null) {
            val (left, op, right) = matchResult.destructured
            val a = left.toDouble()
            val b = right.toDouble()
            return when (op) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                "/" -> a / b
                else -> throw IllegalArgumentException("Unknown operator")
            }
        } else {
            throw IllegalArgumentException("Invalid expression")
        }
    }






}
