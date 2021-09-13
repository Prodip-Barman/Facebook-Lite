package com.example.facelite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook = findViewById(R.id.facebook_webView);

        WebSettings webSettings = facebook.getSettings();

        webSettings.setJavaScriptEnabled(true);

        facebook.loadUrl("https://www.facebook.com/");

        facebook.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (facebook.canGoBack()){
            facebook.goBack();
        }else {
            super.onBackPressed();
        }
    }
}