package com.malaak.myapplicationbmi.foodrecycleview;

public class Food {
    private int img;
    private String name,type,cal_g;

    public Food(int img, String name, String type, String cal_g) {
        this.img = img;
        this.name = name;
        this.type = type;
        this.cal_g = cal_g;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCal_g() {
        return cal_g;
    }

    public void setCal_g(String cal_g) {
        this.cal_g = cal_g;
    }
}

