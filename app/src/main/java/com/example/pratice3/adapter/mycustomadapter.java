package com.example.pratice3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pratice3.R;
import com.example.pratice3.model.iplmodel;
import com.example.pratice3.onclicklistner;

import java.util.List;

public class mycustomadapter extends RecyclerView.Adapter<mycustomadapter.iplviewholder> {
    List<iplmodel> iplmodelList;
    static onclicklistner onclicklistner;

    public void setOnclicklistner(com.example.pratice3.onclicklistner onclicklistner) {
        this.onclicklistner = onclicklistner;
    }

    public mycustomadapter(List<iplmodel> iplmodelList) {
        this.iplmodelList = iplmodelList;
    }

    @NonNull
    @Override
    public mycustomadapter.iplviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.iten_layout,parent,false);
        return new iplviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter.iplviewholder holder, int position) {
        iplmodel iplmodel=iplmodelList.get(position);
        holder.teamname.setText(iplmodel.getTeamname());
        holder.teamimage.setImageResource(iplmodel.getTeamimage());
        holder.trophies.setText(String.valueOf(iplmodel.getTrophies()));

    }

    @Override
    public int getItemCount() {
        return iplmodelList.size();
    }
    public static class iplviewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView teamname,trophies;
        ImageView teamimage;

        public iplviewholder(@NonNull View itemView) {
            super(itemView);
            teamname=itemView.findViewById(R.id.name);
            trophies=itemView.findViewById(R.id.wins);
            teamimage=itemView.findViewById(R.id.image);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            if(onclicklistner != null){
                onclicklistner.onclick(v,getAdapterPosition());
            }
        }
    }
}

