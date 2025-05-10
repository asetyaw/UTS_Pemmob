package com.example.uts;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class ListChattingActivity extends AppCompatActivity {
    ListView listView;
    String[] chats = {
            "Asep: Halo, apa kabar?",   // Daftar chat yang akan ditampilkan
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

    private int getRandomColor() {
        int[] vibrantColors = {     // Array warna-warna yang akan dipilih secara acak
                Color.parseColor("#FF6F61"), // Coral
                Color.parseColor("#6A67CE"), // Purple Blue
                Color.parseColor("#42A5F5"), // Light Blue
                Color.parseColor("#66BB6A"), // Light Green
                Color.parseColor("#FFCA28"), // Amber
                Color.parseColor("#EC407A"), // Pink
                Color.parseColor("#26C6DA"), // Cyan
                Color.parseColor("#AB47BC"), // Violet
        };
        return vibrantColors[new Random().nextInt(vibrantColors.length)];
    }


    // Array of nice material colors
    private final int[] avatarColors = {    // Array warna untuk avatar
            Color.parseColor("#FF5722"), // Deep Orange
            Color.parseColor("#3F51B5"), // Indigo
            Color.parseColor("#009688"), // Teal
            Color.parseColor("#FF9800"), // Orange
            Color.parseColor("#673AB7"), // Deep Purple
            Color.parseColor("#E91E63"), // Pink
            Color.parseColor("#4CAF50"), // Green
            Color.parseColor("#2196F3"), // Blue
            Color.parseColor("#795548"), // Brown
            Color.parseColor("#607D8B")  // Blue Grey
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chatting);    // Mengatur layout yang digunakan

        listView = findViewById(R.id.listView); // Menemukan ListView berdasarkan ID
        ChatAdapter adapter = new ChatAdapter(chats);   // Membuat instance dari ChatAdapter
        listView.setAdapter(adapter);   // Menetapkan adapter ke ListView

    }

    private class ChatAdapter extends ArrayAdapter<String> {    // Kelas untuk menyesuaikan tampilan setiap chat
        ChatAdapter(String[] items) {
            super(ListChattingActivity.this, 0, items); // Konstruktor untuk mengatur item chat
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext())
                        .inflate(R.layout.item_chat, parent, false);    // Mengatur layout untuk tiap item chat

            }

            String chat = getItem(position);    // Mengambil chat berdasarkan posisi
            String[] parts = chat.split(": ", 2);   // Memisahkan nama pengirim dan pesan chat
            String sender = parts[0];   // Menyimpan nama pengirim
            String message = parts.length > 1 ? parts[1] : "";  // Menyimpan pesan

            TextView tvSender = convertView.findViewById(R.id.tv_sender);   // Menemukan TextView untuk nama pengirim
            TextView tvMessage = convertView.findViewById(R.id.tv_message); // Menemukan TextView untuk pesan
            TextView tvAvatar = convertView.findViewById(R.id.tv_avatar);   // Menemukan TextView untuk avatar
            View avatarContainer = convertView.findViewById(R.id.avatar_container); // Menemukan container untuk avatar

            tvSender.setText(sender);   // Menampilkan nama pengirim
            tvMessage.setText(message); // Menampilkan pesan

            // Set avatar initial
            tvAvatar.setText("");   // Menampilkan avatar kosong (akan digantikan dengan warna acak)

            // Buat gradient oval
            GradientDrawable gradient = new GradientDrawable(   // Arah gradien
                    GradientDrawable.Orientation.TL_BR,
                    new int[]{getRandomColor(), getRandomColor()}   // Menetapkan warna acak untuk gradien
            );
            gradient.setShape(GradientDrawable.OVAL);   // Membuat bentuk oval untuk avatar
            avatarContainer.setBackground(gradient);    // Menetapkan latar belakang gradien pada avatar

            return convertView;
        }
    }
}