package com.example.dishtv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

/**
 * Created by MD Minhajul Islam on 6/12/2021.
 */
public class PackageAdapter extends RecyclerView.Adapter<PackageAdapter.ViewHolder>{
    PackageData[] packageData;
    Context context;
    private ChannelDataListener channelInterface;

    public void itemClick(ChannelDataListener channelDataListener){
        this.channelInterface = channelDataListener;
    }

    public PackageAdapter(PackageData[] packageData, Context context) {
        this.packageData = packageData;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        Context context;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view,channelInterface);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        final PackageData packageDataList = packageData[position];
        holder.pImage.setImageResource(packageDataList.getImageUrl());
        holder.pName.setText(packageDataList.getPackageName());
        holder.pCount.setText(packageDataList.getChannelCount());
        holder.pPrice.setText(packageDataList.getChannelPrice());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, packageDataList.getPackageName(), Toast.LENGTH_SHORT).show();
//            }
//        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                int position = holder.getAdapterPosition();
                if (position != RecyclerView.NO_POSITION){
                    channelInterface.respond(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return packageData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView pImage;
        TextView pName;
        TextView pCount;
        TextView pPrice;

        public ViewHolder(@NonNull @NotNull View itemView, ChannelDataListener channelInterface) {
            super(itemView);
            pImage = itemView.findViewById(R.id.package_Image);
            pName = itemView.findViewById(R.id.package_name);
            pCount = itemView.findViewById(R.id.package_count);
            pPrice = itemView.findViewById(R.id.package_price);
        }

        @Override
        public void onClick(View v) {
            channelInterface.respond(getAdapterPosition());
        }
    }
}
