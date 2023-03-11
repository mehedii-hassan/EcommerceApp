package com.example.ecommerceappdemo.ui.fragments.loginregister

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ecommerceappdemo.R
import com.example.ecommerceappdemo.databinding.FragmentRegisterBinding
import com.example.ecommerceappdemo.viewmodels.RegisterViewModel

class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Initializing binding--------
        binding = FragmentRegisterBinding.inflate(inflater)
        return binding.root
    }


}