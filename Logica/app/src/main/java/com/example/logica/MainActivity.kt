package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        btnSubmit.setOnClickListener {
            checkAnswers()
        }
    }

    private fun checkAnswers() {
        var result = true
        if (txtField1.text.toString() != "T") result = false
        if (txtField2.text.toString() != "F") result = false
        if (txtField3.text.toString() != "F") result = false
        if (txtField4.text.toString() != "F") result = false

        val textToShow = if (result) "Correct!"
        else "Not correct..."

        Toast.makeText(this, textToShow, Toast.LENGTH_SHORT).show()
    }


}
