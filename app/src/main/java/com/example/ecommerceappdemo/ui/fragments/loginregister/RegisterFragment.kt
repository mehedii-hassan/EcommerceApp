package com.example.ecommerceappdemo.ui.fragments.loginregister

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.ecommerceappdemo.R
import com.example.ecommerceappdemo.data.UserModel
import com.example.ecommerceappdemo.databinding.FragmentRegisterBinding
import com.example.ecommerceappdemo.viewmodels.RegisterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    //private val viewModel by viewModels<RegisterViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Initializing binding--------
        binding = FragmentRegisterBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.apply {
            btnRegister.setOnClickListener {
                val user = UserModel(
                    etUserName.text.toString().trim(),
                    etUserEmail.text.toString().trim(),
                    etEmailPass.text.toString().trim(),
                    etEmailConfirmPass.text.toString().trim()
                )
            }
        }
        lifecycleScope.launchWhenStarted {

        }
    }


}