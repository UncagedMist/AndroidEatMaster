package com.kk.solution.dev.androideatmaster.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.kk.solution.dev.androideatmaster.R;

/**
 * Created by kundan on 12/21/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder{

    public TextView name,quantity,price,discount;

    public MyViewHolder(View itemView) {
        super(itemView);

        name = (TextView)itemView.findViewById(R.id.product_name);
        quantity = (TextView)itemView.findViewById(R.id.product_quantity);
        price = (TextView)itemView.findViewById(R.id.product_price);
        discount = (TextView)itemView.findViewById(R.id.product_discount);
    }
}
