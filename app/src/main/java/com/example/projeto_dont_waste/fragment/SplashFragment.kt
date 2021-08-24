package com.example.projeto_dont_waste.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.HomeNaoLogadaFragmentBinding
import com.example.projeto_dont_waste.databinding.SplashFragmentBinding
import com.example.projeto_dont_waste.viewmodel.LoginViewModel
import com.example.projeto_dont_waste.viewmodel.SplashViewModel
import kotlin.concurrent.fixedRateTimer

class SplashFragment : Fragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }
    private lateinit var binding: SplashFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        binding = DataBindingUtil.inflate(inflater,R.layout.splash_fragment,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.myLooper()!!).postDelayed({
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.container_fragment,HomeNaoLogadaFragment())
                .commit()
        },5000)


    }

}