package com.example.glink.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.glink.KelembabanActivity;
import com.example.glink.R;
import com.example.glink.SuhuActivity;
import com.example.glink.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    Activity context, context2;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context = getActivity();
        context2 = getActivity();

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    public void onStart(){
        super.onStart();
        ImageView shu = (ImageView) context.findViewById(R.id.suhumasuk);
        ImageView shu2 = (ImageView) context2.findViewById(R.id.kelembabanmasuk);

        shu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shuu =new Intent(context, SuhuActivity.class);
                startActivity(shuu);
            }
        });
        shu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shuu22();
            }
        });
    }
    public void shuu22(){
        Intent shuu2 =new Intent(context2, KelembabanActivity.class);
        startActivity(shuu2);
    }
}
