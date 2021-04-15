package com.example.sensoresn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//declaração da classe implements com a abstração do SensorEventListener

public class SensorProximidade extends AppCompatActivity implements SensorEventListener {
    //Declaração de atribultos
    private Sensor proximidade;
    private SensorManager medir;
    private TextView resposta;
    private Button btnVoltar, btnLuminosidade;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_proximidade);

        //Mapeamento de todos os objetos do layout

        medir(SensorManager) = this.getSystemService(SENSOR_SERVICE);
        proximidade = medir.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        resposta = findViewById(R.id.resposta);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnLuminosidade = findViewById(R.id.btnLuminosidade);


        //Eventos de botões

        btnLuminosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AbrirLuminosidade();
            }
        });


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirVoltar();
            }
        });

    }

    //chamandas de callbakcs

    @Override
    protected void onPause() {
        medir.registerListener(this, proximidade, SensorManager.SENSOR_DELAY_NORMAL);
        super.onPause();
    }

    //método ocorre quando e execultado ou modificado algum tipo de evento relacionado ao sensor
    //especifico
    //se o valor do evento for = 0, é pq estamos próximos ao sensor, senao estamos afastados

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.values [0] ==0)
        {
            AbrirActivity3();
        }else
        {
            getWindow().getDecorView().setBackgroundColor(color.RED);
            resposta.setText("Está Afastado.");
        }
    }



    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


    @Override
    protected void onResume() {
        medir.registerListener(this, proximidade, SensorManager.SENSOR_DELAY_NORMAL);

        super.onResume();
    }

    //abertura de activitys
    public void AbrirLuminosidade(){
        Intent janela = new Intent(this,SensorLuminosidade.class);
        startActivity(janela);
    }
    public void AbrirVoltar(){
        Intent janelav = new Intent(this,MainActivityS.class);
        startActivity(janelav);
    }
    public void AbrirActivity3(){
        Intent janela3 = new Intent(this,MainActivity3.class);
        startActivity(janela3);
    }

}

