package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class Foods extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static Foods newInstance(int sectionNumber) {
        Foods fragment = new Foods();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public Foods() {
    }

    ImageView foodpic;
    TextView food;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_foods, container, false);

        food = (TextView) rootView.findViewById(R.id.foodtext);

        foodpic = (ImageView) rootView.findViewById(R.id.foodpic);
        return rootView;
    }
}