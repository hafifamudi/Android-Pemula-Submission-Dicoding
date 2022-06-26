package com.samawaenginerr.androidpemulasubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AuthorAboutActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var backButton: Button
    private lateinit var instaProfile: Button
    private lateinit var linkedProfile: Button
    private lateinit var gitProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_author_about)

        backButton = findViewById(R.id.back_home)
        instaProfile =findViewById(R.id.instagram)
        gitProfile = findViewById(R.id.github)
        linkedProfile = findViewById(R.id.linkedin)

        backButton.setOnClickListener(this)
        instaProfile.setOnClickListener(this)
        gitProfile.setOnClickListener(this)
        linkedProfile.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.back_home) {
            val home = Intent(this@AuthorAboutActivity, ListHotelActivity::class.java)
            startActivity(home)
        }

        if (v?.id == R.id.instagram) {
            val instaPortofolio = Intent(this@AuthorAboutActivity, WebViewActivity::class.java)
            instaPortofolio.putExtra(WebViewActivity.URL_PORTOFOLIO, "https://www.instagram.com/hafifamudi/")
            startActivity(instaPortofolio)
        }

        if (v?.id == R.id.linkedin) {
            val linkedinPortofolio = Intent(this@AuthorAboutActivity, WebViewActivity::class.java)
            linkedinPortofolio.putExtra(WebViewActivity.URL_PORTOFOLIO, "https://www.linkedin.com/in/hafif-nur-muhammad-947a36162/")
            startActivity(linkedinPortofolio)
        }

        if (v?.id == R.id.github) {
            val gitPortofolio = Intent(this@AuthorAboutActivity, WebViewActivity::class.java)
            gitPortofolio.putExtra(WebViewActivity.URL_PORTOFOLIO, "https://github.com/hafifamudi")
            startActivity(gitPortofolio)
        }
    }
}