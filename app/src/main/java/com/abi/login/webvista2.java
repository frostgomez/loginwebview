package com.abi.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class webvista2 extends AppCompatActivity {
   WebView wvNavegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webvista2);
        WebView webView = (WebView) findViewById(R.id.wvNavegador);


        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("https://www.mercadolibre.com");
    }
}