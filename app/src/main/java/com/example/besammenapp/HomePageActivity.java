package com.example.besammenapp;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    public void forumBtn (View view) {

        Intent intentToPublicForum = new Intent(this, PublicForumActivity.class);

        startActivity(intentToPublicForum);

    }

}
