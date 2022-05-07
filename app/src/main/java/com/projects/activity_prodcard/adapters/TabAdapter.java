package com.projects.activity_prodcard.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.projects.activity_prodcard.fragments.DetailsFragment;
import com.projects.activity_prodcard.fragments.FeaturesFragment;
import com.projects.activity_prodcard.fragments.ShopFragment;


public class TabAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "shop",
                "details",
                "features"
        };
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ShopFragment.newInstance();
            case 1:
                return DetailsFragment.newInstance();
            case 2:
                return FeaturesFragment.newInstance();

        }
return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }


}
