package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bt1.setOnClickListener {
            var arr = arrayOf(
                edt6.text,
                edt7.text,
                edt8.text,
                edt9.text,
                edt10.text
            )
            if (arr[0].toString() == "" || arr[1].toString() == "" || arr[2].toString() == "" || arr[3].toString() == "" || arr[4].toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "Please Input Credit ",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                if (arr[0].toString().toInt() < 4 && arr[1].toString()
                        .toInt() < 4 && arr[2].toString()
                        .toInt() < 4 && arr[3].toString().toInt() < 4 && arr[4].toString()
                        .toInt() < 4
                ) {
                    var num =
                        (arr[0].toString().toInt() + arr[1].toString().toInt() + arr[2].toString()
                            .toInt() + arr[3].toString().toInt() + arr[4].toString().toInt())
                    tv1.setText(num.toString())
                } else {
                    Toast.makeText(
                        applicationContext,
                        "Please Input Credit < 3",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            var arr1 = arrayOf(
                edt11.text,
                edt12.text,
                edt13.text,
                edt14.text,
                edt15.text
            )
            if (arr1[0].toString() == "" || arr1[1].toString() == "" || arr1[2].toString() == "" || arr1[3].toString() == "" || arr1[4].toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "Please Input GPA ",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                var num2 = ((arr1[0].toString().toDouble() * arr[0].toString().toDouble()) +
                        (arr1[1].toString().toDouble() * arr[1].toString().toDouble()) +
                        (arr1[2].toString().toDouble() * arr[2].toString().toDouble()) +
                        (arr1[3].toString().toDouble() * arr[3].toString().toDouble()) +
                        (arr1[4].toString().toDouble() * arr[4].toString().toDouble())
                        )


                var num1 =
                    (arr[0].toString().toInt() + arr[1].toString().toInt() + arr[2].toString()
                        .toInt() + arr[3].toString().toInt() + arr[4].toString().toInt())

                var num3 = (num2.toDouble() / num1.toDouble())


                val df = DecimalFormat("#.##")
                df.roundingMode = RoundingMode.CEILING
                tv2.setText(df.format(num3))


            }

        }

        bt2.setOnClickListener {
            edt1.setText("")
            edt2.setText("")
            edt3.setText("")
            edt4.setText("")
            edt5.setText("")
            edt6.setText("")
            edt7.setText("")
            edt8.setText("")
            edt9.setText("")
            edt10.setText("")
            edt11.setText("")
            edt12.setText("")
            edt13.setText("")
            edt14.setText("")
            edt15.setText("")
            tv1.setText("")
            tv2.setText("")
        }


    }
}