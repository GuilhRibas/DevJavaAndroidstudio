package com.example.sensoresn;

import androidx.appcompat.app.AppCompatActivity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SensorProximidade extends AppCompatActivity implements SensorEventListener {

    private Sensor proximidade;
    private SensorManager medir;
    private TextView resposta;
    private Button btnVoltar, btnLuminosidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_proximidade);

        medir(SensorManager) this.getSystemService(SENSOR_SERVICE);
        proximidade = medir.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        resposta = findViewById(R.id.resposta);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnLuminosidade = findViewById(R.id.btnLuminosidade);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

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
}

