package com.example.pinkfloyd.TheDivisionBell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.Animals.AHome;
import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;

public class TDBHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdbhome);

        ImageButton bco = (ImageButton) findViewById(R.id.bco);
        ImageButton bwdywfm = (ImageButton) findViewById(R.id.bwdywfm);
        ImageButton bpa = (ImageButton) findViewById(R.id.bpa);
        ImageButton bm = (ImageButton) findViewById(R.id.bm);
        ImageButton bagdff = (ImageButton) findViewById(R.id.bagdff);
        ImageButton bwtio = (ImageButton) findViewById(R.id.bwtio);
        ImageButton btib = (ImageButton) findViewById(R.id.btib);
        ImageButton bcbtl = (ImageButton) findViewById(R.id.bcbtl);
        ImageButton bkt = (ImageButton) findViewById(R.id.bkt);
        ImageButton blfw = (ImageButton) findViewById(R.id.blfw);
        ImageButton bhh = (ImageButton) findViewById(R.id.bhh);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent co = new Intent(TDBHome.this, ClusterOne.class);
                startActivity(co);
            }
        });

        bwdywfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wdywfm = new Intent(TDBHome.this, WhatDoYouWantFromMe.class);
                startActivity(wdywfm);
            }
        });

        bpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pa = new Intent(TDBHome.this, PolesApart.class);
                startActivity(pa);
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(TDBHome.this, Marooned.class);
                startActivity(m);
            }
        });

        bagdff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent agdff = new Intent(TDBHome.this, AGreatDayForFreedom.class);
                startActivity(agdff);
            }
        });

        bwtio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wtio = new Intent(TDBHome.this, WearingTheInsideOut.class);
                startActivity(wtio);
            }
        });

        btib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tib = new Intent(TDBHome.this, TakeItBack.class);
                startActivity(tib);
            }
        });

        bcbtl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cbtl = new Intent(TDBHome.this, ComingBackToLife.class);
                startActivity(cbtl);
            }
        });

        bco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent co = new Intent(TDBHome.this, ClusterOne.class);
                startActivity(co);
            }
        });

        bkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kt = new Intent(TDBHome.this, KeepTalking.class);
                startActivity(kt);
            }
        });

        blfw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lfw = new Intent(TDBHome.this, LostForWords.class);
                startActivity(lfw);
            }
        });

        bhh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hh = new Intent(TDBHome.this, HighHopes.class);
                startActivity(hh);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(TDBHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}