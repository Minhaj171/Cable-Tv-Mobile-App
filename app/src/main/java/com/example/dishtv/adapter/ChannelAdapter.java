package com.example.dishtv.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dishtv.R;
import com.example.dishtv.model.ChannelData;
import com.example.dishtv.view.ChannelProfile;

import org.jetbrains.annotations.NotNull;

/**
 * Created by MD Minhajul Islam on 6/13/2021.
 */
public class ChannelAdapter extends RecyclerView.Adapter<ChannelAdapter.ViewHolder>{
    ChannelData[] channelData;
    Context context;


    public ChannelAdapter(ChannelData[] channelData, Context context) {
        this.channelData = channelData;
        this.context = context;
    }


    @NonNull
    @NotNull
    @Override
    public ChannelAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        Context context;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.channel_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        final ChannelData channelDataList = channelData[position];
        holder.chImage.setImageResource(channelDataList.getChannelLogo());
        holder.chName.setText(channelDataList.getChannelName());
        holder.chType.setText(channelDataList.getChannelType());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                int position = holder.getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    FragmentManager manager = ((AppCompatActivity)context).getSupportFragmentManager();
                    Bundle bundle = new Bundle();
                    bundle.putInt("imageUrl", channelDataList.getChannelLogo());
                    bundle.putString("channelName", channelDataList.getChannelName());
                    bundle.putString("channelType", channelDataList.getChannelType());

                    ChannelProfile channelProfile = new ChannelProfile();
                    channelProfile.setArguments(bundle);

                    manager.beginTransaction().replace(R.id.fragment3, channelProfile).commit();
                }
            }
        });
    }



    @Override
    public int getItemCount() {
        return channelData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView chImage;
        TextView chName;
        TextView chType;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            chImage = itemView.findViewById(R.id.channel_logo);
            chName = itemView.findViewById(R.id.channel_name);
            chType = itemView.findViewById(R.id.channel_type);

        }
    }
}
