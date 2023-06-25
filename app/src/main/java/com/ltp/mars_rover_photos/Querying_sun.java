package com.ltp.mars_rover_photos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Querying_sun extends AppCompatActivity {
    Button btnManifestSol;
    ImageButton btnBackMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_querying_sun);
        btnManifestSol = findViewById(R.id.btnManifestSol);
        btnBackMenu = findViewById(R.id.btnbackMenuSol);
        btnManifestSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Querying_sun.this, MisionManifestSol.class);
                startActivity(intent);
            }
        });
        btnBackMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Querying_sun.this, menu.class);
                startActivity(intent);
            }
        });
    }
}