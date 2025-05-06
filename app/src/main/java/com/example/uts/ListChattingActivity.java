package com.example.uts;

import android.graphics.Color;
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

    // Array of nice material colors
    private final int[] avatarColors = {
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
        setContentView(R.layout.activity_list_chatting);

        listView = findViewById(R.id.listView);
        ChatAdapter adapter = new ChatAdapter(chats);
        listView.setAdapter(adapter);
    }

    private class ChatAdapter extends ArrayAdapter<String> {
        ChatAdapter(String[] items) {
            super(ListChattingActivity.this, 0, items);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext())
                        .inflate(R.layout.item_chat, parent, false);
            }

            String chat = getItem(position);
            String[] parts = chat.split(": ", 2);
            String sender = parts[0];
            String message = parts.length > 1 ? parts[1] : "";

            TextView tvSender = convertView.findViewById(R.id.tv_sender);
            TextView tvMessage = convertView.findViewById(R.id.tv_message);
            TextView tvAvatar = convertView.findViewById(R.id.tv_avatar);
            View avatarContainer = convertView.findViewById(R.id.avatar_container);

            tvSender.setText(sender);
            tvMessage.setText(message);

            // Set avatar initial
            String initial = sender.substring(0, 1).toUpperCase();
            tvAvatar.setText(initial);

            // Set consistent color based on sender name hash
            int colorIndex = Math.abs(sender.hashCode()) % avatarColors.length;
            avatarContainer.setBackgroundColor(avatarColors[colorIndex]);

            return convertView;
        }
    }
}