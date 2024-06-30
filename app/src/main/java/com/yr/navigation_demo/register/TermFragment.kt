package com.yr.navigation_demo.register

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.yr.navigation_demo.R
import com.yr.navigation_demo.databinding.FragmentTermBinding

class TermFragment : Fragment() {
    private var _binding: FragmentTermBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTermBinding.inflate(inflater, container, false)
        val view = binding.root
        val navController = NavHostFragment.findNavController(this)

        binding.content.movementMethod = ScrollingMovementMethod()
        binding.btnBack.setOnClickListener {
            navController.navigate(R.id.registerPasswordFragment)
        }

        return view
    }
}