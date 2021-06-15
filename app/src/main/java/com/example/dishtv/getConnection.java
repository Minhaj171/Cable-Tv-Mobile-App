package com.example.dishtv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;


public class getConnection extends Fragment {

////    @BindView(R.id.client_name)
//    EditText clientName;
////    @BindView(R.id.clint_phone)
//    EditText clintPhone;
////    @BindView(R.id.client_address)
//    EditText clintAddress;
////    @BindView(R.id.clint_email)
//    EditText clintEmail;
////    @BindView(R.id.clint_password)
//    EditText clintPassword;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_get_connection, container, false);

//         clientName = view.findViewById(R.id.client_name);
//         clintPhone = view.findViewById(R.id.clint_phone);
//         clintAddress = view.findViewById(R.id.client_address);
//         clintEmail = view.findViewById(R.id.clint_email);
//         clintPassword = view.findViewById(R.id.clint_password);

//        UserData userData = new UserData(clientName,clintPhone,clintAddress,clintEmail,clintPassword);

        return view;
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        final NavController navController = Navigation.findNavController(view);
//
//        Button button = view.findViewById(R.id.applyButton);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                navController.navigate(R.id.action_getConnection_to_login);
//            }
//        });

    }
}