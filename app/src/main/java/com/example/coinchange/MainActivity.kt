package com.example.coinchange

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.floor

class MainActivity : AppCompatActivity() {
    private var userInput:String = ""
    private var  output : Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputLine: TextView = findViewById(R.id.textViewInput)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val btn5: Button = findViewById(R.id.button5)
        val btn6: Button = findViewById(R.id.button6)
        val btn7: Button = findViewById(R.id.button7)
        val btn9: Button = findViewById(R.id.button9)
        val btn8: Button = findViewById(R.id.button8)
        val btn0: Button = findViewById(R.id.button0)
        val btnClear: Button = findViewById(R.id.buttonClear)
        val txt500: TextView = findViewById(R.id.textView500)
        val txt200: TextView = findViewById(R.id.textView200)
        val txt100: TextView = findViewById(R.id.textView100)
        val txt50: TextView = findViewById(R.id.textView50)
        val txt20: TextView = findViewById(R.id.textView20)
        val txt10: TextView = findViewById(R.id.textView10)
        val txt5: TextView = findViewById(R.id.textView5)
        val txt2: TextView = findViewById(R.id.textView2)
        val txt1: TextView = findViewById(R.id.textView1)
        btn1.setOnClickListener { buttonClick(b1 = true, b2 = false, b3=false, b4 =false, b5 = false, b6 = false, b7 = false, b8= false, b9 = false, b10 = false, b11 =false, input = inputLine );calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1) }
        btn2.setOnClickListener { buttonClick(b1 = false, b2 = true, b3=false, b4 =false, b5 = false, b6 = false, b7 = false, b8= false, b9 = false, b10 = false, b11 =false, input = inputLine ) ;calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1)}
        btn3.setOnClickListener { buttonClick(b1 = false, b2 = false, b3=true, b4 =false, b5 = false, b6 = false, b7 = false, b8= false, b9 = false, b10 = false, b11 =false, input = inputLine ) ;calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1)}
        btn4.setOnClickListener { buttonClick(b1 = false, b2 = false, b3=false, b4 =true, b5 = false, b6 = false, b7 = false, b8= false, b9 = false, b10 = false, b11 =false, input = inputLine ) ;calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1)}
        btn5.setOnClickListener { buttonClick(b1 = false, b2 = false, b3=false, b4 =false, b5 = true ,b6= false, b7 = false, b8= false, b9 = false, b10 = false, b11 =false, input = inputLine ) ;calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1)}
        btn6.setOnClickListener { buttonClick(b1 = false, b2 = false, b3=false, b4 =false, b5 = false, b6 = true, b7 = false, b8= false, b9 = false, b10 = false, b11 =false, input = inputLine );calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1) }
        btn7.setOnClickListener { buttonClick(b1 = false, b2 = false, b3=false, b4 =false, b5 = false, b6 = false, b7 = true, b8= false, b9 = false, b10 = false, b11 =false, input = inputLine ) ;calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1)}
        btn8.setOnClickListener { buttonClick(b1 = false, b2 = false, b3=false, b4 =false, b5 = false, b6 = false, b7 = false, b8= true, b9 = false, b10 = false, b11 =false, input = inputLine ) ;calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1)}
        btn9.setOnClickListener { buttonClick(b1 = false, b2 = false, b3=false, b4 =false, b5 = false, b6 = false, b7 = false, b8= false, b9 = true, b10 = false, b11 =false, input = inputLine ) ;calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1)}
        btn0.setOnClickListener { buttonClick(b1 = false, b2 = false, b3=false, b4 =false, b5 = false, b6 = false, b7 = false, b8= false, b9 = false, b10 = true, b11 =false, input = inputLine ) ;calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1)}
        btnClear.setOnClickListener { buttonClick(b1 = false, b2 = false, b3=false, b4 =false, b5 = false, b6 = false, b7 = false, b8= false, b9 = false, b10 = false, b11 =true, input = inputLine ) ;calculate(txt500,txt200,txt100,txt50,txt20,txt10,txt5,txt2,txt1)}
    }
    @SuppressLint("SetTextI18n")
    fun buttonClick(b1:Boolean, b2:Boolean, b3:Boolean, b4:Boolean, b5:Boolean, b6:Boolean, b7:Boolean, b8:Boolean, b9:Boolean, b10:Boolean, b11:Boolean, input:TextView) {
        if (b1){
            userInput += "1"
            input.text = "Taka: $userInput"
        }
        else if(b2){
            userInput += "2"
            input.text = "Taka: $userInput"
        }
        else if(b3) {
            userInput += "3"
            input.text = "Taka: $userInput"
        }
        else if(b4) {
            userInput += "4"
            input.text = "Taka: $userInput"
        }
        else if(b5) {
            userInput += "5"
            input.text = "Taka: $userInput"
        }
        else if(b6) {
            userInput += "6"
            input.text = "Taka: $userInput"
        }
        else if(b7) {
            userInput += "7"
            input.text = "Taka: $userInput"
        }
        else if(b8) {
            userInput += "8"
            input.text = "Taka: $userInput"
        }
        else if(b9) {
            userInput += "9"
            input.text = "Taka: $userInput"
        }
        else if(b10) {
            userInput += "10"
            input.text = "Taka: $userInput"
        }
        else{
            userInput = ""
            input.text = "Taka: $userInput"
        }
    }
    @SuppressLint("SetTextI18n")
    private fun calculate(
        txt1: TextView,
        txt2: TextView,
        txt3: TextView,
        txt4: TextView,
        txt5: TextView,
        txt6: TextView,
        txt7: TextView,
        txt8: TextView,
        txt9: TextView,
    ){
        output = userInput.toDouble()
        if(output>=500){
            txt1.text ="500: "+ floor(output/500).toString().substringBefore(delimiter = ".")
            output -= (floor(output/500)*500)
        }
        if(output>=200){
            txt2.text ="200: "+ floor(output/200).toString().substringBefore(".")
            output-= floor(output/200)*200
        }
        if(output>=100){
            txt3.text ="100: "+ floor(output/100).toString().substringBefore(".")
            output-= floor(output/100)*100
        }
        if(output>=50){
            txt4.text ="50: "+ floor(output/50).toString().substringBefore(".")
            output-= floor(output/50)*50
        }
        if(output>=20){
            txt5.text ="20: "+ floor(output/20).toString().substringBefore(".")
            output-= floor(output/20)*20
        }
        if(output>=10){
            txt6.text ="10: "+ floor(output/10).toString().substringBefore(".")
            output-= floor(output/10)*10
        }
        if(output>=5){
            txt7.text ="5: "+ floor(output/5).toString().substringBefore(".")
            output-= floor(output/5)*5
        }
        if(output>=2){
            txt8.text ="2: "+ floor(output/2).toString().substringBefore(".")
            output-= floor(output/2)*2
        }
        if(output>=1){
            txt9.text = "1: " +floor(output/1).toString().substringBefore(".")
            output-= floor(output/1)*1
        }
    }
}




