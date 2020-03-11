package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class newsActivity extends AppCompatActivity {
    WebView webviewnews;
    WebSettings websettingnews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        webviewnews = (WebView)findViewById(R.id.webnews);
        websettingnews = webviewnews.getSettings();

        webviewnews.setWebViewClient(new WebViewClient());

        webviewnews.loadUrl("https://www.liputan6.com/tag/pertanian");
    }

    @Override
    public void onBackPressed() {
        if (webviewnews.canGoBack()){
            webviewnews.goBack();
        }
        else {
            finish();
        }
    }
}
