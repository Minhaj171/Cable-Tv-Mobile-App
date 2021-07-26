package com.example.dishtv;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class channel_package extends Fragment implements ChannelDataListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_channel_package, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        PackageData[] packageData = new PackageData[]{
          new PackageData(R.drawable.ic_premium_file, "Premium", "Best combo 50+ channels", "1000.tk"),
          new PackageData(R.drawable.ic_clapperboard, "Entertainment 24/7", "35 Channels", "800.tk"),
          new PackageData(R.drawable.ic_newspaper, "News special", "25 Channels", "500.tk"),
                new PackageData(R.drawable.ic_running, "Sports", "20 Channels", "400.tk"),
                new PackageData(R.drawable.ic_music, "Music all time", "15 Channels", "300.tk"),

        };

        PackageAdapter packageAdapter = new PackageAdapter(packageData, requireContext());
        packageAdapter.itemClick(this);
        recyclerView.setAdapter(packageAdapter);
        return view;
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void respond(int position) {
        if (position == 0){
            NavController navController = Navigation.findNavController(getActivity(), R.id.fragment3);
            navController.navigate(R.id.action_channel_package_to_channel);
            Toast.makeText(getContext(),"Channels",Toast.LENGTH_SHORT).show();
            channel_package channel_package = new channel_package();

//            Bundle args = new Bundle();
//            args.putInt("post", position);
//            channelDataListener.setArguments(args);
        }
        else {
            Toast.makeText(getContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();
        }

    }
}