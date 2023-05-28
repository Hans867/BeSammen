package com.example.besammenapp.psychologistTalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.besammenapp.R;

public class BookPsychologistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookpsychologist);
    }

    public void backToPsychTalkBtn (View view) {

        Intent intentBackToPsychologistActivity = new Intent(this,PsychologistTalkActivity.class);

        startActivity(intentBackToPsychologistActivity);
        finish();
    }

    public void confirmedBooking (View view) {

        Intent intentToConfirmedBookingActivity = new Intent(this, ConfirmedBookingActivity.class);

        startActivity(intentToConfirmedBookingActivity);
        finish();
    }

}
