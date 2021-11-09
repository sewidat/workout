package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.workout.model.UserDetails;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Page2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] workouts = {"Push UP", "Crunch", "Plank"};


    TextView textView, textView2;
    View divider;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        SharedPreferences sharedPreferences = getSharedPreferences("details", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        UserDetails userDetails = gson.fromJson(sharedPreferences.getString("details", ""), UserDetails.class);
        textView = findViewById(R.id.name2);

        double bmi = userDetails.getWight() / userDetails.getHeight() / userDetails.getHeight() * 10000;
        textView.setText("Hello " + userDetails.getName());
        textView2 = findViewById(R.id.bmi);
        textView2.setText("Your BMI = " + String.format("%.2f", bmi));
        spinner = findViewById(R.id.spinnerId);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        final List<String> wList = new ArrayList<>(Arrays.asList(workouts));
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, wList);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(ad);


    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), workouts[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void act3(View view) {
        Intent intent = new Intent(this, WorkOutActivity.class);
        intent.putExtra("data",spinner.getSelectedItem().toString());
        startActivity(intent);
    }
}