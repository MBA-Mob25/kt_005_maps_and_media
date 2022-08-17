package com.example.kt_005_maps_and_media

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import com.example.kt_005_maps_and_media.databinding.ActivityVideoPlayerBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityVideoPlayerBinding

class VideoPlayerActivity : AppCompatActivity() {
    private var uri: Uri? = null
    private var isContinuously = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController = MediaController(this)
        val videoPlayer = binding.videoPlayer;
        mediaController.setAnchorView(videoPlayer)

        val urlPath = "https://archive.org/download/WildlifeSampleVideo/Wildlife.mp4"
        uri = Uri.parse(urlPath)
        videoPlayer.setOnCompletionListener { if (isContinuously) videoPlayer.start() }

        with(binding) {
            btnPause.setOnClickListener { videoPlayer.pause() }
            btnPlay.setOnClickListener { videoPlayer.start() }
            btnOnce.setOnClickListener {
                isContinuously = false
                configPlayer(videoPlayer, mediaController)
            }
            btnContinue.setOnClickListener {
                isContinuously = true
                configPlayer(videoPlayer, mediaController)
            }
            videoPlayer.setOnPreparedListener {
                binding.progressBar.visibility = View.GONE
            }
        }
    }

    private fun configPlayer(videoPlayer: VideoView, mediaController: MediaController) {
        binding.progressBar.visibility = View.VISIBLE
        videoPlayer.setMediaController(mediaController)
        videoPlayer.setVideoURI(uri)
        videoPlayer.requestFocus()
        videoPlayer.start()
    }
}