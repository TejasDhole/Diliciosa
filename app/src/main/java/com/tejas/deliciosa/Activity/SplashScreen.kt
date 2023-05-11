package com.tejas.deliciosa.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.tejas.deliciosa.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
            setContentView(R.layout.splash_screen)


            Handler().postDelayed({

                val i = Intent(
                    this@SplashScreen,
                    LoginActivity::class.java
                )

                startActivity(i)


                finish()
            }, 2000)
        }
    }
