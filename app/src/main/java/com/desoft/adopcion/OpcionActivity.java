package com.desoft.adopcion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OpcionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion);
    }

    public void adopcion(View v){
        Intent i = new Intent(this, AdopcionActivity.class);
        startActivity(i);
    }

    public void refugio(View v){
        Intent i = new Intent(this, RefugioActivity.class);
        startActivity(i);
    }
}
