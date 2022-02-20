package com.example.pinkfloyd.TheDivisionBell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.WishYouWereHere.WelcomeToTheMachine;

public class WearingTheInsideOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wearing_the_inside_out);

        Button bprevious = (Button) findViewById(R.id.bprevious);
        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previous = new Intent(WearingTheInsideOut.this, AGreatDayForFreedom.class);
                startActivity(previous);
            }
        });

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(WearingTheInsideOut.this, TakeItBack.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(WearingTheInsideOut.this, TDBHome.class);
                startActivity(home);
            }
        });
    }
}