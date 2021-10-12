package com.example.recyclerview26082021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvFood;
    FoodAdapter mFoodAdapter;
    List<Food> mListFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvFood = findViewById(R.id.recyclerViewFood);
        mListFood = Food.getFoodMock();

        mFoodAdapter = new FoodAdapter(mListFood);

        mRcvFood.setHasFixedSize(true);
        mRcvFood.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mRcvFood.setAdapter(mFoodAdapter);
    }
}