package com.example.dishtv.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.dishtv.R;


public class feedback extends Fragment {
    EditText feedback;
    Button submit;
    Spinner spinner;
    String[] selectString;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feedback, container, false);
        spinner = view.findViewById(R.id.spinner);
        feedback = view.findViewById(R.id.feedbackText);
        submit = view.findViewById(R.id.feedbackButton);
        feedback.setSelection(0);
        SpinnerSet();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!validateFeedback() || !validateUserInput()) {
                    return;
                }
                Toast.makeText(getContext(), "Your feedback successfully send to admin",Toast.LENGTH_SHORT).show();
                feedback.setText("");
            }
        });

        return view;
    }

    private void SpinnerSet() {
        selectString = getResources().getStringArray(R.array.selectFeedbackType);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.choose_feedback, R.id.chooseFeedbackofUser, selectString);
        spinner.setAdapter(adapter);
    }

    private boolean validateFeedback() {
        String userInput = spinner.getSelectedItem().toString().trim();
        if (userInput.equals("Select Type")) {
            Toast.makeText(getContext(), "Please select feedback", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }

    private boolean validateUserInput() {
        String userInput = feedback.getEditableText().toString().trim();
        if (userInput.isEmpty()) {
            feedback.setError("Please enter the Your feedback");
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

//        ImageView ImageView = view.findViewById(R.id.forowardFeedback);
//
//        ImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                navController.navigate(R.id.action_dashboard_to_feedback);
//            }
//        });
//}
