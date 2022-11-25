package com.abi.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

<<<<<<< HEAD
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    ConstraintLayout cMenu,cHome,cPerfil,cSoporte,cCerrar;
    ImageView imMenu;
    TextView tvNombre,tvProfesion,tvHome,tvSoporte,tvCerrar;
    Boolean menuact = false;
    @SuppressLint("MissingInflatedId")
=======
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    ConstraintLayout cMenu;
    ImageView imMenu;
    Boolean menuact = false;
>>>>>>> origin/main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cMenu = findViewById(R.id.cMenu);
<<<<<<< HEAD
        cPerfil = findViewById(R.id.cPerfil);
        cHome = findViewById(R.id.cHome);
        cSoporte = findViewById(R.id.cSoporte);
        cCerrar = findViewById(R.id.cCerrar);
        imMenu = findViewById(R.id.imMenu);
        tvNombre = findViewById(R.id.tvNombre);
        tvProfesion = findViewById(R.id.tvProfesion);
        tvProfesion.setText("Desarrollador Siath");
        tvHome = findViewById(R.id.tvHome);
        tvHome.setText("inicio");
        tvSoporte = findViewById(R.id.tvSoporte);
        tvSoporte.setText("soporte");
        tvCerrar = findViewById(R.id.tvCerrar);
        tvCerrar.setText("salir");

        Bundle varextra = getIntent().getExtras();
        tvNombre.setText(varextra.getString("email"));
=======
        imMenu = findViewById(R.id.imMenu);
>>>>>>> origin/main

        imMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (menuact){
                    cMenu.setVisibility(View.GONE);
                    menuact = false;
                }
                else{
                    cMenu.setVisibility(View.VISIBLE);
                    menuact = true;
                }
            }
        });
<<<<<<< HEAD
        cPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cMenu.setVisibility(View.GONE);
                menuact = false;
                Intent intent = new Intent(Home.this, Perfil.class);
                String var = tvNombre.getText().toString();
                intent.putExtra("email", var);
                startActivity(intent);
            }
        });
        cCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cMenu.setVisibility(View.GONE);
                menuact = false;
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);
            }
        });
        cHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"Menú Home",Toast.LENGTH_LONG).show();
            }
        });
        cSoporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"Menú Soporte",Toast.LENGTH_LONG).show();
            }
        });
=======
>>>>>>> origin/main

    }
}