package com.example.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.mykotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //initialize variables and views through binding
    lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set OnClickListeners for each button
        binding.btnAdd.setOnClickListener(this)
        binding.btnSub.setOnClickListener(this)
        binding.btnMul.setOnClickListener(this)
        binding.btnDiv.setOnClickListener(this)
    }
    //adding button functionality for each math operation button
    override fun onClick(v: View?) {
        //grabbing a and b values from xml file
        var a = binding.etA.text.toString().toDouble()
        var b = binding.etB.text.toString().toDouble()
        var result = 0.0
        //if v isn't null execute code
        when(v?.id){
            R.id.btn_add -> {
                result = a + b
            }
            R.id.btn_sub -> {
                result = a - b
            }
            R.id.btn_mul -> {
                result = a * b
            }
            R.id.btn_div -> {
                result = a / b
            }
        }
        //assining result value
        binding.resultTv.text = "Result is $result"
    }
}
