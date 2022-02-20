package com.example.pinkfloyd.TheEndlessRiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.Animals.AHome;
import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;

public class TERHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terhome);

        ImageButton btlu = (ImageButton) findViewById(R.id.btlu);
        ImageButton biwwd = (ImageButton) findViewById(R.id.biwwd);
        ImageButton beaf = (ImageButton) findViewById(R.id.beaf);
        ImageButton bs = (ImageButton) findViewById(R.id.bs);
        ImageButton bsk = (ImageButton) findViewById(R.id.bsk);
        ImageButton bu = (ImageButton) findViewById(R.id.bu);
        ImageButton ba = (ImageButton) findViewById(R.id.ba);
        ImageButton btlaoc = (ImageButton) findViewById(R.id.btlaoc);
        ImageButton bons = (ImageButton) findViewById(R.id.bons);
        ImageButton bnl = (ImageButton) findViewById(R.id.bnl);
        ImageButton bay1 = (ImageButton) findViewById(R.id.bay1);
        ImageButton bau = (ImageButton) findViewById(R.id.bau);
        ImageButton bay2 = (ImageButton) findViewById(R.id.bay2);
        ImageButton bth = (ImageButton) findViewById(R.id.bth);
        ImageButton bc = (ImageButton) findViewById(R.id.bc);
        ImageButton betp = (ImageButton) findViewById(R.id.betp);
        ImageButton bsu = (ImageButton) findViewById(R.id.bsu);
        ImageButton bltw = (ImageButton) findViewById(R.id.bltw);
        ImageButton bt = (ImageButton) findViewById(R.id.bt);
        ImageButton btb = (ImageButton) findViewById(R.id.btb);
        ImageButton bn = (ImageButton) findViewById(R.id.bn);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        btlu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tlu = new Intent(TERHome.this, ThingsLeftUnsaid.class);
                startActivity(tlu);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(TERHome.this, MainActivity.class);
                startActivity(home);
            }
        });

        biwwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iwwd = new Intent(TERHome.this, ItsWhatWeDo.class);
                startActivity(iwwd);
            }
        });

        beaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eaf = new Intent(TERHome.this, EbbAndFlow.class);
                startActivity(eaf);
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(TERHome.this, Sum.class);
                startActivity(s);
            }
        });

        bsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sk = new Intent(TERHome.this, Skins.class);
                startActivity(sk);
            }
        });

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(TERHome.this, Unsung.class);
                startActivity(u);
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TERHome.this, Anisina.class);
                startActivity(a);
            }
        });

        btlaoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tlaoc = new Intent(TERHome.this, TheLostArtOfConversation.class);
                startActivity(tlaoc);
            }
        });

        bons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ons = new Intent(TERHome.this, OnNoodleStreet.class);
                startActivity(ons);
            }
        });

        bnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nl = new Intent(TERHome.this, NightLight.class);
                startActivity(nl);
            }
        });

        bay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ay1 = new Intent(TERHome.this, Allonsy1.class);
                startActivity(ay1);
            }
        });

        bau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent au = new Intent(TERHome.this, Autumn68.class);
                startActivity(au);
            }
        });

        bay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ay2 = new Intent(TERHome.this, Allonsy2.class);
                startActivity(ay2);
            }
        });

        bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent th = new Intent(TERHome.this, TalkingHawking.class);
                startActivity(th);
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(TERHome.this, Calling.class);
                startActivity(c);
            }
        });

        betp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent etp = new Intent(TERHome.this, EyesToPearls.class);
                startActivity(etp);
            }
        });

        bsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent su = new Intent(TERHome.this, Surfacing.class);
                startActivity(su);
            }
        });

        bltw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltw = new Intent(TERHome.this, LouderThanWords.class);
                startActivity(ltw);
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(TERHome.this, TBS9.class);
                startActivity(t);
            }
        });

        btb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tb = new Intent(TERHome.this, TBS14.class);
                startActivity(tb);
            }
        });

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(TERHome.this, Nervana.class);
                startActivity(n);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(TERHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}