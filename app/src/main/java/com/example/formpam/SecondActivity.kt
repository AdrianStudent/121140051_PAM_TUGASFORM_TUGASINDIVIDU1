// code SecondActivity.kt

package com.example.formpam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formpam.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menerima data dari intent
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")
        val termsAgreed = intent.getBooleanExtra("termsAgreed", false)

        // Membuat bundle untuk mengirim data ke fragment
        val bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("email", email)
        bundle.putString("gender", gender)
        bundle.putBoolean("termsAgreed", termsAgreed)

        // Membuat fragment
        val displayFragment = DisplayFragment()
        displayFragment.arguments = bundle

        // Menampilkan fragment pada layout container
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, displayFragment)
            .commit()
    }
}
