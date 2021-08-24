package com.example.projeto_dont_waste.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.ActivityContainerBinding
import com.example.projeto_dont_waste.fragment.SplashFragment
import com.example.projeto_dont_waste.viewmodel.ContainerViewModel

class ContainerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContainerBinding
    private lateinit var viewModel : ContainerViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_container)
        viewModel = ViewModelProvider(this).get(ContainerViewModel::class.java)
        binding.viewmodel = viewModel
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.container_fragment,SplashFragment())
            .addToBackStack("container").commit()

    }
}