package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Treatment extends Fragment {

    public static Treatment newinstance() {
        Treatment fragment = new Treatment();
        return fragment;
    }
    public Treatment() {
    }

    TextView treatment;
    ImageView treatmentpic;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_treatment, container, false);

        treatment = (TextView) rootView.findViewById(R.id.treatmenttext);

        treatmentpic = (ImageView) rootView.findViewById(R.id.treatmentpic);


        return rootView;
    }
}

