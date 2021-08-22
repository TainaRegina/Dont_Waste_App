package com.example.projeto_dont_waste.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.projeto_dont_waste.R
import kotlin.concurrent.fixedRateTimer

class SplashFragment : Fragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.splash_fragment, container, false)

    }

    override fun onResume() {
        super.onResume()
        Handler(Looper.myLooper()!!).postDelayed({

            enterTransition.apply {
                HomeNaoLogadaFragment
            }
        },5000)

    }

}