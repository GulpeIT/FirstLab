package com.gulpeit.firstlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView textView;
    Button buttonReturn;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        textView = (TextView) findViewById(R.id.textView);
        buttonReturn = (Button) findViewById(R.id.buttonReturn);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        textView.setText(name);

        View.OnClickListener oclButtonReturn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstActivity = new Intent(Activity2.this, Activity1.class);
                startActivity(firstActivity);
            }
        };

        buttonReturn.setOnClickListener(oclButtonReturn);
    }
}