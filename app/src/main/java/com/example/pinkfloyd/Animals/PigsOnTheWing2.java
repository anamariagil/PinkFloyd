package com.example.pinkfloyd.Animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;

public class PigsOnTheWing2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pigs_on_the_wing2);

        Button bprevious = (Button) findViewById(R.id.bprevious);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previous = new Intent(PigsOnTheWing2.this, Sheep.class);
                startActivity(previous);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(PigsOnTheWing2.this, AHome.class);
                startActivity(home);
            }
        });
    }
}