package com.example.od21_class;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.od21_class.adapter.ChatAdapter;
import com.example.od21_class.model.Chat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Chat> chatList = new ArrayList<Chat>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadChats();
        recyclerView = findViewById(R.id.recyclerView);
        ChatAdapter chatAdapter =  new ChatAdapter(chatList);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(chatAdapter);

    }

    private void loadChats() {
        chatList.add(new Chat(1,"Ethan Kilian","Hi, How are you?",R.drawable.img));
        chatList.add(new Chat(1,"Josh Mwenda","Hi, How are you?",R.drawable.img_1));
        chatList.add(new Chat(1,"Anna Joshua","Hi, How are you?",R.drawable.img_5));
        chatList.add(new Chat(1,"Peter Chenge","Hi, How are you?",R.drawable.img_2));
        chatList.add(new Chat(1,"Tuli Afldi","Hi, How are you?",R.drawable.img_4));
        chatList.add(new Chat(1,"Evan Kilian","Hi, How are you?",R.drawable.img_6));
    }
}