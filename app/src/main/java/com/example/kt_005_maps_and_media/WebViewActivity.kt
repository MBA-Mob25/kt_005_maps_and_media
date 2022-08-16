package com.example.kt_005_maps_and_media

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.kt_005_maps_and_media.databinding.ActivityWebViewBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createWebView()
    }

    private fun createWebView() {
        val webview = binding.webview;
        webview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String?
            ): Boolean {
                if(url != null) view?.loadUrl(url)
                return true;
            }
        }
        webview.settings.javaScriptEnabled = true
        webview.loadUrl("https://www.google.com.br")

    }
}