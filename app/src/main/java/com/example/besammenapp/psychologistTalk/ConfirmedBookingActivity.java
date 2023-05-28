package com.example.besammenapp.psychologistTalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.besammenapp.HomePageActivity;
import com.example.besammenapp.R;

public class ConfirmedBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmedbooking);
    }

    public void backBtnHomePage (View view) {

        Intent intentToHomePageActivity = new Intent(this, HomePageActivity.class);

        startActivity(intentToHomePageActivity);
        finish();
    }
}
