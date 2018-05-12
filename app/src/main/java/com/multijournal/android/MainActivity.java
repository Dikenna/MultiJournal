package com.multijournal.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "EmailPassword";
    private String mUserEmail, mUserName, mUserUID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.main_textview);

        Intent intent = getIntent();
        mUserName = intent.getStringExtra("user_name").toString();
        mUserEmail = intent.getStringExtra("user_email");
        mUserUID =  intent.getStringExtra("user_UID");

    }
}
