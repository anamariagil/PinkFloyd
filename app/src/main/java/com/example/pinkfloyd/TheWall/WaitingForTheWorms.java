package com.example.pinkfloyd.TheWall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.WishYouWereHere.WelcomeToTheMachine;

public class WaitingForTheWorms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_for_the_worms);

        Button bprevious = (Button) findViewById(R.id.bprevious);
        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previous = new Intent(WaitingForTheWorms.this, RunLikeHell.class);
                startActivity(previous);
            }
        });

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(WaitingForTheWorms.this, Stop.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(WaitingForTheWorms.this, TWHome.class);
                startActivity(home);
            }
        });
    }
}