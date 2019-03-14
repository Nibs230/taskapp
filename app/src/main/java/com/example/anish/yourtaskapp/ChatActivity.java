package com.example.anish.yourtaskapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ChatActivity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;
    private LinearLayout niche;
    private RelativeLayout lay1;
    private RelativeLayout lay2;
    private RelativeLayout lay3;
    private RelativeLayout lay4;
    private RelativeLayout lay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        toolbar=findViewById(R.id.toolbar_chat);
        niche=findViewById(R.id.iconsdown);
        lay1=findViewById(R.id.home1);
        lay2=findViewById(R.id.file1);
        lay3=findViewById(R.id.contact1);
        lay4=findViewById(R.id.chat1);
        lay5=findViewById(R.id.stats1);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chat with officials");

        // niche ka code///////////////////////////////

        lay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            }
        });
        lay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FileActivity.class));
            }
        });
        lay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ContactActivity.class));
            }
        });
        lay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ChatActivity.class));
            }
        });
        lay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StatsActivity.class));
            }
        });

        /////////////////////////////////////////

    }
}
