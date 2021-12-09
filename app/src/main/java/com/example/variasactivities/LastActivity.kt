package com.example.variasactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasactivities.databinding.ActivityLastBinding
import com.example.variasactivities.databinding.ActivitySecondBinding

class LastActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialData2 = intent.getStringExtra("TEXT")
        binding.tvTexto.text = "$initialData2"
    }
}