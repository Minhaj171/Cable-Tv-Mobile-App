package com.example.dishtv.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dishtv.adapter.ChannelAdapter;
import com.example.dishtv.model.ChannelData;
import com.example.dishtv.R;



public class channel extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_channel, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.ChannelRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        Bundle bundle = this.getArguments();
//        int index = args.getInt("post");
        if(bundle != null){
            int position = bundle.getInt("post");
            Toast.makeText(getContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();
        }

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


        ChannelData[] channelData2 = new ChannelData[]{
                new ChannelData(R.drawable.ic_fox8, "Fox 8", "Entertainment"),
                new ChannelData(R.drawable.ic_fox_news, "Fox News", "News"),
                new ChannelData(R.drawable.ic_hbo, "HBO", "Entertainment"),
                new ChannelData(R.drawable.ic_hbo_go, "HBO GO", "Entertainment"),
                new ChannelData(R.drawable.ic_hbo_max, "HBO MAX", "Entertainment"),
                new ChannelData(R.drawable.ic_hulu, "HULU", "KIDS"),
                new ChannelData(R.drawable.ic_itv, "ITv", "News"),
                new ChannelData(R.drawable.ic_mtv, "MTV", "Entertainment"),
                new ChannelData(R.drawable.ic_nat_geo_wild, "NET GEO WILD", "Geography"),
                new ChannelData(R.drawable.ic_national_geographic, "National Geography", "Geography"),
        };

        ChannelData[] channelData3 = new ChannelData[]{
                new ChannelData(R.drawable.ic_netflix, "NETFLIX", "Entertainment"),
                new ChannelData(R.drawable.ic_prime, "AMAZON PRIME", "Entertainment"),
                new ChannelData(R.drawable.ic_sky, "SKY", "Sports"),
                new ChannelData(R.drawable.ic_sony, "SONY", "Entertainment"),
                new ChannelData(R.drawable.ic_sony_espn, "SONY ESPN", "Sports"),
                new ChannelData(R.drawable.ic_sony_max, "SONY MAX", "Entertainment"),
                new ChannelData(R.drawable.ic_sportsnet, "SPORTS NET", "Sports"),
                new ChannelData(R.drawable.ic_viacom, "VIACOM", "Entertainment"),
        };

        ChannelAdapter channelAdapter = new ChannelAdapter(channelData, getContext());
        ChannelAdapter channelAdapter2 = new ChannelAdapter(channelData2, getContext());
        ChannelAdapter channelAdapter3 = new ChannelAdapter(channelData3, getContext());
        recyclerView.setAdapter(channelAdapter);

        return view;
    }

//    private void ShowChannelData()

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