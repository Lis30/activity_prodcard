package com.projects.activity_prodcard.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.activity_prodcard.R;

public class FeaturesFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_features;
    private View view;

    public static FeaturesFragment newInstance() {
        FeaturesFragment featuresFragment = new FeaturesFragment();
        Bundle args = new Bundle();
        featuresFragment.setArguments(args);
        return featuresFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(LAYOUT, container, false);
        return view;
    }
}