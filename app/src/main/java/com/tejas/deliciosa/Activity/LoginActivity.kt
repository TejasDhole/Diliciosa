package com.tejas.deliciosa.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.tejas.deliciosa.R


class LoginActivity : AppCompatActivity() {
    // intialising variable
lateinit var etEmail: EditText
lateinit var etPassword : EditText
lateinit var btnLogin : Button
lateinit var txtForgetPassword : TextView
lateinit var txtRegisterYourself : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Gin=ving Id to variable
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgetPassword = findViewById(R.id.txtForgetPassword)
        txtRegisterYourself = findViewById(R.id.txtRegisterYourself)

        btnLogin.setOnClickListener{
            startActivity(Intent(this@LoginActivity,MainActivity::class.java))
        }

        txtRegisterYourself.setOnClickListener {
            startActivity(Intent(this@LoginActivity,RegisterUser::class.java))
        }

        txtForgetPassword.setOnClickListener {
            startActivity(Intent(this@LoginActivity,ForgetpasswordActivity::class.java))
        }



    }
}