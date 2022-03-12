package com.ug.air.alrite.Fragments.Patient;


import static com.ug.air.alrite.Activities.DiagnosisActivity.DATE;
import static com.ug.air.alrite.Fragments.Patient.Bronchodilator.BRONCHODILATOR;
import static com.ug.air.alrite.Fragments.Patient.Initials.CIN;
import static com.ug.air.alrite.Fragments.Patient.Initials.PIN;
import static com.ug.air.alrite.Fragments.Patient.Sex.AGE;
import static com.ug.air.alrite.Fragments.Patient.Sex.CHOICE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ug.air.alrite.Activities.Dashboard;
import com.ug.air.alrite.Activities.DiagnosisActivity;
import com.ug.air.alrite.Adapters.PatientAdapter;
import com.ug.air.alrite.BuildConfig;
import com.ug.air.alrite.Models.Item;
import com.ug.air.alrite.Models.Patient;
import com.ug.air.alrite.R;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;

public class ActivePatients extends Fragment {

    View view;
    RecyclerView recyclerView;
    EditText etSearch;
    ImageView back;
    ArrayList<Item> items;
    PatientAdapter patientAdapter;
    String cin, pin, gender, age, search, dat;
    ArrayList<String> types, files, file;
    SharedPreferences sharedPreferences;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_active_patients, container, false);

        recyclerView = view.findViewById(R.id.recyclerView3);
        etSearch = view.findViewById(R.id.search);
        back = view.findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Dashboard.class));
            }
        });

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        items = new ArrayList<>();
        files = new ArrayList<String>();

        accessSharedFile();
//
        etSearch.addTextChangedListener(textWatcher);

        patientAdapter = new PatientAdapter(getActivity(), items);
        recyclerView.setAdapter(patientAdapter);

        patientAdapter.setOnItemClickListener(new PatientAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Patient patient = (Patient) items.get(position).getObject();
                String name = patient.getFilename();
                Bundle bundle = new Bundle();
                bundle.putString("fileName", name);
                RRCounter rrCounter = new RRCounter();
                rrCounter.setArguments(bundle);
                FragmentTransaction fr = requireActivity().getSupportFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, rrCounter);
                fr.addToBackStack(null);
                fr.commit();
            }
        });


        return view;
    }


    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            search = etSearch.getText().toString();
            if (!search.isEmpty()) {
                items.clear();
                for(String type : types){
                    String ty = type.toLowerCase();
                    if (ty.contains(search)){
                        int index = types.indexOf(type);
                        String fileName = file.get(index);
                        sharedPreferences = requireActivity().getSharedPreferences(fileName, Context.MODE_PRIVATE);
                        cin = sharedPreferences.getString(CIN, "");
                        pin = sharedPreferences.getString(PIN, "");
                        age = sharedPreferences.getString(AGE, "");
                        gender = sharedPreferences.getString(CHOICE, "");
                        dat = sharedPreferences.getString(DATE, "");
                        try {
                            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                            Date date = df.parse(dat);
                            SimpleDateFormat df1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm");
                            String formattedDate = df1.format(date);
                            Patient patient = new Patient("Age: " + age + " years", "Gender: " + gender, cin, "Parent/Guardian: " + pin, formattedDate, fileName);
                            items.add(new Item(0, patient));
//                            patientAdapter.notifyDataSetChanged();
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
//                    patientAdapter.notifyDataSetChanged();
                }
                patientAdapter.notifyDataSetChanged();
            }else {
                items.clear();
                accessSharedFile();
                patientAdapter.notifyDataSetChanged();
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private void accessSharedFile() {
        File src = new File("/data/data/" + BuildConfig.APPLICATION_ID + "/shared_prefs");
        if (src.exists()){
            File[] contents = src.listFiles();
//        Toast.makeText(getActivity(), "" + contents, Toast.LENGTH_SHORT).show();
            if (contents.length != 0) {
                types = new ArrayList<String>();
                file = new ArrayList<String>();
                for (File f : contents) {
                    if (f.isFile()) {
                        String name = f.getName().toString();
                        if (!name.equals("sharedPrefs.xml")){
                            String names = name.replace(".xml", "");
                            sharedPreferences = requireActivity().getSharedPreferences(names, Context.MODE_PRIVATE);
                            String bron = sharedPreferences.getString(BRONCHODILATOR, "");
                            if (bron.equals("Bronchodialtor Given")){
                                file.add(names);
                                cin = sharedPreferences.getString(CIN, "");
                                pin = sharedPreferences.getString(PIN, "");
                                age = sharedPreferences.getString(AGE, "");
                                gender = sharedPreferences.getString(CHOICE, "");
                                dat = sharedPreferences.getString(DATE, "");
                                types.add(cin);
                                try {
                                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                                    Date date = df.parse(dat);
                                    SimpleDateFormat df1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm");
                                    String formattedDate = df1.format(date);
                                    Patient patient = new Patient("Age: " + age + " years", "Gender: " + gender, cin, "Parent/Guardian: " + pin, formattedDate, names);
                                    items.add(new Item(0, patient));
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }

            }else{
                Toast.makeText(getActivity(), "empty", Toast.LENGTH_SHORT).show();

            }
        }
    }

//    private void accessSharedFile() {
//        File src = new File("/data/data/" + BuildConfig.APPLICATION_ID + "/shared_prefs");
//        if (src.exists()){
//            File[] contents = src.listFiles();
////        Toast.makeText(getActivity(), "" + contents, Toast.LENGTH_SHORT).show();
//            if (contents.length != 0) {
//                for (File f : contents) {
//                    if (f.isFile()) {
//                        String name = f.getName().toString();
//                        files.add(name);
//                    }
//                }
//                Collections.reverse(files);
//                types = new ArrayList<String>();
//                file = new ArrayList<String>();
//                for(String name : files){
//                    if (!name.equals("sharedPrefs.xml")){
//                        String names = name.replace(".xml", "");
//                        sharedPreferences = requireActivity().getSharedPreferences(names, Context.MODE_PRIVATE);
//                        cin = sharedPreferences.getString(CIN, "");
//                        pin = sharedPreferences.getString(PIN, "");
//                        age = sharedPreferences.getString(AGE, "");
//                        gender = sharedPreferences.getString(CHOICE, "");
//                        date = sharedPreferences.getString(DATE, "");
//                        String namesy = sName + " " + oName + " " + mName;
//                        if (!types.contains(namesy)){
//                            types.add(namesy);
//                            file.add(names);
//                            char inti1 = sName.charAt(0);
//                            char inti2 = oName.charAt(0);
//                            String inti = inti1 + "" + inti2;
//
//                            try {
//                                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
//                                Date date = df.parse(date);
//                                SimpleDateFormat df1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm");
//                                String formattedDate = df1.format(date);
//                                Patient patient = new Patient(namesy, formattedDate, inti, name);
//                                items.add(new Item(0, patient));
//                            } catch (ParseException e) {
//                                e.printStackTrace();
//                            }
//                        }
//
//                    }
//                }
//
//            }else{
//                Toast.makeText(getActivity(), "empty", Toast.LENGTH_SHORT).show();
//
//            }
//        }
//    }
}