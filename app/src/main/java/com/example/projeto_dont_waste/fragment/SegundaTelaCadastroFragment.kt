package com.example.projeto_dont_waste.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.SegundaTelaCadastroFragmentBinding
import com.example.projeto_dont_waste.viewmodel.SegundaTelaCadastroViewModel
import com.example.projeto_dont_waste.viewmodel.SegundaTelaCadastroViewModelFactory

class SegundaTelaCadastroFragment : Fragment() {

    companion object {
        fun newInstance() = SegundaTelaCadastroFragment()
    }

    private lateinit var binding: SegundaTelaCadastroFragmentBinding
    private lateinit var viewModel: SegundaTelaCadastroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.segunda_tela_cadastro_fragment,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this, SegundaTelaCadastroViewModelFactory(parentFragmentManager)).get(SegundaTelaCadastroViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
        binding.viewmodel.onNomeUsuario.observe(viewLifecycleOwner, Observer {
          //  binding.editTextNomeCadastro.text = it
        })

        binding.viewmodel.onBotaoHome.observe(viewLifecycleOwner, Observer {
            it.setOnClickListener {
                viewModel.voltarParaHome()
            }
        })

        binding.editTextDataUltimaCompra.setOnClickListener {
            viewModel.criacaoDatePicker()
            viewModel.aparecerDatePicker()
            }

        }


    }

