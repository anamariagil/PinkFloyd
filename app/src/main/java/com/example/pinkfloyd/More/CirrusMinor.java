package com.example.pinkfloyd.More;

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

public class CirrusMinor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cirrus_minor);

        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(CirrusMinor.this, TheNileSong.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(CirrusMinor.this, MHome.class);
                startActivity(home);
            }
        });
    }
}