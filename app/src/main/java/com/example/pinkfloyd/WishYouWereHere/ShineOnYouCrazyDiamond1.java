package com.example.pinkfloyd.WishYouWereHere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.TheFinalCut.NotNowJohn;
import com.example.pinkfloyd.TheFinalCut.TFCHome;
import com.example.pinkfloyd.TheFinalCut.TheFinalCut;
import com.example.pinkfloyd.TheFinalCut.TwoSunsInTheSunset;

public class ShineOnYouCrazyDiamond1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shine_on_you_crazy_diamond1);

        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ShineOnYouCrazyDiamond1.this, WelcomeToTheMachine.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ShineOnYouCrazyDiamond1.this, WYWHHome.class);
                startActivity(home);
            }
        });
    }
}