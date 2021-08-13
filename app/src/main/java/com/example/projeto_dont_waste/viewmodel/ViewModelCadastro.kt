package com.example.projeto_dont_waste.viewmodel

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.projeto_dont_waste.activity.HomeNaoLogadaActivity
import com.example.projeto_dont_waste.databinding.ActivityCadastroBinding


class ViewModelCadastro : ViewModel() {

    private lateinit var binding: ActivityCadastroBinding


    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    private val _senha = MutableLiveData<String>()
    val senha: MutableLiveData<String> = _senha





        }







