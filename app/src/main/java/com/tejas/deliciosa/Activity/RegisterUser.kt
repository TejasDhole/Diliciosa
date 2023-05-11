package com.tejas.deliciosa.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tejas.deliciosa.R

class RegisterUser : AppCompatActivity() {
    lateinit var btnregister : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        btnregister = findViewById(R.id.btnregister)

        btnregister.setOnClickListener{
            startActivity(Intent(this@RegisterUser,LoginActivity::class.java))
        }
        
    }
}