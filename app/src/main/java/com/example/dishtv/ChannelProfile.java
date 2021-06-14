package com.example.dishtv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.time.Instant;

import butterknife.BindView;


public class ChannelProfile extends Fragment {

//    @BindView(R.id.channelCover)
//    ImageView channelCoverUrl;
//    @BindView(R.id.channel_get_name)
//    TextView channelGetName;
//    @BindView(R.id.channel_get_type)
//    TextView channelGetType;
   TextView channelGetName;
    TextView channelGetType;
    ImageView channelCoverUrl;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_channel_profile, container, false);
         channelGetName = view.findViewById(R.id.channel_get_name);
         channelGetType = view.findViewById(R.id.channel_get_type);
         channelCoverUrl = view.findViewById(R.id.channelCover);

        Bundle bundle = this.getArguments();
        if(bundle != null){
            // handle your code here.
            int image = bundle.getInt("imageUrl");
            String channel_name = bundle.getString("channelName");
            String channel_type = bundle.getString("channelType");
            setImageUrl(image,channel_name,channel_type);
        }
        return view;
    }

    private void setImageUrl (int image, String channel_name, String channel_type){
        channelGetName.setText(channel_name);
        channelGetType.setText(channel_type);
        Glide.with(this)
                .asBitmap()
                .load(image)
                .into(channelCoverUrl);
    }


//
//    private void getIncomingIntent() {
//        Bundle bundle = getIntent().getExtras();
//        if (bundle != null) {
//            int image = bundle.getInt("imageurl");
//            String text_url = bundle.getString("nameurl");
//            setImageUrl(view,image,text_url);
//        }
//        else {
//            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
//        }
//    }
//


}