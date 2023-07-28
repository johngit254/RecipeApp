package com.example.deliciousfood.view.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.deliciousfood.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setInitViews()
        setClickListeners()
    }

    private fun setInitViews() {
        Handler().postDelayed({
            //binding.progressSplash.visibility = View.GONE
            binding.btnContinue.visibility = View.VISIBLE
        },5000)
    }

    private fun setClickListeners() {
        binding.btnContinue.setOnClickListener()
        {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}