package com.example.pinkfloyd.AtomHeartMother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.Animals.AHome;
import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;

public class AHMHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahmhome);

        ImageButton bahm = (ImageButton) findViewById(R.id.bahm);
        ImageButton bi = (ImageButton) findViewById(R.id.bi);
        ImageButton bs = (ImageButton) findViewById(R.id.bs);
        ImageButton bfos = (ImageButton) findViewById(R.id.bfos);
        ImageButton bapb = (ImageButton) findViewById(R.id.bapb);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bahm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ahm = new Intent(AHMHome.this, AtomHeartMother.class);
                startActivity(ahm);
            }
        });

        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AHMHome.this, If.class);
                startActivity(i);
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(AHMHome.this, Summer68.class);
                startActivity(s);
            }
        });

        bfos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fos = new Intent(AHMHome.this, FatOldSun.class);
                startActivity(fos);
            }
        });

        bapb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent apb = new Intent(AHMHome.this, AlansPsychedelicBreakfast.class);
                startActivity(apb);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(AHMHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}