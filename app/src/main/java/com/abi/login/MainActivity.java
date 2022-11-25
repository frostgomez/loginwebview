package com.abi.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvUsuario;
    EditText etUser;
    TextView tvContra;
    EditText etPass;
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvUsuario = findViewById(R.id.tvUsuario);
        etUser = findViewById(R.id.etUser);
        tvContra = findViewById(R.id.tvContra);
        etPass = findViewById(R.id.etPass);
        tvUsuario.setText("Ingrese su usuario");
        tvContra.setText("Ingrese su contraseña");
        etUser.setText("");
        etPass.setText("");
        btnGo = findViewById(R.id.btnGo);
        btnGo.setText("Enviar");
        btnGo.setOnClickListener(new View.OnClickListener() { /*Asi se declara un evento click*/
            @Override
            public void onClick(View view) {
                //Titulo.setText(Nombre.getText());
                //Nombre.setText("");
                String var = etUser.getText().toString();
                Intent intent = new Intent(MainActivity.this, Home.class);
                intent.putExtra("email", var);
                startActivity(intent);
            }
        });
    }
}