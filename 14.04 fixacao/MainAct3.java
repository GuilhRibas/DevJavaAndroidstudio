package com.example.sensoresn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class MainAct3 extends AppCompatActivity {
    private VideoView olharGif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_act3);

        olhar = findViewById(R.id.olharGif);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.teaser);
        olhar.setVideoURI(caminho);
        olhar.start();

    }
}