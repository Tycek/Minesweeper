package com.example.tycek.minesweeper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView name;
    String jmeno;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView)findViewById(R.id.editText);


        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jmeno = name.getText().toString();
                Intent i = new Intent(getApplicationContext(), Game.class);
                i.putExtra("Name", jmeno);
                startActivity(i);
            }
        });
    }
}
