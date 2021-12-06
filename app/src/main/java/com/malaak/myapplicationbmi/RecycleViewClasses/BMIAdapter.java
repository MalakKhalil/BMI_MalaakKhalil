package com.malaak.myapplicationbmi.RecycleViewClasses;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BMIAdapter extends RecyclerView.Adapter<BMIHolder> {
    private User u;
    private Context c;

    public BMIAdapter(User u, Context c) {
        this.u = u;
        this.c = c;
    }

    @NonNull
    @Override

    public BMIHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BMIHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
