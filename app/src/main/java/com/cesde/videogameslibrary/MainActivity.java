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

public class MainActivity extends AppCompatActivity {

    Button btnSignIn;
    Button btnRegistrer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            btnSignIn = findViewById(R.id.btnSignIn);
            btnSignIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goHome();
                }
            });

            btnRegistrer = findViewById(R.id.btnRegistrer);
            btnRegistrer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goRegistrer();
                }
            });

    }

    public void goHome(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void goRegistrer(){
        Intent intent = new Intent(this, RegistrerActivity.class);
        startActivity(intent);
    }
}