package com.example.thephilosopherwanderer.recyclerviewjava;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by alex on 01.12.2017.
 */
    // TODO (4) Create a java class that extends RecyclerView.Adapter
    // TODO (5) Pass into the RecyclerView.Adapter a holder
    // TODO (6) Implement the required methods for the Adapter
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myHolder> {

    // TODO (11) Declare a private int variable with the number of items
    private int mNumberItems;

    // TODO (12) Make a constructor for the Adapter and set the number of items
    public MyAdapter (int numberItems){
        mNumberItems = numberItems;
    }

    @Override
    public MyAdapter.myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // TODO (13) Override the onCreateViewHolder to inflate the view and return a viewHolder with that inflated view
        Context context = parent.getContext();
        int layoutIdListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImediately = false;

        View view = inflater.inflate(layoutIdListItem, parent, shouldAttachToParentImediately);

        myHolder viewHolder = new myHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.myHolder holder, int position) {
        // TODO (14) Override onBindViewHolder to call the bind method
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        // TODO (15) Override getItemCount() to return the number of items
        return mNumberItems;
    }
    // TODO (6) Create a view holder class
    class myHolder extends RecyclerView.ViewHolder{
        // TODO (7) Make variables for views that will contain data
        TextView myTextView;

        // TODO (8) Implement the required constructor
        public myHolder(View itemView) {
            super(itemView);
            // TODO (9) Initialize the variables for views with findViewById
            myTextView = (TextView) itemView.findViewById(R.id.list_item_textView);
        }
        // TODO (10) Create a bind method that sets data to views
        void bind (int listIndex){
            myTextView.setText(String.valueOf(listIndex));
        }
    }
}
