package com.eren.evdespor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kol extends AppCompatActivity {
    //Buton Tanımlamaları
    private Button Button1;//Arka kol
    private Button Button2;//Ön kol
    private Button Button3;//Kol kaldırma
    private Button BtnAna;//Ana sayfa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kol);
        BtnAna=findViewById(R.id.BtnAna);//id ile tasarım içindeki butonları eşleştirme
        BtnAna.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(Kol.this,MainActivity.class));
                finish();
            }
        });
        Button1=findViewById(R.id.Button1);//id ile tasarım içindeki butonları eşleştirme
        Button1.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(Kol.this,Kol1.class));
                finish();
            }
        });
        Button2=findViewById(R.id.Button2);//id ile tasarım içindeki butonları eşleştirme
        Button2.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(Kol.this,Kol2.class));
                finish();
            }
        });
        Button3=findViewById(R.id.Button3);//id ile tasarım içindeki butonları eşleştirme
        Button3.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(Kol.this,Kol3.class));
                finish();
            }
        });
    }
}
