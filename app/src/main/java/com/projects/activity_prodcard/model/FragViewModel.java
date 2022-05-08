package com.projects.activity_prodcard.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.projects.activity_prodcard.repository.ResDescription;

public class FragViewModel extends ViewModel {

    private MutableLiveData<ResDescription> ShopData = new MutableLiveData<>();

    public void setShopData(ResDescription resDescription) {
        ShopData.setValue(resDescription);
    }

    public MutableLiveData<ResDescription> getShopData() {
        return ShopData;
    }


}
