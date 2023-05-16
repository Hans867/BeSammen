package com.example.besammenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void beSammen (View view) {

        Intent intentToHomePageActivity = new Intent(this, HomePageActivity.class);

        startActivity(intentToHomePageActivity);
    }


}