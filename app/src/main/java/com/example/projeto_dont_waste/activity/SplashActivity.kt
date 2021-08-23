package com.example.projeto_dont_waste.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.projeto_dont_waste.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.myLooper()!!).postDelayed({
            Intent(this, ContainerActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        },3000)

    }
}