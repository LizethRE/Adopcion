package com.desoft.adopcion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InicioSesionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }

    public void ingresar(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void registro(View v){
        Intent i = new Intent(this, RegistroActivity.class);
        startActivity(i);
    }
}