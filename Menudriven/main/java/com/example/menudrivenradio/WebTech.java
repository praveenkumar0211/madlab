package com.example.menudrivenradio;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebTech    extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webtect);
        WebView webview = findViewById(R.id.webview);
        WebSettings websettings = webview.getSettings();
        websettings.setJavaScriptEnabled(true);
        WebAppClient webviewclient = new WebAppClient(this);
        webview.setWebViewClient(webviewclient);
        webview.loadData("<html>"+
                        "<body style=\"background-color:red; color:white\">"+"</html>",
                "text/html","UTF-8");
    }
}
