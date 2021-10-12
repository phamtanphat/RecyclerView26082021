package com.example.recyclerview26082021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

    private List<Food> foodList;

    public FoodAdapter(List<Food> foodList){
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_food,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.bind(food);
    }

    @Override
    public int getItemCount() {
        return foodList == null ? 0 : foodList.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView tvName,tvAddress,tvCategory,tvDistance,tvRating;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageViewFood);
            tvName = itemView.findViewById(R.id.textViewName);
            tvAddress = itemView.findViewById(R.id.textViewAddress);
            tvCategory = itemView.findViewById(R.id.textViewCategory);
            tvDistance = itemView.findViewById(R.id.textViewDistance);
            tvRating = itemView.findViewById(R.id.textViewRating);
        }
        public void bind(Food food){
            img.setImageResource(food.getImage());
            tvName.setText(food.getName());
            tvAddress.setText(food.getAddress());
            tvCategory.setText(food.getCategory().getValue());
            tvDistance.setText(food.getDistance() + "km");
            tvRating.setText(food.getRating() + "");
        }
    }
}
