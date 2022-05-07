package com.projects.activity_prodcard.repository;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class ResDescription implements Serializable {

    @SerializedName("CPU")
    @Expose
    String CPU;

    @SerializedName("camera")
    @Expose
    String camera;

    @SerializedName("capacity")
    @Expose
    ArrayList<String> capacity;

    @SerializedName("color")
    @Expose
    ArrayList<String> color;

    @SerializedName("id")
    @Expose
    int id;

    @SerializedName("images")
    @Expose
    ArrayList<String> images;

    @SerializedName("isFavorites")
    @Expose
    public boolean isFavorites;

    @SerializedName("price")
    @Expose
    String price;

    @SerializedName("rating")
    @Expose
    float rating;

    @SerializedName("sd")
    @Expose

    String sd;

    @SerializedName("ssd")
    @Expose

    String ssd;

    @SerializedName("title")
    @Expose
    String title;


    public  String getCPU() {
        return CPU;
    }

    public  String getCamera() {
        return camera;
    }

    public  ArrayList<String> getCapacity() {
        return capacity;
    }

    public  ArrayList<String> getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public boolean getIsFavorites() {
        return isFavorites;
    }

    public void setFavorites(boolean favorites) {
        isFavorites = favorites;
    }

    public String getPrice() {
        return price;
    }

    public float getRating() {
        return rating;
    }

    public  String getSd() {
        return sd;
    }

    public  String getSsd() {
        return ssd;
    }

    public String getTitle() {
        return title;
    }



}
