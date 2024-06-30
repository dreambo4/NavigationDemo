package com.yr.mynavigation.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.yr.mynavigation.R
import com.yr.mynavigation.databinding.FragmentRegisterPasswordBinding

class RegisterPasswordFragment : Fragment() {
    private var _binding: FragmentRegisterPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterPasswordBinding.inflate(inflater, container, false)
        val view = binding.root
        val navController = NavHostFragment.findNavController(this)
        
       binding.btnSubmit.setOnClickListener {
           navController.navigate(R.id.registerPersonalInfoFragment)
       }
        
        binding.btnTerm.setOnClickListener { 
            navController.navigate(R.id.termFragment)
        }
        return view
    }
}