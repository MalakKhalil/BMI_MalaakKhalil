package com.malaak.myapplicationbmi.RecycleViewClasses;

import java.util.ArrayList;

public class User {
    private ArrayList<BMIRecord>r;

    public User(){
        this.r=new ArrayList<BMIRecord>();
        r.add(new BMIRecord("18/3/1999",50,160));
        r.add(new BMIRecord("18/3/1999",70,130));
        r.add(new BMIRecord("18/3/1999",100,200));
        r.add(new BMIRecord("15/10/1970",60,150));
        r.add(new BMIRecord("16/4/2009",60,140));
        r.add(new BMIRecord("20/12/1999",70,170));
        r.add(new BMIRecord("16/5/2005",50,150));
        r.add(new BMIRecord("18/3/1999",70,160));


    }

    public ArrayList<BMIRecord> getR() {
        return r;
    }
}
