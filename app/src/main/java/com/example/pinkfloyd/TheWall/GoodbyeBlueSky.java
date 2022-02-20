package com.example.pinkfloyd.TheWall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.WishYouWereHere.WelcomeToTheMachine;

public class GoodbyeBlueSky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodbye_blue_sky);

        Button bprevious = (Button) findViewById(R.id.bprevious);
        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previous = new Intent(GoodbyeBlueSky.this, Mother.class);
                startActivity(previous);
            }
        });

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(GoodbyeBlueSky.this, EmptySpaces.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(GoodbyeBlueSky.this, TWHome.class);
                startActivity(home);
            }
        });
    }
}