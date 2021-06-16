package com.example.dishtv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.service.autofill.UserData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;


public class getConnection extends Fragment {

    EditText clientName;
    EditText clintPhone;
    EditText clintAddress;
    EditText clintEmail;
    EditText clintPassword;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_get_connection, container, false);

         clientName = view.findViewById(R.id.client_name);
         clintPhone = view.findViewById(R.id.clint_phone);
         clintAddress = view.findViewById(R.id.client_address);
         clintEmail = view.findViewById(R.id.clint_email);
         clintPassword = view.findViewById(R.id.clint_password);




        return view;
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}