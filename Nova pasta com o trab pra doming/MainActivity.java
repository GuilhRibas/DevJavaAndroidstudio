package com.example.mygames;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private button btnVelha, btnMemoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVelha = findViewById(R.id.btnVelha);
        btnMemoria = findViewById(R.id.btnMemoria);

        btnVelha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                abrirVelha();
            }

        });

        btnMemoria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                abrirMemoria();
            }
        });



    }
    private abrirVelha(){
        Intent janelav = new Intent(this, MainVelha.class);
        startActivity(janelav);
    }

    private abrirMemoria(){
        Intent janelam = new Intent(this, MainMemoria.class);
        startActivity(janelam);
    }

}