package com.example.thenum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.webkit.WebSettings;

import android.widget.

public class Escolha extends AppCompatActivity {


        private Buttonn btnTeaser,btnSom;
        private TextView resposta;
        private WebView imagem2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);
        btnTeaser = findViewById(R.id.btnTeaser);
        btnSom = findViewById(R.id.btnSom);
        resposta = findViewById(R.id.resposta);
        imagem2 = findViewById(R.id.imagem2);

        String recebe = getIntent().getStringExtra("dados");
        resposta.setText(recebe);

        WebSettings gif = imagem2.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/brutus.gif";
        imagem2.loadUrl(caminho);



    }

}