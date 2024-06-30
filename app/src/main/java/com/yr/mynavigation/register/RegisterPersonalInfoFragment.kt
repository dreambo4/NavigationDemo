package com.yr.mynavigation.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import com.yr.mynavigation.R
import com.yr.mynavigation.databinding.FragmentRegisterPersonalInfoBinding

class RegisterPersonalInfoFragment : Fragment() {
    private var _binding: FragmentRegisterPersonalInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterPersonalInfoBinding.inflate(inflater, container, false)
        val view = binding.root
        val navController = NavHostFragment.findNavController(this)

        binding.btnSubmit.setOnClickListener {
            Toast.makeText(context, "註冊成功", Toast.LENGTH_SHORT).show()
            navController.navigate(R.id.loginActivity)
            activity?.finish()
        }

        return view
    }


}