package com.example.projeto_dont_waste.viewmodel

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.fragment.HomeNaoLogadaFragment
import com.example.projeto_dont_waste.fragment.SegundaTelaCadastroFragment
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


@SuppressLint("StaticFieldLeak")
class CadastroViewModel( application: Application) : AndroidViewModel(
    application
) {
    private val context = getApplication<Application?>().applicationContext

    private val _email = MutableLiveData<String?>()
    val email: LiveData<String?>
        get() = _email
    private val _senha = MutableLiveData<String?>()
    val senha: LiveData<String?>
        get() = _senha
    private val _botaoVoltarHome = MutableLiveData<AppCompatImageView?>()
    val botaoVoltarHome: LiveData<AppCompatImageView?>
        get() = _botaoVoltarHome
    private val _botaoAjudaSenha = MutableLiveData<AppCompatImageView?>()
    val botaoAjudaSenha: LiveData<AppCompatImageView?>
        get() = _botaoAjudaSenha
    private val _botaoProximo = MutableLiveData<AppCompatButton?>()
    val botaoProximo: LiveData<AppCompatButton?>
        get() = _botaoProximo


//    fun validaSenha(context: Context): Boolean {
//        _senha.toString().isEmpty().apply {
//            exibindoMenssagemSenha(context).show()
//        }
//        return true
//    }
//
//    fun validaEmail(context: Context): Boolean {
//        _email.toString().isEmpty().apply {
//            exibindoMenssagemEmail(context).show()
//        }
//        return true
//    }
//
//    fun enviandoAoFireBase(context: Context) : Boolean{
//        if (validaEmail(context) && validaSenha(context)) {
//            FirebaseAuth.getInstance().createUserWithEmailAndPassword(
//                _email.value.toString(),
//                _senha.value.toString()
//
//            ).addOnCompleteListener {
//                if(it.isSuccessful) {
//                    FirebaseAuth.getInstance().currentUser
//                    exibindoMenssagemCadastroSucedido(context).show()
//
//                } else {
//                    exibindoMessagemUidFirebase(context, it).show()
//                }
//
//            }
//
//        }
//        return true
//
//    }
//    fun validacaoFinal(context: Context){
//        if(enviandoAoFireBase(context)){
//            transicaoDeTela()
//        }
//    }

    fun clickProximo() {
        if (validaCamposVazios()) {
           val email: String = email.value.toString().trim { it <= ' ' }
            val senha: String = senha.value.toString().trim { it <= ' ' }
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, senha
            ).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val firebaseUser: FirebaseUser = task.result!!.user!!
                    exibindoMenssagemCadastroSucedido().show()
                } else {
                    exibindoMessagemUidFirebase(context, task).show()
                }
            }
        }
    }

    private fun validaCamposVazios(): Boolean {
        return (validaEmailVazio() && validaSenhaVazia())

    }

    private fun validaSenhaVazia(): Boolean {
        if (TextUtils.isEmpty(senha.value.toString().trim { it <= ' ' })) {
            exibindoMenssagemSenha().show()
        }
        return false
    }

    private fun validaEmailVazio(): Boolean {
        if (TextUtils.isEmpty(email.value.toString().trim { it <= ' ' })) {
            exibindoMenssagemEmail().show()
        }
        return false
    }



    private fun exibindoMessagemUidFirebase(
        context: Context,
        task: Task<AuthResult>
    ) = Toast.makeText(
        context,
        task.exception!!.message.toString(),
        Toast.LENGTH_LONG
    )

    private fun exibindoMenssagemCadastroSucedido() = Toast.makeText(
        context,
        "Cadastro Bem Sucedido.",
        Toast.LENGTH_LONG
    )

    private fun exibindoMenssagemSenha() = Toast.makeText(
        context,
        "Por favor insira uma Senha",
        Toast.LENGTH_LONG
    )

    private fun exibindoMenssagemEmail() = Toast.makeText(
        context,
        "Por favor insira um Email",
        Toast.LENGTH_LONG
    )

    fun clickAjuda() {
    }


}
