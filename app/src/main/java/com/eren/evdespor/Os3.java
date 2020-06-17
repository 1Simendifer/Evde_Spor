package com.eren.evdespor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Os3 extends AppCompatActivity {
    private Button BtnHareketler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os3);
        BtnHareketler=findViewById(R.id.BtnHareketler);
        BtnHareketler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Os3.this,OS.class));
                finish();
            }
        });
    }
}
