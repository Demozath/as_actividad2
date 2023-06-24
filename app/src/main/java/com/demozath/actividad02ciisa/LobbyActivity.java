package com.demozath.actividad02ciisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LobbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
    }

    public void registro_usuarios(View view){

        TextView registro_usuarios = (TextView) findViewById(R.id.registro_usuarios);
        registro_usuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,activity_registro_usuarios.class);
                startActivity(intent);
            }
}