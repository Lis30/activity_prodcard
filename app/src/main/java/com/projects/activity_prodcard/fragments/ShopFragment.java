package com.projects.activity_prodcard.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.projects.activity_prodcard.R;
import com.projects.activity_prodcard.adapters.ShopFragAdapter;
import com.projects.activity_prodcard.model.FragViewModel;
import com.projects.activity_prodcard.repository.ResDescription;


public class ShopFragment extends CommonFragUnits {

    private static final int LAYOUT = R.layout.fragment_shop;


    public static ShopFragment getInstance(Context context) {
        ShopFragment shopFragment = new ShopFragment();
        Bundle args = new Bundle();

        shopFragment.setArguments(args);
        shopFragment.setContext(context);
        shopFragment.setTitle(context.getString(R.string.tab_shop));
        return shopFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(LAYOUT, container, false);
        Bundle bundle = getArguments();

        return view;
    }


    public void  onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        FragViewModel viewModel = new ViewModelProvider(requireActivity()).get(FragViewModel.class);
        ResDescription resDescription = new ResDescription();

        ShopFragAdapter adapter = new ShopFragAdapter(resDescription);



    }


}