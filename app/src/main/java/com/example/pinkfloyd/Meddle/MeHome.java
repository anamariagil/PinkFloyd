package com.example.pinkfloyd.Meddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;
import com.example.pinkfloyd.TheFinalCut.OneOfTheFew;

public class MeHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_home);

        ImageButton bootd = (ImageButton) findViewById(R.id.bootd);
        ImageButton bapow = (ImageButton) findViewById(R.id.bapow);
        ImageButton bf = (ImageButton) findViewById(R.id.bf);
        ImageButton bst = (ImageButton) findViewById(R.id.bst);
        ImageButton bs = (ImageButton) findViewById(R.id.bs);
        ImageButton be = (ImageButton) findViewById(R.id.be);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bootd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ootd = new Intent(MeHome.this, OneOfTheseDays.class);
                startActivity(ootd);
            }
        });

        bapow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent apow = new Intent(MeHome.this, APillowOfWinds.class);
                startActivity(apow);
            }
        });

        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(MeHome.this, Fearless.class);
                startActivity(f);
            }
        });

        bst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent st = new Intent(MeHome.this, SanTropez.class);
                startActivity(st);
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(MeHome.this, Seamus.class);
                startActivity(s);
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MeHome.this, Echoes.class);
                startActivity(e);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(MeHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}