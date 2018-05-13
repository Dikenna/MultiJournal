package com.multijournal.android;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "EmailPassword";
    private String mUserEmail, mUserName, mUserUID;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.main_textview);
        Button sign_out = findViewById(R.id.sign_out_button);

        Intent intent = getIntent();
        //mUserName = intent.getStringExtra("user_name");
        mUserEmail = intent.getStringExtra("user_email");
        mUserUID = intent.getStringExtra("user_UID");
        tv.setText(mUserEmail);

        sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EmailPasswordActivity.class);
                intent.putExtra("sign_out", true);
                startActivity(intent);
            }
        });


        //Working Code to add an entry
/*
        findViewById(R.id.main_add_entry_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new entry
                JournalEntry je = new JournalEntry("yeah",
                        "This is my first entry",
                        Calendar.getInstance().getTime().toString(),
                        "Ogudu GRA","","");

                db.collection("users")
                        .document(mUserUID)
                        .collection("entries")
                        .document(je.getTitle())
                        .set(je.getHashMap())

                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "Added new entry");
                                Toast.makeText(getApplicationContext(), "Entry created", Toast.LENGTH_LONG).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error adding entry", e);
                                Toast.makeText(getApplicationContext(), "Entry failed", Toast.LENGTH_LONG).show();
                            }
                        });
            }
        });

    }
    */
    }
}
