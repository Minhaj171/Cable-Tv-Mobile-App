package com.example.dishtv;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.OnClick;


public class profile extends Fragment {
    EditText Name, Phone, Address, ConnectId, Email;
    Button editSave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        Name = view.findViewById(R.id.profile_clint_name);
        Phone = view.findViewById(R.id.profile_clint_phone);
        Address = view.findViewById(R.id.profile_clint_address);
        ConnectId = view.findViewById(R.id.profile_clint_connection);
        Email = view.findViewById(R.id.profile_clint_email);
        editSave = view.findViewById(R.id.clint_button_save);
        disable();

        editSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeText();
            }
        });

        return view;
    }

//    @OnClick(R.id.clint_button_save)
//    void onSaveClick(){
//        changeText();
//    }

    private void changeText() {
        String buttonText = editSave.getText().toString().trim();
        if (buttonText.contentEquals(getResources().getText(R.string.edit))) {
            editSave.setText(R.string.save);
            editSave.setBackgroundResource(R.drawable.change_button_color);
            enable();
        } else if (buttonText.contentEquals(getResources().getText(R.string.save))) {
            if(!validateName() || !validatePhone() || !validateAddress() || !validateConnectID() || !validateAddress() || !validateEmail()){
                return;
            }
            Toast.makeText(requireContext(), "Profile Successfully Updated",Toast.LENGTH_SHORT).show();
            editSave.setText(R.string.edit);
            editSave.setBackgroundResource(R.drawable.disable_button_color);
            disable();
        }
    }

    private void disable() {
        Name.setEnabled(false);
        Phone.setEnabled(false);
        Address.setEnabled(false);
        ConnectId.setEnabled(false);
        Email.setEnabled(false);
    }
    private void enable() {
        Name.setEnabled(true);
        Phone.setEnabled(true);
        Address.setEnabled(true);
        ConnectId.setEnabled(true);
        Email.setEnabled(true);
        showCursor();
    }
    private void showCursor(){
        Name.setFocusableInTouchMode(true);
        Name.requestFocus();
        InputMethodManager imm = (InputMethodManager) requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(Name, InputMethodManager.SHOW_IMPLICIT);
    }


    //    validate user profile
    private boolean validateName(){
        String userInputName = Name.getEditableText().toString().trim();
        if (userInputName.isEmpty()) {
            Name.setError("Please enter the Your Name");
            return false;
        } else if (userInputName.length() > 25) {
            Name.setError("Your text is too long");
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validatePhone(){
        String userInputPhone = Phone.getEditableText().toString().trim();
        if (userInputPhone.isEmpty()) {
            Phone.setError("Please enter the Phone Number");
            return false;
        } else if (userInputPhone.length() > 15) {
            Phone.setError("Your text is too long");
            return false;
        } else if (!Patterns.PHONE.matcher(userInputPhone).matches()) {
            Phone.setError("Please enter a valid Phone number");
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validateAddress() {
        String userInputAddress = Address.getEditableText().toString().trim();
        if (userInputAddress.isEmpty()) {
            Address.setError("Please enter Your Address");
            return false;
        } else {
            return true;
        }
    }

    private boolean validateConnectID() {
        String userInputConnectId = ConnectId.getEditableText().toString().trim();
        if (userInputConnectId.isEmpty()) {
            ConnectId.setError("Please enter the Connection Id");
            return false;
        } else if (userInputConnectId.length() > 15) {
            ConnectId.setError("Your text is too long");
            return false;
        } else {
            return true;
        }
    }

    private boolean validateEmail() {
        String userInputEmail = Email.getEditableText().toString().trim();
        if (userInputEmail.isEmpty()) {
            Email.setError("Please enter the Email Address");
            return false;
        }  else if (!Patterns.EMAIL_ADDRESS.matcher(userInputEmail).matches()) {
            Email.setError("Please enter a valid Email Address");
            return false;
        } else {
            return true;
        }
    }



}

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        final NavController navController = Navigation.findNavController(view);

//        ImageView ImageView = view.findViewById(R.id.forowardProfile);

//        ImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                navController.navigate(R.id.action_dashboard_to_profile);
//            }
//        });

//    }

//}