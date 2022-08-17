package com.example.kt_005_maps_and_media

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kt_005_maps_and_media.databinding.ActivitySoundPlayerBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivitySoundPlayerBinding;

class SoundPlayerActivity : AppCompatActivity() {
    var dog: MediaPlayer? = null
    var boi: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoundPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dog = MediaPlayer.create(this, R.raw.audio_dog)
        boi = MediaPlayer.create(this, R.raw.audio_boi)

        with(binding) {
            imgDog.setOnClickListener(View.OnClickListener { playDog() })
            imgBoi.setOnClickListener(View.OnClickListener { playBoi() })
        }
    }

    private fun playDog() {
        if(dog == null) return

        if(dog!!.isPlaying) {
            println("stopping dog")
            dog!!.pause()
        } else {
            println("starting dog")
            dog!!.start()
        }
    }

    private fun playBoi() {
        if(boi == null) return

        if(boi!!.isPlaying) {
            println("stopping boi")
            boi!!.pause()
        } else {
            println("starting boi")
            boi!!.start()
        }
    }
}