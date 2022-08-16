package com.example.kt_005_maps_and_media

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kt_005_maps_and_media.databinding.ActivityMainBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurando as ações de cada botão, abrindo suas interfaces
        with(binding) {
            btnOpenRecoveryImages.setOnClickListener(View.OnClickListener { openRecoveryPhotosWithImageView() })
        }
    }

    private fun openRecoveryPhotosWithImageView() {
        val intent = Intent(this, RecoveryPhotosActivity::class.java);
        startActivity(intent);
    }

}