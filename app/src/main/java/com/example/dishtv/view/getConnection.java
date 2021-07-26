package com.example.dishtv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.service.autofill.UserData;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;


public class getConnection extends Fragment {

    EditText clientName;
    EditText clintPhone;
    EditText clintAddress;
    EditText clintEmail;
    EditText clintPassword;
    Button Apply;


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
         Apply = view.findViewById(R.id.apply_button);

         Apply.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 final NavController navController = Navigation.findNavController(view);
                 if(!validateName() || !validatePhone() || !validateAddress() || !validateEmail()){
                     return;
                 }
                 Toast.makeText(getContext(), "Connection Added",Toast.LENGTH_SHORT).show();
                 navController.navigate(R.id.action_getConnection_to_login);
             }
         });




        return view;
    }

//    Validation of get Connection

    private boolean validateName(){
        String userInputName = clientName.getEditableText().toString().trim();
        if (userInputName.isEmpty()) {
            clientName.setError("Please enter the Your Name");
            return false;
        } else if (userInputName.length() > 25) {
            clientName.setError("Your text is too long");
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validatePhone(){
        String userInputPhone = clintPhone.getEditableText().toString().trim();
        if (userInputPhone.isEmpty()) {
            clintPhone.setError("Please enter the Phone Number");
            return false;
        } else if (userInputPhone.length() > 15) {
            clintPhone.setError("Your text is too long");
            return false;
        } else if (!Patterns.PHONE.matcher(userInputPhone).matches()) {
            clintPhone.setError("Please enter a valid Phone number");
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validateAddress() {
        String userInputAddress = clintAddress.getEditableText().toString().trim();
        if (userInputAddress.isEmpty()) {
            clintAddress.setError("Please enter Your Address");
            return false;
        } else {
            return true;
        }
    }


    private boolean validateEmail() {
        String userInputEmail = clintEmail.getEditableText().toString().trim();
        if (userInputEmail.isEmpty()) {
            clintEmail.setError("Please enter the Email Address");
            return false;
        }  else if (!Patterns.EMAIL_ADDRESS.matcher(userInputEmail).matches()) {
            clintEmail.setError("Please enter a valid Email Address");
            return false;
        } else {
            return true;
        }
    }
    //end validation
}