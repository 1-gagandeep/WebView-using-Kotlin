package com.example.webviewtest

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        val webView : WebView = findViewById(R.id.web_view)
//        webView.webViewClient = WebViewClient()
//        webView.settings.javaScriptEnabled = true
//        webView.loadUrl("https://topperworld.in/data-structure/")


        val edt : EditText = findViewById(R.id.edt)
        val btn : Button = findViewById(R.id.btn)

        btn.setOnClickListener {
            val i = Intent(this, WebViewActivity::class.java)
            i.putExtra("link", edt.text.toString())
            startActivity(i)
        }
    }
}