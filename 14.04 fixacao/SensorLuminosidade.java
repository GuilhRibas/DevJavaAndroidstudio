package com.example.sensoresn;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SensorLuminosidade extends AppCompatActivity {
    private TextView visual;
    SensorManager sm;
    SensorEventListener listener;
    Sensor luz;
    Button btnAce;
    Button btnInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_luminosidade);

        visual = findViewById(R.id.visual1);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        luz = sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        btnAce = findViewById(R.id.btnInicio);
        btnInicio = findViewById(R.id.btnInicio);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirInicio();
            }
        });


        btnAce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abriAcele();
            }
        });

        listener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                visual.setText(String.valueOf(event.values[0]));
                int grayShade = (int) event.values[0];

                grayShade = 255;

                if (grayShade > 255) {

                    visual.setTextColor(Color.rgb(255 - grayShade, 255 - grayShade, 255 - grayShade));
                    visual.setBackgroundColor(Color.rgb(grayShade, grayShade, grayShade));

                } else if(grayShade >= 200)
                {
                    AbrirActi3();
                }

            }
            @Override
            public void onAccuracyChanged(Sensor sensor, int i)
            {

            }
        };

        sm.registerListener(listener,luz,SensorManager.SENSOR_DELAY_FASTEST);

    }

    public void abriAcele(){
        Intent janela = new Intent(this, SensorManager.class);
        startActivity(janela);
    }

    @Override
    protected void onPause() {

        sm.unregisterListener(listener,luz);
        super.onPause();
    }

    public void abrirInicio () {
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
    }
    public void AbrirActi3(){
        Intent janela3 = new Intent(this,MainAct3.class);
        startActivity(janela3);
    }
}