// code MainActivity.kt

package com.example.formpam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formpam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur listener untuk tombol Submit
        binding.buttonSubmit.setOnClickListener {
            // Membuat intent untuk membuka halaman kedua
            val intent = Intent(this@MainActivity, SecondActivity::class.java).apply {
                // Menyertakan data yang diinput dari form
                putExtra("name", binding.editTextName.text.toString())
                putExtra("email", binding.editTextEmail.text.toString())
                putExtra("gender", binding.spinnerGender.selectedItem.toString())
//                putExtra("termsAgreed", binding.checkBoxTerms.isChecked)
            }

            // Memulai activity kedua
            startActivity(intent)
        }
    }
}
