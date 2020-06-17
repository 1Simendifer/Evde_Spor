package com.eren.evdespor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.system.Os;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Buton Tanımlamaları
    private Button BtnKarin;//Karın
    private Button BtnGogus;//Göğüs
    private Button BtnKol;//Kol
    private Button BtnBacak;//Bacak
    private Button BtnOs;//Omuz ve Sırt
    private Button BtnKakkimda;//Hakkımda

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnKarin=findViewById(R.id.BtnKarin);//id ile tasarım içindeki butonları eşleştirme
        BtnKarin.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(MainActivity.this,Karin.class));
                finish();
            }
        });
        BtnGogus=findViewById(R.id.BtnGogus);//id ile tasarım içindeki butonları eşleştirme
        BtnGogus.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(MainActivity.this,Gogus.class));
                finish();
            }
        });
        BtnKol=findViewById(R.id.BtnKol);//id ile tasarım içindeki butonları eşleştirme
        BtnKol.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(MainActivity.this, Kol.class));
                finish();

            }
        });
        BtnBacak=findViewById(R.id.BtnBacak);//id ile tasarım içindeki butonları eşleştirme
        BtnBacak.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(MainActivity.this,Bacak.class));
                finish();
            }
        });
        BtnOs=findViewById(R.id.BtnOs);//id ile tasarım içindeki butonları eşleştirme
        BtnOs.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(MainActivity.this, OS.class));
                finish();
            }
        });
        BtnKakkimda=findViewById(R.id.BtnKakkimda);//id ile tasarım içindeki butonları eşleştirme
        BtnKakkimda.setOnClickListener(new View.OnClickListener() {//button onClick
            @Override
            public void onClick(View v) {
                //butona tıklandığında bir sonraki sayfaya gitme komutu
                startActivity(new Intent(MainActivity.this,Hakkimda.class));
                finish();
            }
        });


    }
}
