package com.example.variasactivities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.variasactivities.databinding.ActivitySecondBinding
import kotlin.random.Random

class SecondActivity : AppCompatActivity(){

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialData = intent.getIntExtra("NUM_ALEATORIO",0)
        binding.tvText2.text = "$initialData"

        binding.button2.setOnClickListener {
            val intent = Intent(this, LastActivity::class.java)
            intent.putExtra("TEXT", binding.tvText2.text)
            startActivity(intent)
        }



    }
}