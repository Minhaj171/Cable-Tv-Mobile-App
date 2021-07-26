
package com.example.dishtv.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.dishtv.R;

import butterknife.BindView;
import butterknife.OnClick;


public class dashboard extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_dashboard, container, false);
//        return LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_dashboard, parent, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);
        CardView payment = view.findViewById(R.id.make_payment);
        CardView profile = view.findViewById(R.id.user_profile);
        CardView packages = view.findViewById(R.id.user_package);
        CardView feedback = view.findViewById(R.id.user_feedback);

        packages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_dashboard_to_channel_package);
                Toast.makeText(getContext(),"Add Package",Toast.LENGTH_SHORT).show();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_dashboard_to_profile);
                Toast.makeText(getContext(),"Update Profile",Toast.LENGTH_SHORT).show();
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_dashboard_to_payment);
                Toast.makeText(getContext(),"Payment",Toast.LENGTH_SHORT).show();
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_dashboard_to_feedback);
                Toast.makeText(getContext(),"Feedback",Toast.LENGTH_SHORT).show();
            }
        });



    }
}

