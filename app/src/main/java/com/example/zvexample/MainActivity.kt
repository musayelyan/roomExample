package com.example.zvexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.zvexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!this::binding.isInitialized) {
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            binding.itemRoot = this
        }
    }

    fun onSaveClick() {
        val name = binding.nameEt.text.toString()
        val surname = binding.surnameEt.text.toString()
        Toast.makeText(this, "$name $surname", Toast.LENGTH_SHORT).show()
        clearEdTexts()
    }

    private fun clearEdTexts() {
        binding.nameEt.setText("")
        binding.surnameEt.setText("")
    }

}