package com.example.projeto_dont_waste.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.CadastroFragmentBinding
import com.example.projeto_dont_waste.databinding.HomeNaoLogadaFragmentBinding
import com.example.projeto_dont_waste.viewmodel.CadastroViewModel

class CadastroFragment : Fragment() {

    companion object {
        fun newInstance() = CadastroFragment()
    }

    private lateinit var viewModel: CadastroViewModel
    private lateinit var binding: CadastroFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cadastro_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(CadastroViewModel::class.java)

    }




}