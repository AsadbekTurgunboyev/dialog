package com.example.takrorlash

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnLike : ImageView = findViewById(R.id.btnlike)
        var ischeck : Boolean = true
        btnLike.setOnClickListener{
            if (ischeck){
                btnLike.setImageResource(R.drawable.baseline_thumb_ref)
                ischeck =! ischeck
            }else{
                btnLike.setImageResource(R.drawable.baseline_thumb_up_24)
                ischeck =! ischeck
            }
        }
    }
}