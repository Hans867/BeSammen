package com.example.besammenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.besammenapp.groupChat.GroupChatActivity;
import com.example.besammenapp.privateChat.PrivateChatActivity;
import com.example.besammenapp.psychologistTalk.PsychologistTalkActivity;
import com.example.besammenapp.publicForum.PublicForumActivity;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void forumBtn (View view) {

        Intent intentToPublicForum = new Intent(this, PublicForumActivity.class);

        startActivity(intentToPublicForum);

    }

    public void groupChatBtn (View view) {

        Intent intentToGroupChatActivity = new Intent(this, GroupChatActivity.class);

        startActivity(intentToGroupChatActivity);
    }

   public void privateChatBtn (View view) {

        Intent intentToPrivateChatActivity = new Intent(this, PrivateChatActivity.class);

        startActivity(intentToPrivateChatActivity);
   }

   public void psychTalkBtn (View view) {

        Intent intentToPsychologistTalkActivity = new Intent(this, PsychologistTalkActivity.class);

        startActivity(intentToPsychologistTalkActivity);
   }

}
