package com.projects.activity_prodcard.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.activity_prodcard.R;


public class DetailsFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_details;
    private View view;

    public static DetailsFragment newInstance() {
        DetailsFragment detailsFragment = new DetailsFragment();
        Bundle args = new Bundle();
        detailsFragment.setArguments(args);
        return detailsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(LAYOUT, container, false);
        return view;
    }
}