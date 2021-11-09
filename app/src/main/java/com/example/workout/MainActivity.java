package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.workout.model.UserDetails;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void act2(View view) {
        EditText editText1 = findViewById(R.id.name);
        EditText editText2 = findViewById(R.id.age);
        EditText editText3 = findViewById(R.id.weight);
        EditText editText4 = findViewById(R.id.height);
        UserDetails userDetails = new UserDetails(editText1.getText().toString(), Integer.parseInt(editText2.getText().toString()),
                Double.parseDouble(editText3.getText().toString()), Double.parseDouble(editText4.getText().toString()));
        Log.d("details", userDetails.toString());
        Gson gson = new Gson();
        gson.toJson(userDetails);
        SharedPreferences sharedPreferences = getSharedPreferences("details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("details", gson.toJson(userDetails));
        editor.apply();
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);


    }
}