package com.glintec.app.weblauncheer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebPageActivity extends AppCompatActivity {

    private WebView wV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);
        wV = findViewById(R.id.wView_PAGE);
        Bundle paquete = getIntent().getExtras();
        String page = paquete.getString("direccionWeb");
        wV.loadUrl("http://"+page);

    }
}
