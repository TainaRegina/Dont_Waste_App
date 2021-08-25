package com.example.projeto_dont_waste.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.fragment.SplashFragment

class ContainerActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_container)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.container_fragment,SplashFragment())
            .addToBackStack("container").commit()

    }
}