package com.example.projeto_dont_waste.viewmodel

import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.fragment.CadastroFragment
import com.example.projeto_dont_waste.fragment.HomeNaoLogadaFragment
import com.example.projeto_dont_waste.fragment.LoginFragment
import com.example.projeto_dont_waste.fragment.SegundaTelaCadastroFragment

class HomeNaoLogadaViewModel(private val fragmentManager : FragmentManager) : ViewModel() {



    private val _buttonPrimeiroAcesso = MutableLiveData<AppCompatButton ?>()
    val buttonPrimeiroAcesso: LiveData<AppCompatButton ?> = _buttonPrimeiroAcesso
       // get() = buttonPrimeiroAcesso

    private val _buttonLogin = MutableLiveData<AppCompatButton?>()
    val buttonLogin: LiveData<AppCompatButton?> = _buttonLogin
       // get() = _buttonLogin

    fun onClickTelaCadastro() {
            fragmentManager
                .beginTransaction()
                .addToBackStack("Cadastro")
                .replace(R.id.activity_container, CadastroFragment())
                .commit()
        }


    fun onClickTelaLogin() {
        fragmentManager
            .beginTransaction()
            .addToBackStack("Login")
            .replace(R.id.activity_container, LoginFragment())
            .commit()
    }

    override fun onCleared() {
        super.onCleared()
    }


}
