package com.example.kt_005_maps_and_media

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.kt_005_maps_and_media.databinding.ActivityRecoveryPhotosBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityRecoveryPhotosBinding

class RecoveryPhotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecoveryPhotosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recoveryLayout()
    }

    private fun recoveryLayout() {
        val pets = arrayOf(
            "Leão",
            "Pinguim",
            "Urso",
            "Girafa",
            "Tigre",
            "Rato"
        )

        val images = arrayOf(
            "https://st.depositphotos.com/1004061/3547/i/450/depositphotos_35477449-stock-photo-big-lion-lying-on-savannah.jpg",
            "https://st2.depositphotos.com/7402484/10297/i/600/depositphotos_102970592-stock-photo-big-king-penguin.jpg",
            "https://veja.abril.com.br/wp-content/uploads/2019/05/mundo-urso-pardo-20181227-002-copy-1.jpg",
            "https://radiomixfm.com.br/wp-content/uploads/2020/09/girafa.png",
            "http://s2.glbimg.com/RFnG4EgIzgmpejlSjWA8K3apZ5M=/e.glbimg.com/og/ed/f/original/2016/04/15/tiger-02.jpg",
            "https://www.insectbye.com.br/wp-content/uploads/2020/12/2021-01-diferenca-entre-rato-e-ratazana.jpg"
        )

        pets[0].also { binding.textView1.text = it }
        images[0].also { Glide.with(this).load(it).into(binding.imageView1) }
        pets[1].also { binding.textView2.text = it }
        images[1].also { Glide.with(this).load(it).into(binding.imageView2) }
        pets[2].also { binding.textView3.text = it }
        images[2].also { Glide.with(this).load(it).into(binding.imageView3) }
        pets[3].also { binding.textView4.text = it }
        images[3].also { Glide.with(this).load(it).into(binding.imageView4) }
        pets[4].also { binding.textView5.text = it }
        images[4].also { Glide.with(this).load(it).into(binding.imageView5) }
        pets[5].also { binding.textView6.text = it }
        images[5].also { Glide.with(this).load(it).into(binding.imageView6) }
    }
}