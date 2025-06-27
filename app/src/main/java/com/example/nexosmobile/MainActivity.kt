package com.example.nexosmobile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nexosmobile.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.tvEsqueceuSenha.setOnClickListener {
            Intent(this, EsqueciSenhaActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}