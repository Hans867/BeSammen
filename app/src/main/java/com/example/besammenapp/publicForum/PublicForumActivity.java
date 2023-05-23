package com.example.besammenapp.publicForum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.besammenapp.HomePageActivity;
import com.example.besammenapp.R;

public class PublicForumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicforum);
    }

    public void backBtnPublicForum (View view) {

        Intent intentBackToHomePage = new Intent(this, HomePageActivity.class);

        startActivity(intentBackToHomePage);
        finish();
    }
}
