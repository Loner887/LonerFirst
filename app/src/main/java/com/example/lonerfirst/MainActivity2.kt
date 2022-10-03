package com.example.lonerfirst

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lonerfirst.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMain2Binding.inflate(layoutInflater)
        setContentView((bindingClass.root))

        bindingClass.bt.setOnClickListener {
            val result = bindingClass.rate.text.toString().toInt()

            when(result){
                in 0..10 ->{
                    bindingClass.tv2.visibility = View.VISIBLE
                    bindingClass.tv2.setTextColor(Color.GREEN)
                    bindingClass.tv2.text = "Спасибо за оценку!"
                }
                in 11..100 ->{
                    bindingClass.tv2.visibility = View.VISIBLE
                    bindingClass.tv2.setTextColor(Color.BLUE)
                    bindingClass.tv2.text = "Огромное спасибо за оценку!"
                }
                else -> {
                    bindingClass.tv2.visibility = View.VISIBLE
                    bindingClass.tv2.setTextColor(Color.RED)
                    bindingClass.tv2.text = "Некорректная оценка"
                }

            }

        }
    }
}

