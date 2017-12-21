package com.kk.solution.dev.androideatmaster.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kk.solution.dev.androideatmaster.R;

/**
 * Created by kundan on 12/16/2017.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder    {

    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress;

    public Button btnEdit, btnRemove, btnDetail, btnDirection;


    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderId = (TextView) itemView.findViewById(R.id.order_name);
        txtOrderStatus = (TextView) itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView) itemView.findViewById(R.id.order_phone);
        txtOrderAddress = (TextView) itemView.findViewById(R.id.order_ship_to);

        btnEdit = (Button) itemView.findViewById(R.id.btnEdit);
        btnRemove = (Button) itemView.findViewById(R.id.btnRemove);
        btnDetail = (Button) itemView.findViewById(R.id.btnDetail);
        btnDirection = (Button) itemView.findViewById(R.id.btnDirection);
    }

}