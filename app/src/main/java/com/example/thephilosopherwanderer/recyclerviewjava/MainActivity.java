package com.example.thephilosopherwanderer.recyclerviewjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    // TODO (16) Create a private static int for them number of views we want our view to hold
    private static final int NUMBER_VIEWS = 100;
    // TODO (17) Make variables of your adapter and your RecyclerView
    private MyAdapter mAdapter;
    private RecyclerView mRecycledList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (18) Get a reference for the RecyclerView using findViewById
        mRecycledList = (RecyclerView) findViewById(R.id.recycler_view);

        // TODO (19) Create a LinearLayoutManager (or other kind of layout manager) and set it to your RecyclerView variable
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(this);
        mRecycledList.setLayoutManager(myLayoutManager);
        // TODO (20) Set setHasFixedSize(true) for your RecyclerView if you know that the content will not change the size of its children (for Performance)
        mRecycledList.setHasFixedSize(true);
        // TODO (21) Create a new adapter passing in the number of views and store it into your adapter variable
        mAdapter = new MyAdapter(NUMBER_VIEWS);
        // TODO (22) Set your adapter to your RecyclerView
        mRecycledList.setAdapter(mAdapter);
    }
}
