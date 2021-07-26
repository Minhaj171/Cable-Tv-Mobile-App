package com.example.dishtv.view;

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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.dishtv.R;

public class payment extends Fragment {

    EditText amount, cardName, cardNumber, expiryDate, securityDate,zipPostal;
    Button send;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_payment, container, false);


        amount = view.findViewById(R.id.clint_payment_amount);
        cardName = view.findViewById(R.id.clint_card_name);
        cardNumber = view.findViewById(R.id.clint_card_number);
        expiryDate = view.findViewById(R.id.clint_expiry_date);
        securityDate = view.findViewById(R.id.clint_security_date);
        zipPostal = view.findViewById(R.id.clint_zip_code);
        send = view.findViewById(R.id.clint_button_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final NavController navController = Navigation.findNavController(view);
                if(!validatePayAmount() || !validateCardName() || !validateCardNumber() || !validateExpiryDate() || !validateSecurityDate() || !validateZipPostal()){
                return;
                }
                Toast.makeText(requireContext(), "Payment Successfully completed",Toast.LENGTH_SHORT).show();
                navController.navigate(R.id.action_payment_to_dashboard);
            }
        });

        return view;
    }

    //paymnet validation
    private boolean validatePayAmount(){

        String userInputAmount = amount.getEditableText().toString().trim();
        if (userInputAmount.isEmpty()) {
            amount.setError("Please enter the amount");
            return false;
        } else if (!Patterns.PHONE.matcher(userInputAmount).matches()) {
            amount.setError("Please enter the valid amount");
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validateCardName(){
        String userInputName = cardName.getEditableText().toString().trim();
        if (userInputName.isEmpty()) {
            cardName.setError("Please enter the Card name");
            return false;
        } else if (userInputName.length() > 25) {
            cardName.setError("Your text is too long");
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validateCardNumber(){
        String userInputCardNumber = cardNumber.getEditableText().toString().trim();
        if (userInputCardNumber.isEmpty()) {
            cardNumber.setError("Please enter the Card Number");
            return false;
        } else if (userInputCardNumber.length() > 25) {
            cardNumber.setError("Your text is too long");
            return false;
        } else if (!Patterns.PHONE.matcher(userInputCardNumber).matches()) {
            cardNumber.setError("Please enter a valid card number");
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validateExpiryDate(){
        String userInputExpiryDate = expiryDate.getEditableText().toString().trim();
        if (userInputExpiryDate.isEmpty()) {
            expiryDate.setError("Please enter the Expiry date");
            return false;
        } else if (userInputExpiryDate.length() > 10) {
            expiryDate.setError("Your text is too long");
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validateSecurityDate(){
        String userInputSecurityDate = securityDate.getEditableText().toString().trim();
        if (userInputSecurityDate.isEmpty()) {
            securityDate.setError("Please enter the Security date");
            return false;
        } else if (userInputSecurityDate.length() > 10) {
            securityDate.setError("Your text is too long");
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validateZipPostal(){
        String userInputZipPostal = zipPostal.getEditableText().toString().trim();
        if (userInputZipPostal.isEmpty()) {
            zipPostal.setError("Please enter the Zip/Postal");
            return false;
        } else if (userInputZipPostal.length() > 4) {
            zipPostal.setError("Your text is too long");
            return false;
        }
        else {
            return true;
        }
    }




//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        final NavController navController = Navigation.findNavController(view);

//        ImageView ImageView = view.findViewById(R.id.forowardPayment);
//
//        ImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                navController.navigate(R.id.action_dashboard_to_payment);
//            }
//        });

//    }
}