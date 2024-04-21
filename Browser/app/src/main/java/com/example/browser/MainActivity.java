package com.example.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView viewBrowser;

    EditText edtURL;

    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtURL = findViewById(R.id.edt_url);

        btnGo = findViewById(R.id.btn_go);

        viewBrowser = findViewById(R.id.web_browser);
        viewBrowser.loadUrl("https://www.youtube.com/");
        viewBrowser.getSettings().setJavaScriptEnabled(true);
        viewBrowser.setWebViewClient(new WebViewClient());
    }
}