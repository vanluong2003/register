package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val registerBtn: Button = findViewById(R.id.button)
        val checkBox: CheckBox= findViewById(R.id.checkBox)
        registerBtn.setOnClickListener {
            if(checkBox.isChecked){
                val toast = Toast.makeText(this, "Success!", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}