package com.cesde.videogameslibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipGroup;

public class AccountActivity extends AppCompatActivity {

     Button btnSingOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        btnSingOut = findViewById(R.id.btnSingOut);
        btnSingOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goSingIn();
            }
        });

    }

    public void goSingIn(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}