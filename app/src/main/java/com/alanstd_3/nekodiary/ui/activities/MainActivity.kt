package com.alanstd_3.nekodiary.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alanstd_3.nekodiary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}