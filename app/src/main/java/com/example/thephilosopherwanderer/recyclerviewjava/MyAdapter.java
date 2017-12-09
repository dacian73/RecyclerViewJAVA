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

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myHolder> {

    // TODO (2) Create a final private MyOnClickListener
    final private MyOnItemClickListener myOnItemClickListener;

    private int mNumberItems;

    // TODO (1) Add interface for clicking
    public interface MyOnItemClickListener {
        void onListItemClick (int clickedItemIndex);
    }

    // TODO (3) Add as a parameter a MyOnClickListener
    public MyAdapter (int numberItems, MyOnItemClickListener listener){
        mNumberItems = numberItems;
        // TODO (4) Initialize the myOnclickListener
        myOnItemClickListener = listener;
    }

    @Override
    public MyAdapter.myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
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
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }
    // TODO (5) make the holder class implement the View.onClickListener
    class myHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView myTextView;

        public myHolder(View itemView) {
            super(itemView);
            myTextView = (TextView) itemView.findViewById(R.id.list_item_textView);
            // TODO (8) Set the onClickListener to your itemView
            itemView.setOnClickListener(this);
        }
        void bind (int listIndex){
            myTextView.setText(String.valueOf(listIndex));
        }

        // TODO (6) Override the OnClick Method
        @Override
        public void onClick(View view) {
            // TODO (7) get the adapter position and invoke the onClickListener
            int clickedPosition = getAdapterPosition();
            myOnItemClickListener.onListItemClick(clickedPosition);
        }
    }
}
