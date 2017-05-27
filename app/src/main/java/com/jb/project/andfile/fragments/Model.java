package com.jb.project.andfile.fragments;

import java.util.ArrayList;

/**
 * Created by Alexander on 23.05.2017.
 */

public class Model {
    public String name = "";
    public String address = "";
    public String city = "";
    public int photoId;

    public  static ArrayList<Model> list;

    public Model(String name, String address, String city, int photoId) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.photoId = photoId;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public static ArrayList<Model> getList() {

        list.add(new Model("Tel - aviv", "bar", "10km", R.drawable.bank80));
        list.add(new Model("Tel - aviv", "bar", "10km", R.drawable.bank80));
        list.add(new Model("Tel - aviv", "bar", "10km", R.drawable.bank80));
        list.add(new Model("Tel - aviv", "bar", "10km", R.drawable.bank80));
        list.add(new Model("Tel - aviv", "bar", "10km", R.drawable.bank80));
        list.add(new Model("Tel - aviv", "bar", "10km", R.drawable.bank80));
        list.add(new Model("Tel - aviv", "bar", "10km", R.drawable.bank80));
        list.add(new Model("Tel - aviv", "bar", "10km", R.drawable.bank80));
        list.add(new Model("Tel - aviv", "bar", "10km", R.drawable.bank80));

        return list;
    }
}
