package com.samawaenginerr.androidpemulasubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    companion object {
        const val URL_PORTOFOLIO = "url_portofolio"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

//      get link
        val linkPortofolio = intent.getStringExtra(URL_PORTOFOLIO)

        webView = findViewById(R.id.profile_portofolio)
        webView.webViewClient = WebViewClient()
        webView.loadUrl(linkPortofolio!!)
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) webView.goBack() else super.onBackPressed()
    }
}


