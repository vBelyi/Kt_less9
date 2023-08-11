package com.example.kt_less9

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        var counter = 3
        val buttonPlus:Button = findViewById(R.id.plusButton)
        val buttonMinus:Button = findViewById(R.id.minusButton)
        buttonPlus.setOnClickListener {
            counter ++
            val toast = Toast.makeText(this, "${counter}", Toast.LENGTH_SHORT)
            toast.show()
            if (counter < 1) {
                val toast2 = Toast.makeText(this, "!!!Number is less then 1", Toast.LENGTH_SHORT)
                toast2.show()
            }
        }
        buttonMinus.setOnClickListener {
            counter --
            val toast = Toast.makeText(this, "${counter}", Toast.LENGTH_SHORT)
            toast.show()
            if (counter < 1) {
                val toast2 = Toast.makeText(this,"!!!Number is less then 1", Toast.LENGTH_SHORT)
                toast2.show()
            }
        }
    }
}