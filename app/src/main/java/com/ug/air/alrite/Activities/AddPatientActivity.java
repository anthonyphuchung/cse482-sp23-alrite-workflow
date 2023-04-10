package com.ug.air.alrite.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ug.air.alrite.APIs.OpenMRSAPI;
import com.ug.air.alrite.Adapters.PatientListAdapter;
import com.ug.air.alrite.Models.Patient;
import com.ug.air.alrite.Models.PatientSearchResponse;
import com.ug.air.alrite.Net.AuthorizationManager;
import com.ug.air.alrite.R;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AddPatientActivity extends AppCompatActivity {
    private static final String BASE_URL = "http://10.0.2.2:8085/openmrs-standalone/";
    private OpenMRSAPI openMRSAPI;
    private EditText editTextSearch;
    private PatientListAdapter patientListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patient);

        editTextSearch = findViewById(R.id.editTextSearch);
        Button buttonSearch = findViewById(R.id.buttonSearch);
        RecyclerView recyclerViewPatients = findViewById(R.id.recyclerViewPatients);

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        AuthorizationManager authInterceptor = new AuthorizationManager("admin", "Admin123");
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(authInterceptor)
                .addInterceptor(loggingInterceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        openMRSAPI = retrofit.create(OpenMRSAPI.class);

        patientListAdapter = new PatientListAdapter(this);
        recyclerViewPatients.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewPatients.setAdapter(patientListAdapter);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = editTextSearch.getText().toString();
                searchPatients(query);
            }
        });
    }

    private void searchPatients(String query) {
        openMRSAPI.searchPatients(query).enqueue(new Callback<PatientSearchResponse>() {
            @Override
            public void onResponse(Call<PatientSearchResponse> call, Response<PatientSearchResponse> response) {
                if (response.isSuccessful()) {
                    List<Patient> patients = response.body().getPatients();
                    patientListAdapter.setPatients(patients);
                    patientListAdapter.notifyDataSetChanged();
                    System.out.println(patients);
                } else {
                    Toast.makeText(AddPatientActivity.this, "Error: " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<PatientSearchResponse> call, Throwable t) {
                Toast.makeText(AddPatientActivity.this, "Error : " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
