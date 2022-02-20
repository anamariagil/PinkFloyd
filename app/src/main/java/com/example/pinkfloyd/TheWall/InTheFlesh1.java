package com.example.pinkfloyd.TheWall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.WishYouWereHere.HaveACigar;
import com.example.pinkfloyd.WishYouWereHere.WYWHHome;
import com.example.pinkfloyd.WishYouWereHere.WelcomeToTheMachine;
import com.example.pinkfloyd.WishYouWereHere.WishYouWereHere;

public class InTheFlesh1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_the_flesh1);

        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(InTheFlesh1.this, TheThinIce.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(InTheFlesh1.this, TWHome.class);
                startActivity(home);
            }
        });
    }
}