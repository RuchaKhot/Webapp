package com.example.webapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

lateinit var url:String
lateinit var webView:WebView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // url = "https://www.iknotanalytics.com/"
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }
        webView =  findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(
            "https://www.iknotanalytics.com/")

    }

    override fun onResume() {
        super.onResume()
      /*  if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "https://www.iknotanalytics.com/"
        }

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)*/
    }
}