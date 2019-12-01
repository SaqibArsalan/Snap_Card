package com.example.homescreen;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> nImageNames= new ArrayList<>();

    public RecyclerViewAdapter(Context mContext, ArrayList<String> nImageNames, ArrayList<Integer> nImages) {
        this.nImageNames = nImageNames;
        this.nImages = nImages;
        this.mContext = mContext;
    }

    private ArrayList<Integer> nImages = new ArrayList<>();
    private Context mContext;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recylerview, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG,"onBindViewHolder: called.");


        Glide.with(mContext)
                .asBitmap()
                .load(nImages.get(position))
                .into(holder.image);
        holder.imageName.setText(nImageNames.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on:  " + nImageNames.get(position));
                Toast.makeText(mContext,nImageNames.get(position), Toast.LENGTH_SHORT).show();


            }
        });

    }



    @Override
    public int getItemCount() {
        return nImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView image;
        TextView imageName;
        RelativeLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image2);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}