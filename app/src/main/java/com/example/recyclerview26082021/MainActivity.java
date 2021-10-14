package com.example.recyclerview26082021;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvFood;
    FoodAdapter mFoodAdapter;
    List<Food> mListFood;
    int mCurrentPage= 0;
    int mLastPage = 10;
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

        mFoodAdapter.setOnItemClickRecyclerview(new OnItemClickRecyclerview() {
            @Override
            public void onClick(int position) {
                mListFood.remove(position);
                mFoodAdapter.notifyItemRemoved(position);
            }
        });

        mRcvFood.addOnScrollListener(new PaginationScrollListener((LinearLayoutManager) mRcvFood.getLayoutManager()) {
            @Override
            public void loadMoreItem() {

            }

            @Override
            public boolean isLoading() {
                return false;
            }

            @Override
            public boolean isLastPage() {
                return false;
            }
        });

    }
}