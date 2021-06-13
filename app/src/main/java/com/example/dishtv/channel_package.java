package com.example.dishtv;

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

public class channel_package extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_channel_package, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        PackageData[] packageData = new PackageData[]{
          new PackageData(R.drawable.ic_plug_green, "Ghoost", "20 Channels", "1000"),
          new PackageData(R.drawable.ic_plugin, "Boost", "35 Channels", "5000"),
          new PackageData(R.drawable.ic_rocket, "Hoost", "45 Channels", "10000"),
                new PackageData(R.drawable.ic_plug_green, "Ghoost", "20 Channels", "1000"),
          new PackageData(R.drawable.ic_plugin, "Boost", "35 Channels", "5000"),
          new PackageData(R.drawable.ic_rocket, "Hoost", "45 Channels", "10000") ,
        };

        PackageAdapter packageAdapter = new PackageAdapter(packageData, requireContext());
        recyclerView.setAdapter(packageAdapter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}