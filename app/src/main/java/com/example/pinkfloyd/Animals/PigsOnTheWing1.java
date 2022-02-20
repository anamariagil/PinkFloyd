package com.example.pinkfloyd.Animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.TheFinalCut.OneOfTheFew;
import com.example.pinkfloyd.TheFinalCut.TFCHome;
import com.example.pinkfloyd.TheFinalCut.WhenTheTigersBrokeFree;
import com.example.pinkfloyd.TheFinalCut.YourPossiblePasts;

public class PigsOnTheWing1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pigs_on_the_wing1);

        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(PigsOnTheWing1.this, Dogs.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(PigsOnTheWing1.this, AHome.class);
                startActivity(home);
            }
        });
    }
}