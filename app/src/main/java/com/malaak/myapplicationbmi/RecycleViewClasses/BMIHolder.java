package com.malaak.myapplicationbmi.RecycleViewClasses;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BMIHolder extends RecyclerView.ViewHolder {
    private View itemView;

    public BMIHolder(@NonNull View itemView) {
        super(itemView);
        this.itemView=itemView;
    }
}
