package com.cesde.videogameslibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {

    ImageView iVAccount;
    ImageView iVNotify;
    ImageView iVHome;
    ImageView iVMenu;
    Button btnNotifications;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        iVAccount = findViewById(R.id.iVAccount);
        iVAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goAccount();
            }
        });

        iVNotify = findViewById(R.id.iBNotify);
        iVNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goNotify();
            }
        });

        iVHome = findViewById(R.id.iBHome);
        iVHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHome();
            }
        });

        iVMenu = findViewById(R.id.iBMenu);
        iVMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goMenu();
            }
        });

        btnNotifications = findViewById(R.id.btnNotifications);
        btnNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goNotify();
            }
        });
    }

    public void goAccount(){
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }
    public void goNotify(){
        Intent intent = new Intent(this, NotificationsActivity.class);
        startActivity(intent);
    }
    public void goHome(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    public void goMenu(){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}