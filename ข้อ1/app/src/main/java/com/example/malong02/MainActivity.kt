package com.example.malong02

import android.R.attr
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.R.attr.x


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tw6.setText("")


        //  Toast.makeText(applicationContext,"this is toast message",Toast.LENGTH_SHORT).show()
        bt1.setOnClickListener {
            var num1 = edt1.text
            var num2 = edt2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "") {
                Toast.makeText(applicationContext, "Please Input Num1 and Num2", Toast.LENGTH_SHORT)
                    .show()
            } else {
                tw6.setText("+")
                num3 = (num1.toString().toInt() + num2.toString().toInt())
                tw7.setText(num3.toDouble().toString())
            }


        }
        bt.setOnClickListener {
            var num1 = edt1.text
            var num2 = edt2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "") {
                Toast.makeText(applicationContext, "Please Input Num1 and Num2", Toast.LENGTH_SHORT)
                    .show()
            } else {
                tw6.setText("-")
                num3 = (num1.toString().toInt() - num2.toString().toInt())
                tw7.setText(num3.toDouble().toString())
            }
        }
        bt2.setOnClickListener {
            var num1 = edt1.text
            var num2 = edt2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "") {
                Toast.makeText(applicationContext, "Please Input Num1 and Num2", Toast.LENGTH_SHORT)
                    .show()
            } else {
                tw6.setText("x")
                num3 = (num1.toString().toInt() * num2.toString().toInt())
                tw7.setText(num3.toDouble().toString())
            }
        }
        bt3.setOnClickListener {
            var num1 = edt1.text
            var num2 = edt2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "") {
                Toast.makeText(applicationContext, "Please Input Num1 and Num2", Toast.LENGTH_SHORT)
                    .show()
            } else {
                tw6.setText("÷")
                num3 = (num1.toString().toInt() / num2.toString().toInt())
                tw7.setText(num3.toDouble().toString())
            }
        }
        bt4.setOnClickListener {
            var num1 = edt1.text
            var num2 = edt2.text
            var num3: Int
            if (num1.toString() == "" || num2.toString() == "" || num2.toString() == "0") {
                Toast.makeText(
                    applicationContext,
                    "Do Not Num2 is Zero or Null!!!",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                tw6.setText("mod")
                num3 = (num1.toString().toInt() % num2.toString().toInt())
                tw7.setText(num3.toDouble().toString())
            }
        }
        bt5.setOnClickListener {
            var num1 = edt1.text
            var num2 = edt2.text
            var num3: Int
            num1.clear()
            num2.clear()
            edt1.setText("")
            edt2.setText("")
            tw7.setText("")
            tw6.setText("")
        }


    }
}





