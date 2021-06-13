package com.example.dishtv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class channel extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_channel, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.ChannelRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        ChannelData[] channelData = new ChannelData[]{
                new ChannelData(R.drawable.ic_1st_century_fox, "1st Century fox", "Adventure"),
                new ChannelData(R.drawable.ic_axn, "Axn", "Entertainment"),
                new ChannelData(R.drawable.ic_bbc, "BBC", "News"),
                new ChannelData(R.drawable.ic_bbc_entertainment, "BBC Entertainment", "Entertainment"),
                new ChannelData(R.drawable.ic_bbc_world, "BBC World", "News"),
                new ChannelData(R.drawable.ic_channel_v_australia, "Channel V", "Travel"),
                new ChannelData(R.drawable.ic_cnbc, "CNBC", "News"),
                new ChannelData(R.drawable.ic_cnn, "CNN", "News"),
                new ChannelData(R.drawable.ic_disney, "Disney", "Entertainment"),
                new ChannelData(R.drawable.ic_disney_xd, "Disney Xd", "Kids"),
        };

        channelAdapter channelAdapter = new channelAdapter(channelData, getContext());
        recyclerView.setAdapter(channelAdapter);
        return view;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        final NavController navController = Navigation.findNavController(view);
//
//        ImageView ImageView = view.findViewById(R.id.forowardChannels);
//
//        ImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                navController.navigate(R.id.action_channel_package_to_channel);
//            }
//        });
//
//    }
}