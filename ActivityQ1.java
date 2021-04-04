package com.example.gamechapolim;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityQ1 extends AppCompatActivity {
    Button btnopcao1Q1, btnopcao2Q1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        //dentro do onCreate colocamos o início da música
        MainActivity.mp.start();

        btnopcao1Q1 = findViewById(R.id.btnOpcao1Q1);
        btnopcao2Q1 = findViewById(R.id.btnOpcao2Q1);

        btnopcao1Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirQ2();

            }
        });

        btnopcao2Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirQ2();

            }
        });
    }

    private void abrirQ2() {
        Intent janelaQ2 = new Intent(this, Activity.class);
        startActivity(janelaQ2);
        finish();
    }

    /*desativar botão para retornar tudo
    com sobrescrito para anular uma possível volta sem reiniciar o jogo
     */
    @Override
    public void onBackPressed() {
        Toast.makeText(this,"Você não pode voltar!", Toast.LENGTH_LONG).show();
    }

}