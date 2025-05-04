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
            "Euis: Maaf telat bales 😅"
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
