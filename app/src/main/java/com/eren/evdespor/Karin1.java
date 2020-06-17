package com.eren.evdespor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Karin1 extends AppCompatActivity {
    private Button BtnHareketler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karin1);
        BtnHareketler=findViewById(R.id.BtnHareketler);
        BtnHareketler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Karin1.this,Karin.class));
                finish();
            }
        });
    }
}
