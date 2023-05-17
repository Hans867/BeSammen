package com.example.besammenapp.groupChat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.besammenapp.HomePageActivity;
import com.example.besammenapp.R;

public class GroupChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groupchat);
    }

    public void backBtnGroupChat (View view) {

        Intent intentBackToHomePage = new Intent(this, HomePageActivity.class);

        startActivity(intentBackToHomePage);
    }

}
