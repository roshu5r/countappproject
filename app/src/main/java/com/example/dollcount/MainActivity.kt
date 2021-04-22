package com.example.dollcount
//importing necessary libraries

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.view.View

import android.widget.Button

import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal var minteger = 0 //declaring and initialising count on number variable named minteger

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val plus = findViewById<Button>(R.id.increase) //object of button increase

        val minus = findViewById<Button>(R.id.decrease) //object of button decrease


        //on click the below function will work which will call function increaseInteger()

        plus.setOnClickListener {

            increaseInteger(plus)

        }

        //on click the below function will work which will call function decreaseInteger()

        minus.setOnClickListener {

            decreaseInteger(minus)

        }

    }

    // increaseInteger() will increase count of number

    fun increaseInteger(view: View) {

        if (minteger < 25) {

            minteger += 1

        }

        display(minteger)

    }


    // decreaseInteger() which will decrease count of number

    fun decreaseInteger(view: View) {

        if (minteger > 0) {

            minteger -= 1

        }

        display(minteger)

    }

    //below function will display count of number with error

    private fun display(number: Int) {

        //below if statement will print count of number in range 0 to 25

        if (number <= 25) {

            val displayInteger = findViewById<View>( R.id.integer_number) as TextView
            val displayTotal = findViewById(R.id.text1) as TextView
            displayInteger.text = "" + number
            displayTotal.text = "Total Number of People: "+number

        }

        //below if else statement will print error if count = 25

        if (number >= 25) {

            val displayInteger = findViewById<View>( R.id.text ) as TextView

            displayInteger.text = "Limit Exceeded"

        } else {

            val displayInteger = findViewById<View>(

                    R.id.text

            ) as TextView

            displayInteger.text = ""

        }

    }

}
