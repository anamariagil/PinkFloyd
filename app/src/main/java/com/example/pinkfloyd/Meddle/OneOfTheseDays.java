package com.example.pinkfloyd.Meddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.More.CryingSong;
import com.example.pinkfloyd.More.MHome;
import com.example.pinkfloyd.More.TheNileSong;
import com.example.pinkfloyd.More.UpTheKhyber;
import com.example.pinkfloyd.R;

public class OneOfTheseDays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_of_these_days);

        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(OneOfTheseDays.this, APillowOfWinds.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(OneOfTheseDays.this, MeHome.class);
                startActivity(home);
            }
        });
    }
}