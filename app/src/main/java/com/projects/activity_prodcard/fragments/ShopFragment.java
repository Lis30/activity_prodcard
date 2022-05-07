package com.projects.activity_prodcard.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.CornerFamily;
import com.projects.activity_prodcard.R;
import com.projects.activity_prodcard.repository.ResDescription;


public class ShopFragment extends Fragment {

    public static ShopFragment newInstance() {
        ShopFragment shopFragment = new ShopFragment();
        Bundle args = new Bundle();
        shopFragment.setArguments(args);
        return shopFragment;
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent getIntent = new Intent(String.valueOf(this));
        Bundle arguments = getIntent.getExtras();

        if (arguments != null){

        }
    }

    public void  onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        ResDescription resDescription = new ResDescription();

        TextView  chipTxt = view.findViewById(R.id.chipTxt);
        TextView  cameratxt = view.findViewById(R.id.cameratxt);
        TextView  memoryTxt = view.findViewById(R.id.memoryTxt);
        TextView  sdCardXtx = view.findViewById(R.id.sdCardTxt);
        Button colorBtn1 = view.findViewById(R.id.button);
        Button colorBtn2 = view.findViewById(R.id.button2);
        TextView  capacity1 = view.findViewById(R.id.first_cap);
        TextView  capacity2 = view.findViewById(R.id.second_cap);

        chipTxt.setText(resDescription.getCPU());
        cameratxt.setText(resDescription.getCamera());
        memoryTxt.setText(resDescription.getSsd());
        sdCardXtx.setText(resDescription.getSd());
//        colorBtn1.setBackgroundResource(Integer.parseInt(resDescription.getColor().get(0)));
//        colorBtn2.setBackgroundResource(Integer.parseInt(resDescription.getColor().get(1)));
//        capacity1.setText(resDescription.getCapacity().get(0));
//        capacity2.setText(resDescription.getCapacity().get(1));
    }

    @SuppressLint({"SetTextI18n", "ResourceAsColor"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_shop, container, false);

        return view;
    }
}