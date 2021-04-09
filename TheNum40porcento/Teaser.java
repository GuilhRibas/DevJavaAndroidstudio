package com.example.thenum;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Teaser extends AppCompatActivity {

    private Button btnVoltar;
    private VideoView trailer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teaser);

        trailer = findViewById(R.id.trailer);
        btnVoltar = findViewById(R.id.btnVoltar);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.trailer);
        trailer.setVideoURI(caminho);
        trailer.start();

        btnVoltar.setOnClickListener();

    }
}