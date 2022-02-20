package com.example.pinkfloyd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.Animals.AHome;
import com.example.pinkfloyd.AtomHeartMother.AHMHome;
import com.example.pinkfloyd.Meddle.MeHome;
import com.example.pinkfloyd.More.MHome;
import com.example.pinkfloyd.TheDarkSideOfTheMoon.TDSOTMHome;
import com.example.pinkfloyd.TheDivisionBell.TDBHome;
import com.example.pinkfloyd.TheEndlessRiver.TERHome;
import com.example.pinkfloyd.TheFinalCut.TFCHome;
import com.example.pinkfloyd.TheWall.TWHome;
import com.example.pinkfloyd.WishYouWereHere.WYWHHome;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btfc = (ImageButton) findViewById(R.id.btfc);
        ImageButton ba = (ImageButton) findViewById(R.id.ba);
        ImageButton bwywh = (ImageButton) findViewById(R.id.bwywh);
        ImageButton btdsotm = (ImageButton) findViewById(R.id.btdsotm);
        ImageButton bm = (ImageButton) findViewById(R.id.bm);
        ImageButton btdb = (ImageButton) findViewById(R.id.btdb);
        ImageButton btw = (ImageButton) findViewById(R.id.btw);
        ImageButton bahm = (ImageButton) findViewById(R.id.bahm);
        ImageButton bme = (ImageButton) findViewById(R.id.bme);
        ImageButton bter = (ImageButton) findViewById(R.id.bter);

        btfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tfc = new Intent(MainActivity.this, TFCHome.class);
                startActivity(tfc);
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, AHome.class);
                startActivity(a);
            }
        });

        bwywh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wywh = new Intent(MainActivity.this, WYWHHome.class);
                startActivity(wywh);
            }
        });

        btdsotm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tdsotm = new Intent(MainActivity.this, TDSOTMHome.class);
                startActivity(tdsotm);
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this, MHome.class);
                startActivity(m);
            }
        });

        btdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tdb = new Intent(MainActivity.this, TDBHome.class);
                startActivity(tdb);
            }
        });

        btw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tw = new Intent(MainActivity.this, TWHome.class);
                startActivity(tw);
            }
        });

        bahm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ahm = new Intent(MainActivity.this, AHMHome.class);
                startActivity(ahm);
            }
        });

        bme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me = new Intent(MainActivity.this, MeHome.class);
                startActivity(me);
            }
        });

        bter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ter = new Intent(MainActivity.this, TERHome.class);
                startActivity(ter);
            }
        });
    }
}