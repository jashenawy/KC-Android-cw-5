package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView name =findViewById(R.id.name);
        TextView age = findViewById(R.id.age);

        Bundle bundle = getIntent().getExtras();


        String ed = bundle.getString("name");
        name.setText(ed);


        int customerAge = bundle.getInt("age");
        age.setText(String.valueOf(customerAge));




    }
}