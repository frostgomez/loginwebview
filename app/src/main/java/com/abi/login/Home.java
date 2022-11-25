package com.abi.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    ConstraintLayout cMenu;
    ImageView imMenu;
    Boolean menuact = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cMenu = findViewById(R.id.cMenu);
        imMenu = findViewById(R.id.imMenu);

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

    }
}