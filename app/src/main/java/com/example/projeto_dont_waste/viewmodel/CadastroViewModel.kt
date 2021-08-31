package com.example.projeto_dont_waste.viewmodel
<<<<<<< HEAD



import android.media.metrics.Event
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.widget.AppCompatButton
=======
import android.content.Context
import android.content.Intent
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.BindingAdapter
>>>>>>> feature_fragmentSegundaTela
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
<<<<<<< HEAD
import androidx.lifecycle.viewModelScope
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.fragment.HomeNaoLogadaFragment
import com.example.projeto_dont_waste.fragment.SegundaTelaCadastroFragment
import com.example.projeto_dont_waste.model.Cadastro
import kotlinx.coroutines.launch


class CadastroViewModel(private val fragmentManager: FragmentManager) : ViewModel()







=======
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.fragment.HomeNaoLogadaFragment
import com.example.projeto_dont_waste.fragment.LoginFragment
import com.example.projeto_dont_waste.fragment.SegundaTelaCadastroFragment
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class CadastroViewModel(private val fragmentManager: FragmentManager) : ViewModel() {
    private val _email = MutableLiveData<String>()
    val email: LiveData<String>
        get() = _email
    private val _senha = MutableLiveData<Int>()
    val senha: LiveData<Int>
        get() = _senha
    private val _botaoVoltarHome = MutableLiveData<AppCompatImageView>()
    val botaoVoltarHome: LiveData<AppCompatImageView>
        get() = _botaoVoltarHome
    private val _botaoAjudaSenha = MutableLiveData<AppCompatImageView>()
    val botaoAjudaSenha: LiveData<AppCompatImageView>
        get() = _botaoAjudaSenha
    private val _botaoProximo = MutableLiveData<AppCompatButton>()
    val botaoProximo: LiveData<AppCompatButton>
        get() = _botaoProximo
    init {
        _email.value = ""
        _senha.value = 111111
    }
    fun clickProximo(context: Context) {
        when {
            TextUtils.isEmpty(_email.value.toString().trim { it <= ' ' }) -> {
                exibindoMenssagemEmail(context).show()
            }
            TextUtils.isEmpty(_senha.value.toString().trim { it <= ' ' }) -> {
                exibindoMenssagemSenha(context).show()
            }
            else -> {
                _email.value = _email.value.toString().trim { it <= ' ' }
                _senha.value = _senha.value.toString().toInt()
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    _email.toString(),
                    _senha.toString()
                )
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            val firebaseUser: FirebaseUser = task.result!!.user!!
                            exibindoMenssagemCadastroSucedido(context).show()
                            transicaoDeTela()
                        } else {
                            exibindoMessagemUidFirebase(context, task).show()
                        }
                    }
            }
        }
    }
    private fun transicaoDeTela() {
        fragmentManager.beginTransaction().addToBackStack("5")
            .replace(R.id.container_fragment, SegundaTelaCadastroFragment())
            .commit()
    }
    private fun exibindoMessagemUidFirebase(
        context: Context,
        task: Task<AuthResult>
    ) = Toast.makeText(
        context,
        task.exception!!.message.toString(),
        Toast.LENGTH_LONG
    )
    private fun exibindoMenssagemCadastroSucedido(context: Context) = Toast.makeText(
        context,
        "Cadastro Bem Sucedido.",
        Toast.LENGTH_LONG
    )
    private fun exibindoMenssagemSenha(context: Context) = Toast.makeText(
        context,
        "Por favor insira uma Senha",
        Toast.LENGTH_LONG
    )
    private fun exibindoMenssagemEmail(context: Context) = Toast.makeText(
        context,
        "Por favor insira um Email",
        Toast.LENGTH_LONG
    )
    fun clickAjuda() {
    }
    fun clickHome() {
        fragmentManager
            .beginTransaction().addToBackStack("2")
            .add(R.id.container_fragment, HomeNaoLogadaFragment())
            .commit()
    }
>>>>>>> feature_fragmentSegundaTela

