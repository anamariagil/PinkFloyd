package com.example.pinkfloyd.Meddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.More.TheNileSong;
import com.example.pinkfloyd.R;

public class Echoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echoes);

        Button bprevious = (Button) findViewById(R.id.bprevious);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previous = new Intent(Echoes.this, Seamus.class);
                startActivity(previous);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(Echoes.this, MeHome.class);
                startActivity(home);
            }
        });
    }
}