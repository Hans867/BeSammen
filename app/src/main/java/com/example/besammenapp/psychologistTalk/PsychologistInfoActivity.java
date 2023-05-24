package com.example.besammenapp.psychologistTalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.besammenapp.R;

public class PsychologistInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychologistinfo);
    }

    public void backToPsychTalkBtn2 (View view) {

        Intent intentBackToPsychologistTalkActivity = new Intent (this, PsychologistTalkActivity.class);

        startActivity(intentBackToPsychologistTalkActivity);
        finish();
    }
}
