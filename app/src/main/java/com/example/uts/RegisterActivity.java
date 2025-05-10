package com.example.uts;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText etNewUser; //Menangkap input nama pengguna baru
    Button btnSubmit;   //Button untuk mengirimkan data registrasi
    ImageView logo;     //Gambar logo yang ditampilkan di layar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNewUser = findViewById(R.id.etNewUser);
        btnSubmit = findViewById(R.id.btnSubmit);
        logo = findViewById(R.id.ivLogo);

        btnSubmit.setOnClickListener(v -> {
            Log.d("Register", "Register button clicked!");  // Logging untuk mengetahui jika tombol ditekan
            Toast.makeText(this, "Pendaftaran berhasil!", Toast.LENGTH_SHORT).show();   // Menampilkan pesan sukses
            Toast.makeText(this, "Selamat datang", Toast.LENGTH_LONG).show();   // Menampilkan pesan selamat datang
        });
    }
}
