package com.example.pinkfloyd.TheDarkSideOfTheMoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.Animals.AHome;
import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;

public class TDSOTMHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdsotmhome);

        ImageButton bstm = (ImageButton) findViewById(R.id.bstm);
        ImageButton bbita = (ImageButton) findViewById(R.id.bbita);
        ImageButton botr = (ImageButton) findViewById(R.id.botr);
        ImageButton bt = (ImageButton) findViewById(R.id.bt);
        ImageButton btggits = (ImageButton) findViewById(R.id.btggits);
        ImageButton bm = (ImageButton) findViewById(R.id.bm);
        ImageButton buat = (ImageButton) findViewById(R.id.buat);
        ImageButton bacyl = (ImageButton) findViewById(R.id.bacyl);
        ImageButton bbd = (ImageButton) findViewById(R.id.bbd);
        ImageButton be = (ImageButton) findViewById(R.id.be);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bstm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stm = new Intent(TDSOTMHome.this, SpeakToMe.class);
                startActivity(stm);
            }
        });

        bbita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bita = new Intent(TDSOTMHome.this, BreatheInTheAir.class);
                startActivity(bita);
            }
        });

        botr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otr = new Intent(TDSOTMHome.this, OnTheRun.class);
                startActivity(otr);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(TDSOTMHome.this, MainActivity.class);
                startActivity(home);
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(TDSOTMHome.this, Time.class);
                startActivity(t);
            }
        });

        btggits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tggits = new Intent(TDSOTMHome.this, TheGreatGigInTheSky.class);
                startActivity(tggits);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(TDSOTMHome.this, MainActivity.class);
                startActivity(home);
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(TDSOTMHome.this, Money.class);
                startActivity(m);
            }
        });

        buat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uat = new Intent(TDSOTMHome.this, UsAndThem.class);
                startActivity(uat);
            }
        });

        bacyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acyl = new Intent(TDSOTMHome.this, AnyColourYouLike.class);
                startActivity(acyl);
            }
        });

        bbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bd = new Intent(TDSOTMHome.this, BrainDamage.class);
                startActivity(bd);
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(TDSOTMHome.this, Eclipse.class);
                startActivity(e);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(TDSOTMHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}