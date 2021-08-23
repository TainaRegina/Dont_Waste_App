package com.example.projeto_dont_waste.viewmodel

import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.fragment.HomeNaoLogadaFragment
import com.example.projeto_dont_waste.fragment.LoginFragment

class HomeNaoLogadaViewModel : ViewModel() {
    private lateinit var fragmentManager: FragmentManager

    private val _buttonPrimeiroAcesso = MutableLiveData<AppCompatButton>()
    val buttonPrimeiroAcesso: LiveData<AppCompatButton>
        get() = _buttonPrimeiroAcesso

    private val _buttonLogin = MutableLiveData<AppCompatButton>()
    val buttonLogin: LiveData<AppCompatButton>
        get() = _buttonLogin

    fun onClickTelaHome() {
        fragmentManager.beginTransaction()
            .replace(R.id.container_fragment, HomeNaoLogadaFragment()).commit()
    }
    fun onClickTelaLogin() {
        fragmentManager.beginTransaction()
            .replace(R.id.container_fragment, LoginFragment()).commit()
    }

    override fun onCleared() {
        super.onCleared()
    }


}