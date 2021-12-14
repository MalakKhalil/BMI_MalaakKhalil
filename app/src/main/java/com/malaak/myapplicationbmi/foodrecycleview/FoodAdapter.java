package com.malaak.myapplicationbmi.foodrecycleview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.malaak.myapplicationbmi.R;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {
    ArrayList<Food> f;

    public FoodAdapter(ArrayList<Food>f) {
        this.f = f;
    }
    @NonNull
    @Override

    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list_item,null,false);
        FoodHolder viewHolder =new FoodHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        Food fo=f.get(position);
        holder.food_image.setImageResource(fo.getImg());
        holder.food_name.setText(fo.getName());
        holder.type.setText(fo.getType());
        holder.cal_g.setText(fo.getCal_g());
    }

    @Override
    public int getItemCount() {
        return f.size();
    }

    /*FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder>*/

    class FoodHolder extends  RecyclerView.ViewHolder{
        TextView food_name;
        ImageView food_image;
        TextView type;
        TextView cal_g;
        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            food_image=itemView.findViewById(R.id.iv_image);
            food_name=itemView.findViewById(R.id.iv_text);
            type=itemView.findViewById(R.id.iv_text1);
            cal_g=itemView.findViewById(R.id.iv_text2);
        }
    }
}
