package com.example.thephilosopherwanderer.recyclerviewjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

// TODO (9) Implement the interface for clicking
public class MainActivity extends AppCompatActivity implements MyAdapter.MyOnItemClickListener {

    private static final int NUMBER_VIEWS = 100;
    private MyAdapter mAdapter;
    private RecyclerView mRecycledList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycledList = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager myLayoutManager = new LinearLayoutManager(this);
        mRecycledList.setLayoutManager(myLayoutManager);
        mRecycledList.setHasFixedSize(true);
        // TODO (10) Pass this as second parameter in the adapter constructor
        mAdapter = new MyAdapter(NUMBER_VIEWS, this);
        mRecycledList.setAdapter(mAdapter);
    }
    // TODO (11) Override your onListItemClick method from the MyOnItemClickListener interface
    @Override
    public void onListItemClick (int clickedItemIndex) {
        // TODO (12) do something when an item is clicked
        Toast.makeText(this, "ai clickuit " + clickedItemIndex, Toast.LENGTH_SHORT).show();
    }
}
