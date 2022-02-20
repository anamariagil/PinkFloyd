package com.example.pinkfloyd.Animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;
import com.example.pinkfloyd.TheFinalCut.TFCHome;

public class AHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahome);

        ImageButton bpotw1 = (ImageButton) findViewById(R.id.bpotw1);
        ImageButton bd = (ImageButton) findViewById(R.id.bd);
        ImageButton bp = (ImageButton) findViewById(R.id.bp);
        ImageButton bs = (ImageButton) findViewById(R.id.bs);
        ImageButton bpotw2 = (ImageButton) findViewById(R.id.bpotw2);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bpotw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent potw1 = new Intent(AHome.this, PigsOnTheWing1.class);
                startActivity(potw1);
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(AHome.this, Dogs.class);
                startActivity(d);
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(AHome.this, Pigs.class);
                startActivity(p);
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(AHome.this, Sheep.class);
                startActivity(s);
            }
        });

        bpotw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent potw2 = new Intent(AHome.this, PigsOnTheWing2.class);
                startActivity(potw2);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(AHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}