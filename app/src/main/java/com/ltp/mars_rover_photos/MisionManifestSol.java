package com.ltp.mars_rover_photos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MisionManifestSol extends AppCompatActivity {
    ImageButton btnBackQuerying;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mision_manifest_sol);
        btnBackQuerying = findViewById(R.id.btnBackQuerying);

        btnBackQuerying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MisionManifestSol.this, Querying_sun.class);
                startActivity(intent);
            }
        });
    }
}