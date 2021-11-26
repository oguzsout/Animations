package com.oguzdogdu.shakeanimation

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.oguzdogdu.shakeanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        animateRocket()
    }

     private fun animateRocket() {
        val shake = AnimationUtils.loadAnimation(applicationContext, R.anim.shake_animation)
        binding.imageView.animation = shake
    }
}