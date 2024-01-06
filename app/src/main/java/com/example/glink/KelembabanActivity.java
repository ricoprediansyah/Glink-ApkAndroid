package com.example.glink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class KelembabanActivity extends AppCompatActivity {
    // Inisialisasi
    private TextView Humy;

    // Firebase
    private Firebase mRef2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelembaban);

        Humy = (TextView) findViewById(R.id.Humy);

        mRef2 = new Firebase("https://glinksmartgarden-default-rtdb.firebaseio.com/DHT/humidity");

        mRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot Snapshot) {
                String humidity = Snapshot.getValue(String.class);
                Humy.setText(humidity);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}