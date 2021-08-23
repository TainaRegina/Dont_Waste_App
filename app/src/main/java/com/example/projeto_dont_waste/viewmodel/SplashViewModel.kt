package com.example.projeto_dont_waste.viewmodel

import android.os.Looper
import androidx.lifecycle.ViewModel
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.fragment.HomeNaoLogadaFragment
import java.util.logging.Handler
import javax.net.ssl.HandshakeCompletedEvent

class SplashViewModel : ViewModel() {
    fun trocando(){
        android.os.Handler(Looper.myLooper()!!).postDelayed({


        },5000)
    }
}