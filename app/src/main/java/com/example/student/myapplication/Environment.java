package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Environment extends Fragment {

    public static Environment newinstance() {
        Environment fragment = new Environment();
        return fragment;
    }
    public Environment() {
    }

    TextView environment;
    ImageView environmentpic;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_environment, container, false);

        environment = (TextView) rootView.findViewById(R.id.envrionmenttext);

        environmentpic = (ImageView) rootView.findViewById(R.id.envrionmentpic);


        return rootView;
    }
}