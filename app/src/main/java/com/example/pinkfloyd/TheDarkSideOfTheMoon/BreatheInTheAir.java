package com.example.pinkfloyd.TheDarkSideOfTheMoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.WishYouWereHere.HaveACigar;
import com.example.pinkfloyd.WishYouWereHere.WYWHHome;
import com.example.pinkfloyd.WishYouWereHere.WelcomeToTheMachine;
import com.example.pinkfloyd.WishYouWereHere.WishYouWereHere;

public class BreatheInTheAir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathe_in_the_air);

        Button bprevious = (Button) findViewById(R.id.bprevious);
        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previous = new Intent(BreatheInTheAir.this, SpeakToMe.class);
                startActivity(previous);
            }
        });

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(BreatheInTheAir.this, OnTheRun.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(BreatheInTheAir.this, TDSOTMHome.class);
                startActivity(home);
            }
        });
    }
}