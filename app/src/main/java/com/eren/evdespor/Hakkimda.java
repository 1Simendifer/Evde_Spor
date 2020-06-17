package com.eren.evdespor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hakkimda extends AppCompatActivity {
    private Button BtnAna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkimda);
        BtnAna=findViewById(R.id.BtnAna);
        BtnAna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hakkimda.this,MainActivity.class));
                finish();
            }
        });
    }
}
