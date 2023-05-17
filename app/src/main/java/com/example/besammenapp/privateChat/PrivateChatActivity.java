package com.example.besammenapp.privateChat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.besammenapp.HomePageActivity;
import com.example.besammenapp.R;

public class PrivateChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privatechat);
    }

    public void backBtnPrivateChat (View view) {

        Intent intentBackToHomePage = new Intent(this, HomePageActivity.class);

        startActivity(intentBackToHomePage);
    }

}
