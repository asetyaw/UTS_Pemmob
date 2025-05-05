package com.example.uts;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ListChattingActivity extends AppCompatActivity {
    ListView listView ;
    String[] chats = {
            "Asep: Halo, apa kabar?",
            "Budi: Besok jadi ngumpul gak?",
            "Citra: Lihat tugas dong",
            "Deni: Woy online woy",
            "Euis: Maaf telat bales 😅",
            "Fahri: Ada yang punya catatan kuliah kemarin?",
            "Gina: Guys, film baru udah keluar!",
            "Hendra: Lagi di jalan nih, agak telat.",
            "Intan: Semangat belajarnya ya semua!",
            "Joko: Ada yang tau cara ngerjain soal ini?",
            "Kartika: Otw!",
            "Lina: Jangan lupa bawa makanan ya besok.",
            "Miko: Siapa yang mau ikut main?",
            "Nadia: Baru selesai meeting nih, capek banget.",
            "Oscar: Ada info loker terbaru gak?",
            "Putri: Lagi nyoba resep baru nih.",
            "Rizky: Mantap!",
            "Santi: Udah pada ngerjain proyek belum?",
            "Toni: Besok jam berapa kumpulnya?",
            "Vera: Seru banget acaranya!",
            "Wawan: Ada yang bisa bantu coding?",
            "Yeni: Lagi fokus ngerjain tugas akhir.",
            "Zainal: Sampai jumpa besok!"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chatting);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, chats);
        listView.setAdapter(adapter);
    }
}
