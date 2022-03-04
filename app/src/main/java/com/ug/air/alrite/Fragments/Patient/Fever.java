package com.ug.air.alrite.Fragments.Patient;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.ug.air.alrite.R;

import java.util.Objects;


public class Fever extends Fragment {

    View view;
    Button back, next;
    RadioGroup radioGroup1;
    RadioButton radioButton3, radioButton4;
    String value6 = "none";
    private static final int YES1 = 0;
    private static final int NO1 = 1;
    public static final String CHOICE5 = "choice5";
    public static final String SHARED_PREFS = "sharedPrefs";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fever, container, false);

        next = view.findViewById(R.id.next);
        back = view.findViewById(R.id.back);
        radioGroup1 = view.findViewById(R.id.radioGroup1);
        radioButton3 = view.findViewById(R.id.yes1);
        radioButton4 = view.findViewById(R.id.no1);

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                View radioButton = radioGroup1.findViewById(checkedId);
                int index = radioGroup1.indexOfChild(radioButton);

                switch (index) {
                    case YES1:
                        value6 = "Yes";
                        break;
                    case NO1:
                        value6 = "No";
                        break;
                    default:
                        break;
                }
            }
        });

        sharedPreferences = Objects.requireNonNull(getActivity()).getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        loadData();
        updateViews();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value6.isEmpty()){
                    Toast.makeText(getActivity(), "Please select at least one option", Toast.LENGTH_SHORT).show();
                }else {
                    saveData();
                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String hist = sharedPreferences.getString(CHOICE3Y2, "");
                FragmentTransaction fr = Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
//                if (hist.isEmpty()){
                fr.replace(R.id.fragment_container, new Assess());
//                }else {
//                    fr.replace(R.id.fragment_container, new Fragment7v4());
//                }
                fr.commit();
            }
        });

        return  view;
    }

    private void saveData() {

        editor.putString(CHOICE5, value6);
        editor.apply();

        FragmentTransaction fr = Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.fragment_container, new Temperature());
        fr.addToBackStack(null);
        fr.commit();
    }

    private void loadData() {
        value6 = sharedPreferences.getString(CHOICE5, "");
    }

    private void updateViews() {

        if (value6.equals("Yes")){
            radioButton3.setChecked(true);
        }else if (value6.equals("No")){
            radioButton4.setChecked(true);
        }else {
            radioButton3.setChecked(false);
            radioButton4.setChecked(false);
        }

    }
}