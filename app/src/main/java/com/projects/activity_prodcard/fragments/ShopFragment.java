package com.projects.activity_prodcard.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.ViewModelProvider;

import com.projects.activity_prodcard.R;
import com.projects.activity_prodcard.viewModel.ShopData;


public class ShopFragment extends CommonFragUnits {

    private static final int LAYOUT = R.layout.fragment_shop;


    public static ShopFragment getInstance(Context context) {
        ShopFragment shopFragment = new ShopFragment();
        shopFragment.setContext(context);
        shopFragment.setTitle(context.getString(R.string.tab_shop));
        return shopFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(LAYOUT, container, false);
         return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        TextView chipTxt = view.findViewById(R.id.chipTxt);
        TextView  cameratxt = view.findViewById(R.id.cameratxt);
        TextView  memoryTxt = view.findViewById(R.id.memoryTxt);
        TextView  sdCardXtx = view.findViewById(R.id.sdCardTxt);
        Button colorBtn1 = view.findViewById(R.id.button);
        Button colorBtn2 = view.findViewById(R.id.button2);
        TextView  capacity1 = view.findViewById(R.id.first_cap);
        TextView  capacity2 = view.findViewById(R.id.second_cap);

        ShopData shopData = new ViewModelProvider(requireActivity()).get(ShopData.class);
        shopData.getData().observe(getViewLifecycleOwner(), resDescription -> {
            chipTxt.setText(resDescription.getCPU());
            cameratxt.setText(resDescription.getCamera());
            memoryTxt.setText(resDescription.getSsd());
            sdCardXtx.setText(resDescription.getSd());
            capacity1.setText(resDescription.getCapacity().get(0));
            capacity2.setText(resDescription.getCapacity().get(1));
//            colorBtn1.setBackgroundColor(Integer.parseInt(resDescription.getColor().get(0)));
//            colorBtn2.setBackgroundColor(Integer.parseInt(resDescription.getColor().get(1)));
        });

    }


}