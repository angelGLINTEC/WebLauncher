package com.glintec.app.weblauncheer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText page;
    private Button btnGO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        page = findViewById(R.id.edTxt_WEB);
        btnGO = findViewById(R.id.btn_GO);

        View.OnClickListener cl = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GoPage();
            }
        };

        btnGO.setOnClickListener(cl);
    }

    public void GoPage(){

        Intent i = new Intent(MainActivity.this,WebPageActivity.class);
        /*i.putExtra("direccionWeb","www.glintec.com");*/
        i.putExtra("direccionWeb",page.getText().toString());
        startActivity(i);
    }
}
