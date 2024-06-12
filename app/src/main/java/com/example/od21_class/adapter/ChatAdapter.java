package com.example.od21_class.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.od21_class.R;
import com.example.od21_class.model.Chat;

import java.util.Collections;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ViewHolder>  {
    List<Chat> list =  Collections.emptyList();
    public ChatAdapter(List<Chat> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.recyclerview_row, parent, false);

        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Chat chat = list.get(position);
        holder.title.setText(chat.getSenderName());
        holder.message.setText(chat.getSenderMessage());
        holder.profileImage.setImageResource(chat.getSenderProfile());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Name: "+chat.getSenderName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    ImageView profileImage;
    TextView title, message;
    View view;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        profileImage = itemView.findViewById(R.id.profileImage);
        title = itemView.findViewById(R.id.title);
        message = itemView.findViewById(R.id.message);
        view = itemView;
    }
}