package com.example.glink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    String username = "rico";
    String password = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText textUser = findViewById(R.id.User);
        EditText textPass = findViewById(R.id.Pass);
        ImageView masuk = findViewById(R.id.Masuk);

        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }


        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textUser.getText().toString().equalsIgnoreCase(username) && textPass.getText().toString().equalsIgnoreCase(password)) {
                    startActivity(new Intent(login.this, menutama.class));
                } else {
                    Toast.makeText(login.this, "Password atau User id salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}