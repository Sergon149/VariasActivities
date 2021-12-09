package com.example.variasactivities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.variasactivities.databinding.ActivityLastBinding
import com.example.variasactivities.databinding.ActivitySecondBinding

class LastActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLastBinding

    companion object{

        const val Tag_Text = "Tag_Text"

        fun launch(context: Context, text: String){
            val intent = Intent(context, LastActivity::class.java)
            intent.putExtra(Tag_Text, text)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialData2 = intent.getStringExtra(Tag_Text)
        binding.tvTexto.text = initialData2
    }
}