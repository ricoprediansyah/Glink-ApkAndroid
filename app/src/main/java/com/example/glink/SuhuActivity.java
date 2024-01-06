package com.example.glink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class SuhuActivity extends AppCompatActivity {

    // Inisialisasi
    private TextView Temp;

    // Firebase
    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        Temp = (TextView) findViewById(R.id.Temp);

        mRef = new Firebase("https://glinksmartgarden-default-rtdb.firebaseio.com/DHT/temperature");

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot Snapshot) {
                String temperature = Snapshot.getValue(String.class);
                Temp.setText(temperature);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}