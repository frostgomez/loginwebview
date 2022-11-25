package com.abi.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {
    TextView tvMsj;
    TextView tvCall;
    TextView tvBook;
    TextView tvShare;
    TextView tvPersona;
    Button btnvolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tvMsj = findViewById(R.id.tvMsj);
        tvMsj.setText("Mensajes");
        tvCall = findViewById(R.id.tvCall);
        tvCall.setText("Llamar");
        tvBook = findViewById(R.id.tvBook);
        tvBook.setText("Catálogo");
        tvShare = findViewById(R.id.tvShare);
        tvShare.setText("Compartir");
        tvPersona = findViewById(R.id.tvPersona);
        btnvolver = findViewById(R.id.btnvolver);
        btnvolver.setText("Regresar");

        Bundle varextra = getIntent().getExtras();
        Log.d("Depuración", varextra.getString("email", "Valor por default").toString());
        tvPersona.setText(varextra.getString("email"));

        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Perfil.this, Home.class);
                String var = tvPersona.getText().toString();
                intent.putExtra("email", var);
                startActivity(intent);
            }
        });

        tvBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Perfil.this, webvista2.class);
                startActivity(intent);
            }
        } );
    }
}