package com.example.glink;

import android.app.Application;

import com.firebase.client.Firebase;

public class Database extends Application{
    @Override
    public void onCreate(){
        super.onCreate();

        Firebase.setAndroidContext(this);
    }

}

