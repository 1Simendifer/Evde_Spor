package com.eren.evdespor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.system.Os;
import android.view.View;
import android.widget.Button;

public class OS extends AppCompatActivity {
    //Buton Tanımlamaları
    private Button Button1;//Omuz Kaldırma
    private Button Button2;//Kol Kaldırma
    private Button Button3;//Dizde Şınav
    private Button Button4;//Atlama Krikolar
    private Button BtnAna;//Ana Sayfa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);
        BtnAna=findViewById(R.id.BtnAna);//id ile tasarım içindeki butonları eşleştirme
        BtnAna.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(OS.this,MainActivity.class));
                finish();
            }
        });
        Button1=findViewById(R.id.Button1);//id ile tasarım içindeki butonları eşleştirme
        Button1.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(OS.this,Os1.class));
                finish();
            }
        });
        Button2=findViewById(R.id.Button2);//id ile tasarım içindeki butonları eşleştirme
        Button2.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(OS.this,Os2.class));
                finish();
            }
        });
        Button3=findViewById(R.id.Button3);//id ile tasarım içindeki butonları eşleştirme
        Button3.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(OS.this,Os3.class));
                finish();
            }
        });
        Button4=findViewById(R.id.Button4);//id ile tasarım içindeki butonları eşleştirme
        Button4.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(OS.this,Os4.class));
                finish();
            }
        });
    }
}
