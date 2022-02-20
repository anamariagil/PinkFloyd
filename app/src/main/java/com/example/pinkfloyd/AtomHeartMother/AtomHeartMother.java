package com.example.pinkfloyd.AtomHeartMother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.Animals.AHome;
import com.example.pinkfloyd.R;
import com.example.pinkfloyd.TheDarkSideOfTheMoon.AnyColourYouLike;
import com.example.pinkfloyd.TheDarkSideOfTheMoon.BrainDamage;
import com.example.pinkfloyd.TheDarkSideOfTheMoon.TDSOTMHome;
import com.example.pinkfloyd.TheDarkSideOfTheMoon.UsAndThem;

public class AtomHeartMother extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atom_heart_mother);

        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(AtomHeartMother.this, If.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(AtomHeartMother.this, AHMHome.class);
                startActivity(home);
            }
        });
    }
}