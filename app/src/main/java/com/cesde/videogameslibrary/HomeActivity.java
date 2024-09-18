package com.cesde.videogameslibrary;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    ImageView btnAccount;
    ImageView btnHomeReturn;
    ImageView btnNotify;
    ImageView btnMenu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnAccount = findViewById(R.id.iWAccount);
        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goAccount();
            }
        });

        btnNotify = findViewById(R.id.iBNotify);
        btnNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goNotify();
            }
        });

        btnHomeReturn = findViewById(R.id.iBHome);
        btnHomeReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHomeReturn();
            }
        });

        btnMenu = findViewById(R.id.iBMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goMenu();
            }
        });


    };

    public void goAccount(){
        Intent intentAccount = new Intent(this, AccountActivity.class);
        startActivity(intentAccount);

    }
    public void goHomeReturn(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    public void goNotify(){
        Intent intentNotify = new Intent(this, NotificationsActivity.class);
        startActivity(intentNotify);
    }
    public void goMenu(){
        Intent intentMenu = new Intent(this, MenuActivity.class);
        startActivity(intentMenu);
    }
}
