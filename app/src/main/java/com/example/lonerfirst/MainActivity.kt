package com.example.lonerfirst

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lonerfirst.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView((bindingClass.root))

        bindingClass.bt.setOnClickListener {

            val resultV = bindingClass.edName.text.toString()
            bindingClass.ivPhoto.visibility = View.VISIBLE
            when(resultV){

                Constance.DIRECTOR ->{
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Зачислен прлатёж ${Constance.DIRECTOR_ZP}"
                    if(bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD){
                    bindingClass.tvResult.text = tempText
                    bindingClass.tvResult.setTextColor(Color.GREEN)
                    bindingClass.ivPhoto.setImageResource(R.drawable.director)
                    bindingClass.btRate.visibility = View.VISIBLE
                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.tvResult.setTextColor(Color.RED)
                        bindingClass.ivPhoto.setImageResource(R.drawable.security)
                    }
                }

                Constance.ITISHNIK -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Зачислен прлатёж ${Constance.ITISHNIK_ZP}"
                    if (bindingClass.edPassword.text.toString() == Constance.ITISHNIK_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                        bindingClass.tvResult.setTextColor(Color.GREEN)
                        bindingClass.ivPhoto.setImageResource(R.drawable.itishnik)
                        bindingClass.btRate.visibility = View.VISIBLE
                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.tvResult.setTextColor(Color.RED)
                        bindingClass.ivPhoto.setImageResource(R.drawable.security)
                    }

                }

                Constance.GNIDA ->{
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Зачислен прлатёж ${Constance.GNIDA_ZP}"
                    if(bindingClass.edPassword.text.toString() == Constance.GNIDA_PASSWORD){
                    bindingClass.tvResult.text = tempText
                    bindingClass.tvResult.setTextColor(Color.GREEN)
                        bindingClass.ivPhoto.setImageResource(R.drawable.gnida)
                        bindingClass.btRate.visibility = View.VISIBLE
                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.tvResult.setTextColor(Color.RED)
                        bindingClass.ivPhoto.setImageResource(R.drawable.security)
                    }

                }

                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Имя не найдено"
                    bindingClass.tvResult.setTextColor(Color.RED)
                    bindingClass.ivPhoto.setImageResource(R.drawable.security)
                }
            }
        }
    }
    fun onClickGoMain2(view : View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)

    }
}
