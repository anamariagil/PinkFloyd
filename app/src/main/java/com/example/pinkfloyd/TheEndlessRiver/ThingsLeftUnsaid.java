package com.example.pinkfloyd.TheEndlessRiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pinkfloyd.R;
import com.example.pinkfloyd.TheDivisionBell.ComingBackToLife;
import com.example.pinkfloyd.TheDivisionBell.KeepTalking;
import com.example.pinkfloyd.TheDivisionBell.TDBHome;
import com.example.pinkfloyd.TheDivisionBell.TakeItBack;

public class ThingsLeftUnsaid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_left_unsaid);

        Button bnext = (Button) findViewById(R.id.bnext);
        ImageButton bhome = (ImageButton) findViewById(R.id.bhome);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ThingsLeftUnsaid.this, ItsWhatWeDo.class);
                startActivity(next);
            }
        });

        bhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ThingsLeftUnsaid.this, TERHome.class);
                startActivity(home);
            }
        });
    }
}