package com.example.pinkfloyd.WishYouWereHere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.Animals.AHome;
import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;

public class WYWHHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wywhhome);

        ImageButton bsoycd1 = (ImageButton) findViewById(R.id.bsoycd1);
        ImageButton bwttm = (ImageButton) findViewById(R.id.bwttm);
        ImageButton bhac = (ImageButton) findViewById(R.id.bhac);
        ImageButton bwywh = (ImageButton) findViewById(R.id.bwywh);
        ImageButton bsoycd2 = (ImageButton) findViewById(R.id.bsoycd2);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bsoycd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent soycd1 = new Intent(WYWHHome.this, ShineOnYouCrazyDiamond1.class);
                startActivity(soycd1);
            }
        });

        bwttm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wttm = new Intent(WYWHHome.this, WelcomeToTheMachine.class);
                startActivity(wttm);
            }
        });

        bhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hac = new Intent(WYWHHome.this, HaveACigar.class);
                startActivity(hac);
            }
        });

        bwywh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wywh = new Intent(WYWHHome.this, WishYouWereHere.class);
                startActivity(wywh);
            }
        });

        bsoycd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent soycd2 = new Intent(WYWHHome.this, ShineOnYouCrazyDiamond2.class);
                startActivity(soycd2);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(WYWHHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}