package com.example.pinkfloyd.WishYouWereHere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.TheFinalCut.TheFinalCut;

public class WishYouWereHere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_you_were_here);

        Button bprevious = (Button) findViewById(R.id.bprevious);
        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previous = new Intent(WishYouWereHere.this, HaveACigar.class);
                startActivity(previous);
            }
        });

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(WishYouWereHere.this, ShineOnYouCrazyDiamond2.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(WishYouWereHere.this, WYWHHome.class);
                startActivity(home);
            }
        });
    }
}