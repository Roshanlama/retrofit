package com.example.havoc.userlistusingretrofit.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.havoc.userlistusingretrofit.R;
import com.example.havoc.userlistusingretrofit.model.UserlistPojo;

import java.util.List;

/**
 * Created by havoc on 7/14/17.
 */

public class UserlistAdapter extends RecyclerView.Adapter<UserlistAdapter.UserlistViewHolder> {

    private List<UserlistPojo> userlistPojoList;
    private int rowLayout;
    private Context context;



    public static class UserlistViewHolder extends RecyclerView.ViewHolder{
        LinearLayout userlistLayout;
        TextView userName;
        TextView userId;
        TextView userEmail;
        TextView userPhone;
        TextView userAddress;

        public UserlistViewHolder(View view){
            super(view);
            userlistLayout=(LinearLayout)view.findViewById(R.id.userlist_layout);
            userName=(TextView)view.findViewById(R.id.TV_for_Username);
            userId=(TextView)view.findViewById(R.id.TV_for_ID);
            userEmail=(TextView)view.findViewById(R.id.TV_for_Email);
            userPhone=(TextView)view.findViewById(R.id.TV_for_Phone);
            userAddress=(TextView)view.findViewById(R.id.TV_for_Address);


        }



    }

    public UserlistAdapter (List<UserlistPojo> userlistPojoList, int rowLayout, Context context){

        this.userlistPojoList=userlistPojoList;
        this.context=context;
        this.rowLayout=rowLayout;
    }
    @Override
    public UserlistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(rowLayout,parent,false);

        return new UserlistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserlistViewHolder holder, int position) {
        holder.userName.setText(userlistPojoList.get(position).getUsername());
        holder.userId.setText(userlistPojoList.get(position).getId());
        holder.userEmail.setText(userlistPojoList.get(position).getEmail());
        holder.userPhone.setText(userlistPojoList.get(position).getPhone());
        holder.userAddress.setText(userlistPojoList.get(position).getAddress());

    }

    @Override
    public int getItemCount() {
        return userlistPojoList.size();
    }


}
