package com.example.tycek.minesweeper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Summary extends Activity {

    TextView name;
    TextView info;
    TextView score;
    TextView time;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();
        String jmeno = i.getStringExtra("Name");
        int informace = i.getIntExtra("Info",0);
        int skore = i.getIntExtra("Score",0);
        float cas = i.getFloatExtra("Time", 0)/1000;

        name = (TextView) findViewById(R.id.Name);
        info = (TextView) findViewById(R.id.Info);
        score = (TextView) findViewById(R.id.Score);
        time = (TextView) findViewById(R.id.Time);
        b = findViewById(R.id.button2);

        name.setText(jmeno);
        System.out.println("1");
        if(informace == 1) {
            info.setText("You won");
        }
        else{
            info.setText("You lost");
        }
        System.out.println("2");

        score.setText("Score: " + String.valueOf(skore));
        System.out.println("3");
        time.setText("Time: " + String.valueOf(cas));
        System.out.println("4");

        System.out.println(jmeno);
        System.out.println(informace);
        System.out.println(skore);
        System.out.println(cas);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}
