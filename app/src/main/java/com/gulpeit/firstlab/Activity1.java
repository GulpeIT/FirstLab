package com.gulpeit.firstlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        button = (Button) findViewById(R.id.buttonEntred);
        editText = (EditText) findViewById(R.id.editText);

        View.OnClickListener oclButtonEntre = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                intent.putExtra("name", editText.getText().toString());
                startActivity(intent);
            }
        };

        button.setOnClickListener(oclButtonEntre);
    }
}