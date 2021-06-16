package com.example.dishtv;

import android.content.ClipData;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
//import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.dishtv.databinding.FragmentLoginBinding;

import java.util.Objects;

import butterknife.BindView;
import butterknife.OnClick;

public class login extends Fragment {
    TextView getConnection;
    EditText emailClint, passwordClint;
    Button loginButton;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        emailClint = view.findViewById(R.id.provide_clint_email);
        passwordClint = view.findViewById(R.id.provide_clint_password);
        loginButton = view.findViewById(R.id.apploginButton);
        getConnection = view.findViewById(R.id.get_connection);
//        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
//        Item item = new Item();
//        item.setName("Thomas");
//        binding.setItem("Hello Bangladesh");
//        return binding.getRoot();

        getConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_login_to_getConnection);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final NavController navController = Navigation.findNavController(view);
                if (!validateEmail() || !validatePassword()){
                    return;
                }
                Toast.makeText(getContext(),"Successfully login",Toast.LENGTH_SHORT).show();
                navController.navigate(R.id.action_login_to_dashboard);
                emailClint.setText("");
                passwordClint.setText("");
            }
        });

        return view;
    }
//    @OnClick(R.id.get_connection)
//    public void onClick(){
//        final NavController navController = Navigation.findNavController(getView());
//        navController.navigate(R.id.action_login_to_dashboard);
//    }

    private boolean validateEmail(){
        String userInputEmail = emailClint.getEditableText().toString().trim();
        if (userInputEmail.isEmpty()) {
            emailClint.setError("Please enter the Email Address");
            return false;
        }  else if (!Patterns.EMAIL_ADDRESS.matcher(userInputEmail).matches()) {
            emailClint.setError("Please enter a valid Email Address");
            return false;
        } else {
            return true;
        }
    }
    private boolean validatePassword(){
        String userInputPassword = passwordClint.getEditableText().toString().trim();
        if (userInputPassword.isEmpty()) {
            passwordClint.setError("Please enter the Password");
            return false;
        }   else {
            return true;
        }
    }

}