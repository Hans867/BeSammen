package com.example.besammenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import kotlinx.coroutines.Delay;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    new Handler().postDelayed(new Runnable() {

        public void run() {
            Intent intentToHomePageActivity = new Intent(MainActivity.this, HomePageActivity.class);
            startActivity(intentToHomePageActivity);
            finish();
        }
    }, SPLASH_DELAY);

    /* public void beSammen (View view) {

        Intent intentToHomePageActivity = new Intent(this, HomePageActivity.class);

        startActivity(intentToHomePageActivity);
    }

     */

    }
}