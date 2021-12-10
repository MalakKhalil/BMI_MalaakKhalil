package com.malaak.myapplicationbmi.RecycleViewClasses;

public class BMIRecord {
    private int length,weight;
    private String msg,date;
    public BMIRecord(String date, int weight , String msg, int length) {
        this.length=length;
        this.msg = msg;
        this.date=date;
        this.weight=weight;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}
