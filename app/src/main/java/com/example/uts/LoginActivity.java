package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername); //menangkap input pengguna
        etPassword = findViewById(R.id.etPassword); //menangkap input pengguna
        btnLogin = findViewById(R.id.btnLogin); //login dan mendaftar
        btnRegister = findViewById(R.id.btnRegister);   //login dan mendaftar

        btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, ListChattingActivity.class));  // Arahkan ke ListChattingActivity setelah login
        });

        btnRegister.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));  // Arahkan ke RegisterActivity
        });
    }
}
