package com.example.kt_005_maps_and_media

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.kt_005_maps_and_media.databinding.ActivityAnimationBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityAnimationBinding

class AnimationActivity : AppCompatActivity() {

    private var animations = arrayOf(
        "FadeIn",
        "FadeOut",
        "ZoomIn",
        "ZoomOut",
        "Blink",
        "Rotate",
        "Move",
        "Slide Up",
        "Slide Down",
        "Bounce"
    )
    private var animationIds = intArrayOf(
        R.anim.fade_in,
        R.anim.fade_out,
        R.anim.zoom_in,
        R.anim.zoom_out,
        R.anim.blink,
        R.anim.rotate,
        R.anim.move,
        R.anim.slide_up,
        R.anim.slide_down,
        R.anim.bounce
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        prepare()
    }

    private fun prepare() {
        var tv = binding.tv
        var listView = binding.listView
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animations)
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val animate = AnimationUtils.loadAnimation(this, animationIds[position])
            tv.startAnimation(animate)
        }
    }
}