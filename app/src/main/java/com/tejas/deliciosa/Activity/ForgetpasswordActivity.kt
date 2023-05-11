package com.tejas.deliciosa.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tejas.deliciosa.R

class ForgetpasswordActivity : AppCompatActivity(){
    lateinit var btnsubmit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgetpassword)

        btnsubmit = findViewById(R.id.btnsubmit)

        btnsubmit.setOnClickListener{
            startActivity(Intent(this@ForgetpasswordActivity,LoginActivity::class.java))
        }

    }
}