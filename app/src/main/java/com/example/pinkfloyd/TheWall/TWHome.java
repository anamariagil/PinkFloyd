package com.example.pinkfloyd.TheWall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pinkfloyd.Animals.AHome;
import com.example.pinkfloyd.MainActivity;
import com.example.pinkfloyd.R;

public class TWHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twhome);

        ImageButton bitf1 = (ImageButton) findViewById(R.id.bitf1);
        ImageButton btti = (ImageButton) findViewById(R.id.btti);
        ImageButton babitw1 = (ImageButton) findViewById(R.id.babitw1);
        ImageButton bthdool = (ImageButton) findViewById(R.id.bthdool);
        ImageButton babitw2 = (ImageButton) findViewById(R.id.babitw2);
        ImageButton bm = (ImageButton) findViewById(R.id.bm);
        ImageButton bgbs = (ImageButton) findViewById(R.id.bgbs);
        ImageButton bes = (ImageButton) findViewById(R.id.bes);
        ImageButton byl = (ImageButton) findViewById(R.id.byl);
        ImageButton boomt = (ImageButton) findViewById(R.id.boomt);
        ImageButton bdlmn = (ImageButton) findViewById(R.id.bdlmn);
        ImageButton babitw3 = (ImageButton) findViewById(R.id.babitw3);
        ImageButton bgcw = (ImageButton) findViewById(R.id.bgcw);
        ImageButton bhy = (ImageButton) findViewById(R.id.bhy);
        ImageButton bitaot = (ImageButton) findViewById(R.id.bitaot);
        ImageButton bnh = (ImageButton) findViewById(R.id.bnh);
        ImageButton bv = (ImageButton) findViewById(R.id.bv);
        ImageButton bbtbbh = (ImageButton) findViewById(R.id.bbtbbh);
        ImageButton bcn = (ImageButton) findViewById(R.id.bcn);
        ImageButton btsmgo = (ImageButton) findViewById(R.id.btsmgo);
        ImageButton bitf2 = (ImageButton) findViewById(R.id.bitf2);
        ImageButton brlh = (ImageButton) findViewById(R.id.brlh);
        ImageButton bwftw = (ImageButton) findViewById(R.id.bwftw);
        ImageButton bs = (ImageButton) findViewById(R.id.bs);
        ImageButton btt = (ImageButton) findViewById(R.id.btt);
        ImageButton botw = (ImageButton) findViewById(R.id.botw);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bitf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itf1 = new Intent(TWHome.this, InTheFlesh1.class);
                startActivity(itf1);
            }
        });

        btti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tti = new Intent(TWHome.this, TheThinIce.class);
                startActivity(tti);
            }
        });

        babitw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abitw1 = new Intent(TWHome.this, AnotherBrickInTheWall1.class);
                startActivity(abitw1);
            }
        });

        bthdool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thdool = new Intent(TWHome.this, TheHappiestDaysOfOurLives.class);
                startActivity(thdool);
            }
        });

        babitw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abitw2 = new Intent(TWHome.this, AnotherBrickInTheWall2.class);
                startActivity(abitw2);
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(TWHome.this, Mother.class);
                startActivity(m);
            }
        });

        bgbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gbs = new Intent(TWHome.this, GoodbyeBlueSky.class);
                startActivity(gbs);
            }
        });

        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent es = new Intent(TWHome.this, EmptySpaces.class);
                startActivity(es);
            }
        });

        byl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yl = new Intent(TWHome.this, YoungLust.class);
                startActivity(yl);
            }
        });

        boomt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oomt = new Intent(TWHome.this, OneOfMyTurns.class);
                startActivity(oomt);
            }
        });

        bdlmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dlmn = new Intent(TWHome.this, DontLeaveMeNow.class);
                startActivity(dlmn);
            }
        });

        babitw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abitw3 = new Intent(TWHome.this, AnotherBrickInTheWall3.class);
                startActivity(abitw3);
            }
        });

        bgcw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gcw = new Intent(TWHome.this, GoodbyeCruelWorld.class);
                startActivity(gcw);
            }
        });

        bhy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hy = new Intent(TWHome.this, HeyYou.class);
                startActivity(hy);
            }
        });

        bitaot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itaot = new Intent(TWHome.this, IsThereAnybodyOutThere.class);
                startActivity(itaot);
            }
        });

        bnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nh = new Intent(TWHome.this, NobodyHome.class);
                startActivity(nh);
            }
        });

        bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(TWHome.this, Vera.class);
                startActivity(v);
            }
        });

        bbtbbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btbbh = new Intent(TWHome.this, BringTheBoysBackHome.class);
                startActivity(btbbh);
            }
        });

        bcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cn = new Intent(TWHome.this, ComfortablyNumb.class);
                startActivity(cn);
            }
        });

        btsmgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tsmgo = new Intent(TWHome.this, TheShowMustGoOn.class);
                startActivity(tsmgo);
            }
        });

        bitf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itf2 = new Intent(TWHome.this, InTheFlesh2.class);
                startActivity(itf2);
            }
        });

        brlh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rlh = new Intent(TWHome.this, RunLikeHell.class);
                startActivity(rlh);
            }
        });

        bwftw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wftw = new Intent(TWHome.this, WaitingForTheWorms.class);
                startActivity(wftw);
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(TWHome.this, Stop.class);
                startActivity(s);
            }
        });

        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btt = new Intent(TWHome.this, TheTrial.class);
                startActivity(btt);
            }
        });

        botw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otw = new Intent(TWHome.this, OutsideTheWall.class);
                startActivity(otw);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(TWHome.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}