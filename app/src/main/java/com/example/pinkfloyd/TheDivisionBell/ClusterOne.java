package com.example.pinkfloyd.TheDivisionBell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.WishYouWereHere.HaveACigar;
import com.example.pinkfloyd.WishYouWereHere.WYWHHome;
import com.example.pinkfloyd.WishYouWereHere.WelcomeToTheMachine;
import com.example.pinkfloyd.WishYouWereHere.WishYouWereHere;

public class ClusterOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cluster_one);

        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ClusterOne.this, WhatDoYouWantFromMe.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ClusterOne.this, TDBHome.class);
                startActivity(home);
            }
        });
    }
}