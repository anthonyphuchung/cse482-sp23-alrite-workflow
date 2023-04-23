package com.ug.air.alrite.Fragments.navigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ug.air.alrite.APIs.JsonPlaceHolder;
import com.ug.air.alrite.Activities.AddPatientActivity;
import com.ug.air.alrite.Activities.LearnActivity;
import com.ug.air.alrite.Activities.PatientActivity;
import com.ug.air.alrite.Activities.PersonActivity;
import com.ug.air.alrite.Activities.SyncActivity;
import com.ug.air.alrite.Database.DatabaseHelper;
import com.ug.air.alrite.R;
import com.ug.air.alrite.Utils.Credentials;
import com.ug.air.alrite.Worker.NotifyWorker2;
import com.ug.air.alrite.Worker.NotifyWorker3;
import com.ug.air.alrite.Worker.NotifyWorker4;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class HomeFragment extends Fragment {

    View view;
    int period = 0;
    DatabaseHelper databaseHelper;
    String token;
    File[] contents;
    JsonPlaceHolder jsonPlaceHolder;
    Credentials credentials;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_home, container, false);

        databaseHelper = new DatabaseHelper(getActivity());

        checkCredentials();

        return view;
    }

    private void checkCredentials() {

        credentials = new Credentials();
        String username = credentials.creds(getActivity()).getUsername();
//        if (username.equals("None")){
//            FragmentTransaction fr = requireActivity().getSupportFragmentManager().beginTransaction();
//            fr.replace(R.id.navHostFragment, new AccountFragment());
//            fr.commit();
//        }else {
            intFunction();
//        }


    }

    private void intFunction() {
        view.findViewById(R.id.btn_learn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { 
                Intent intent = new Intent(getActivity(), LearnActivity.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.btn_patients).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(getActivity(), PatientActivity.class);
                bundle.putInt("Fragment", 2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.btnSync).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SyncActivity.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.btn_clinic_setting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(getActivity(), PatientActivity.class);
                bundle.putInt("Fragment", 3);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.btn_assessment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(getActivity(), PatientActivity.class);
                bundle.putInt("Fragment", 1);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.openmrs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddPatientActivity.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.addPerson).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(getActivity(), PersonActivity.class);
                bundle.putInt("Fragment", 3);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

//        credentials = new Credentials();
//        period = credentials.creds(getActivity()).getPeriod();
//
//        if (period == 1){
//            checkPatientReadiness();
////            sendDataToServer();
//            sendCounterDataToServer();
//            databaseHelper.updatePeriod("1", 2);
//        }
    }


    private void checkPatientReadiness() {

        WorkRequest checkWorkRequest = new PeriodicWorkRequest
                .Builder(NotifyWorker2.class, 15, TimeUnit.MINUTES)
                .build();

        WorkManager.getInstance(getActivity()).enqueue(checkWorkRequest);

    }

    private void sendDataToServer(){

        Constraints constraints = new Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build();

        WorkRequest uploadWorkRequest = new PeriodicWorkRequest
                .Builder(NotifyWorker3.class, 20, TimeUnit.MINUTES)
                .setConstraints(constraints)
                .build();

        WorkManager.getInstance(getActivity()).enqueue(uploadWorkRequest);

    }

    private void sendCounterDataToServer() {
        Constraints constraints = new Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build();

        WorkRequest uploadWorkRequest = new PeriodicWorkRequest
                .Builder(NotifyWorker4.class, 12, TimeUnit.HOURS)
                .setConstraints(constraints)
                .build();

        WorkManager.getInstance(getActivity()).enqueue(uploadWorkRequest);

    }

}