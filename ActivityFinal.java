package com.example.gamechapolim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import java.net.URI;

public class ActivityFinal extends AppCompatActivity {
    Button btnSair, btnReiniciar;
            TextView txtPontosFinal;
            VideoView VideoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        btnSair = findViewById(R.id.btnSair);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        txtPontosFinal = findViewById(R.id.txtPontosFinal);
        VideoPlayer = findViewById(R.id.VideoPlayer);

        MainActivity.midiap.stop();

        if(MainActivity.acertos == 3) {
            Uri rota = Uri.parse("anroid.resource://" + getPackageName() + "/" + R.raw.bonus);
            VideoPlayer.setVideoURI(rota);
            VideoPlayer.start();
        }

        txtPontosFinal.setText("Pontos Atuais: " + MainActivity.acertos++);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.acertos = 0;
                abrirMain();
            }
        });
    }
    public void abrirMain() {
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
        finish();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Você não pode voltar!", Toast.LENGTH_LONG).show();
    }
}
