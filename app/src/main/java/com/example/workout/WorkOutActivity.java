package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WorkOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out);
        Intent intent = getIntent();
        String workout = intent.getStringExtra("data");
        TextView textView = findViewById(R.id.workout);
        textView.setText(workout);

    }

}