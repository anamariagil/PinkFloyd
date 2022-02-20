package com.example.pinkfloyd.More;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.Animals.AHome;
import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;

public class MHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhome);

        ImageButton bcm = (ImageButton) findViewById(R.id.bcm);
        ImageButton btns = (ImageButton) findViewById(R.id.btns);
        ImageButton bcs = (ImageButton) findViewById(R.id.bcs);
        ImageButton butk = (ImageButton) findViewById(R.id.butk);
        ImageButton bgitc = (ImageButton) findViewById(R.id.bgitc);
        ImageButton bc = (ImageButton) findViewById(R.id.bc);
        ImageButton bps = (ImageButton) findViewById(R.id.bps);
        ImageButton bmt = (ImageButton) findViewById(R.id.bmt);
        ImageButton bib = (ImageButton) findViewById(R.id.bib);
        ImageButton bmb = (ImageButton) findViewById(R.id.bmb);
        ImageButton bq = (ImageButton) findViewById(R.id.bq);
        ImageButton basp = (ImageButton) findViewById(R.id.basp);
        ImageButton bdt = (ImageButton) findViewById(R.id.bdt);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cm = new Intent(MHome.this, CirrusMinor.class);
                startActivity(cm);
            }
        });

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tns = new Intent(MHome.this, TheNileSong.class);
                startActivity(tns);
            }
        });

        bcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cs = new Intent(MHome.this, CryingSong.class);
                startActivity(cs);
            }
        });

        butk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent utk = new Intent(MHome.this, UpTheKhyber.class);
                startActivity(utk);
            }
        });

        bgitc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gitc = new Intent(MHome.this, GreenIsTheColor.class);
                startActivity(gitc);
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MHome.this, Cymbaline.class);
                startActivity(c);
            }
        });

        bps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ps = new Intent(MHome.this, PartySequence.class);
                startActivity(ps);
            }
        });

        bmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mt = new Intent(MHome.this, MainTheme.class);
                startActivity(mt);
            }
        });

        bib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ib = new Intent(MHome.this, IbizaBar.class);
                startActivity(ib);
            }
        });

        bmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mb = new Intent(MHome.this, MoreBlues.class);
                startActivity(mb);
            }
        });

        bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q = new Intent(MHome.this, Quicksilver.class);
                startActivity(q);
            }
        });

        basp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asp = new Intent(MHome.this, ASpanishPiece.class);
                startActivity(asp);
            }
        });

        bdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dt = new Intent(MHome.this, DramaticTheme.class);
                startActivity(dt);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(MHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}