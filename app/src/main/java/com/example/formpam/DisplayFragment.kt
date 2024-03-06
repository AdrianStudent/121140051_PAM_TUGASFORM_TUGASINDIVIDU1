package com.example.formpam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formpam.databinding.FragmentDisplayBinding

class DisplayFragment : Fragment() {

    private lateinit var binding: FragmentDisplayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDisplayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Menerima data dari intent yang dikirimkan
        val name = arguments?.getString("name", "")
        val email = arguments?.getString("email", "")
        val gender = arguments?.getString("gender", "")
        val termsAgreed = arguments?.getBoolean("termsAgreed", false)

        // Menampilkan data pada TextView
        binding.textViewName.text = "Nama: $name"
        binding.textViewEmail.text = "Email: $email"
        binding.textViewGender.text = "Jenis Kelamin: $gender"
        binding.textViewTermsAgreed.text = "Setuju dengan Syarat: ${termsAgreed.toString()}"
    }
}
