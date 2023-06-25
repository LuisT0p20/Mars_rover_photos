package com.ltp.mars_rover_photos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {
    ImageButton btnSolMarciano,btnFechaTierra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnSolMarciano = findViewById(R.id.btnSolMarciano);
        btnFechaTierra = findViewById(R.id.btnFechaTierra);

        btnSolMarciano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Querying_sun.class);
                startActivity(intent);
            }
        });
    }
}