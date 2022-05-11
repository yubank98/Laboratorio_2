package com.example.laboratorio_2_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_activty);
        Intent intent = getIntent(); //singleton
        String message = intent.getStringExtra("Message");
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);

    }
}