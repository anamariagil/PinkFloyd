package com.example.pinkfloyd.AtomHeartMother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.TheDarkSideOfTheMoon.UsAndThem;

public class AlansPsychedelicBreakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alans_psychedelic_breakfast);

        Button bprevious = (Button) findViewById(R.id.bprevious);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previous = new Intent(AlansPsychedelicBreakfast.this, FatOldSun.class);
                startActivity(previous);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(AlansPsychedelicBreakfast.this, AHMHome.class);
                startActivity(home);
            }
        });
    }
}