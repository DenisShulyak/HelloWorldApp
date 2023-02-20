package com.example.helloworldapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.helloworldapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        textView = binding.textHello
        textView.visibility = View.INVISIBLE
        button = binding.buttonShow
    }

    fun clickButton(view: View) {
        if(textView.isVisible)
        {
            textView.visibility = View.INVISIBLE
            button.text = "Отоброзить"
        }
        else
        {
            textView.visibility = View.VISIBLE
            button.text = "СКРЫТЬ"
        }
    }
}