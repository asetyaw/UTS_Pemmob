package com.example.uts;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText etNewUser;
    Button btnSubmit;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNewUser = findViewById(R.id.etNewUser);
        btnSubmit = findViewById(R.id.btnSubmit);
        logo = findViewById(R.id.ivLogo);

        btnSubmit.setOnClickListener(v -> {
            Log.d("Register", "Register button clicked!");
            Toast.makeText(this, "Pendaftaran berhasil!", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Selamat datang", Toast.LENGTH_LONG).show();
        });
    }
}
