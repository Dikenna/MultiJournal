package com.multijournal.android;

import com.google.firebase.firestore.FirebaseFirestore;

/**
 * Created by dikennaogbo on 12/05/2018.
 */

public class User {

    private String mUID;
    private String mEmail;
    private String mUsername;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    public User(String UID, String email, String username) {
        mUID = UID;
        mEmail = email;
        mUsername = username;
    }

}
