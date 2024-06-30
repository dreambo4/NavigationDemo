package com.yr.navigation_demo.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.yr.navigation_demo.R
import com.yr.navigation_demo.databinding.FragmentRegisterEmailBinding

class RegisterEmailFragment : Fragment() {
    private var _binding: FragmentRegisterEmailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterEmailBinding.inflate(inflater, container, false)
        val view = binding.root
        val navController = findNavController(this)

        binding.btnSubmit.setOnClickListener {
            navController.navigate(R.id.registerPasswordFragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}