package com.eren.evdespor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.MailTo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bacak extends AppCompatActivity {
    //Buton Tanımlamaları
    private Button Button1;//Adımlama
    private Button Button2;//Squad
    private Button Button3;//Yana bacak kaldırma
    private Button BtnAna;//Ana sayfa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacak);
        BtnAna=findViewById(R.id.BtnAna);//id ile tasarım içindeki butonları eşleştirme
        BtnAna.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(Bacak.this,MainActivity.class));
                finish();
            }
        });
        Button1=findViewById(R.id.Button1);//id ile tasarım içindeki butonları eşleştirme
        Button1.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(Bacak.this,Bacak1.class));
                finish();
            }
        });
        Button2=findViewById(R.id.Button2);//id ile tasarım içindeki butonları eşleştirme
        Button2.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(Bacak.this,Bacak2.class));
                finish();
            }
        });
        Button3=findViewById(R.id.Button3);//id ile tasarım içindeki butonları eşleştirme
        Button3.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(Bacak.this,Bacak3.class));
                finish();
            }
        });

    }
}
