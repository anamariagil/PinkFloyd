package com.example.pinkfloyd.TheFinalCut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;

public class TFCHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tfchome);

        ImageButton btpwd = (ImageButton) findViewById(R.id.btpwd);
        ImageButton bypp = (ImageButton) findViewById(R.id.bypp);
        ImageButton bootf = (ImageButton) findViewById(R.id.bootf);
        ImageButton bwttbf = (ImageButton) findViewById(R.id.bwttbf);
        ImageButton bthr = (ImageButton) findViewById(R.id.bthr);
        ImageButton btgd = (ImageButton) findViewById(R.id.btgd);
        ImageButton bpe = (ImageButton) findViewById(R.id.bpe);
        ImageButton bgyfhomd = (ImageButton) findViewById(R.id.bgyfhomd);
        ImageButton btfmh = (ImageButton) findViewById(R.id.btfmh);
        ImageButton bsd = (ImageButton) findViewById(R.id.bsd);
        ImageButton btfc = (ImageButton) findViewById(R.id.btfc);
        ImageButton bnnj = (ImageButton) findViewById(R.id.bnnj);
        ImageButton btsits = (ImageButton) findViewById(R.id.btsits);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        btpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tpwd = new Intent(TFCHome.this, ThePostWarDream.class);
                startActivity(tpwd);
            }
        });

        bypp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ypp = new Intent(TFCHome.this, YourPossiblePasts.class);
                startActivity(ypp);
            }
        });

        bootf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ootf = new Intent(TFCHome.this, OneOfTheFew.class);
                startActivity(ootf);
            }
        });

        bwttbf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wttbf = new Intent(TFCHome.this, WhenTheTigersBrokeFree.class);
                startActivity(wttbf);
            }
        });

        bthr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thr = new Intent(TFCHome.this, TheHerosReturn.class);
                startActivity(thr);
            }
        });

        btgd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tgd = new Intent(TFCHome.this, TheGunnersDream.class);
                startActivity(tgd);
            }
        });

        bpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pe = new Intent(TFCHome.this, ParanoidEyes.class);
                startActivity(pe);
            }
        });

        bgyfhomd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gyfhomd = new Intent(TFCHome.this, GetYourFilthyHandsOffMyDesert.class);
                startActivity(gyfhomd);
            }
        });

        btfmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tfmh = new Intent(TFCHome.this, TheFletcherMemorialHome.class);
                startActivity(tfmh);
            }
        });

        bsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sd = new Intent(TFCHome.this, SouthamptonDock.class);
                startActivity(sd);
            }
        });

        btfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tfc = new Intent(TFCHome.this, TheFinalCut.class);
                startActivity(tfc);
            }
        });

        bnnj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nnj = new Intent(TFCHome.this, NotNowJohn.class);
                startActivity(nnj);
            }
        });

        btsits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tsits = new Intent(TFCHome.this, TwoSunsInTheSunset.class);
                startActivity(tsits);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(TFCHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}