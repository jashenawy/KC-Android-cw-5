package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx = findViewById(R.id.titel);
        EditText ed = findViewById(R.id.name);
        EditText ed2 = findViewById(R.id.age);
        ImageView im = findViewById(R.id.imag);
        TextView tx2 = findViewById(R.id.word);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String customerName = ed.getText().toString();
                int customerAge = Integer.parseInt(ed2.getText().toString());

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("ed",customerName);
                intent.putExtra("ed2",customerAge);

                startActivity(intent);

            }
        });




    }
}