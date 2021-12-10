package com.malaak.myapplicationbmi.RecycleViewClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.malaak.myapplicationbmi.R;

import java.util.ArrayList;

public class BMIAdapter extends RecyclerView.Adapter<BMIAdapter.BMIHolder> {

    ArrayList<BMIRecord> record;

    public BMIAdapter(ArrayList<BMIRecord> record) {

        this.record =record;
    }

    @NonNull
    @Override
    public BMIAdapter.BMIHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.element_of_bmi_record,null,false);
        BMIHolder viewHolder =new BMIHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull BMIAdapter.BMIHolder holder, int position) {
        BMIRecord b_record=record.get(position);
        holder.tv_name.setText(b_record.getDate());
        holder.tv_name2.setText(Integer.toString(b_record.getWeight()));
        holder.tv_name3.setText(b_record.getMsg());
        holder.tv_name4.setText(Integer.toString(b_record.getLength()));

    }

    @Override
    public int getItemCount() {
        return record.size();
    }


    class BMIHolder extends  RecyclerView.ViewHolder{
        TextView tv_name;
        TextView tv_name2;
        TextView tv_name3;
        TextView tv_name4;

    public BMIHolder(@NonNull View itemView) {
        super(itemView);
        tv_name=itemView.findViewById(R.id.TextView01);
        tv_name2=itemView.findViewById(R.id.TextView02);
        tv_name3=itemView.findViewById(R.id.TextView03);
        tv_name4=itemView.findViewById(R.id.TextView04);
    }
}
}
