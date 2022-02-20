package com.example.pinkfloyd.WishYouWereHere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.TheFinalCut.TheFinalCut;

public class ShineOnYouCrazyDiamond2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shine_on_you_crazy_diamond2);

        Button bprevious = (Button) findViewById(R.id.bprevious);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previous = new Intent(ShineOnYouCrazyDiamond2.this, WishYouWereHere.class);
                startActivity(previous);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ShineOnYouCrazyDiamond2.this, WYWHHome.class);
                startActivity(home);
            }
        });
    }
}