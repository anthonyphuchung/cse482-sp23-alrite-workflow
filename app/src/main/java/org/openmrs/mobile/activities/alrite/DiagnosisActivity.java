package org.openmrs.mobile.activities.alrite;

import static com.openmrs.android_sdk.utilities.ApplicationConstants.DEFAULT_OPEN_MRS_URL;
import static org.openmrs.mobile.activities.alrite.FinalActivity.S6;
import static org.openmrs.mobile.activities.alrite.FinalActivity.S7;
import static org.openmrs.mobile.activities.alrite.PatientActivity.INCOMPLETE;
import static org.openmrs.mobile.activities.assessment.Allergies.CHOICEY2;
import static org.openmrs.mobile.activities.assessment.Assess.FINAL_DIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Assess.S4;
import static org.openmrs.mobile.activities.assessment.Breathless.S5;
import static org.openmrs.mobile.activities.assessment.Bronchodilator.BRONCHODILATOR;
import static org.openmrs.mobile.activities.assessment.Bronchodilator.DATE;
import static org.openmrs.mobile.activities.assessment.Bronchodilator.DURATION;
import static org.openmrs.mobile.activities.assessment.Bronchodilator.FILENAME;
import static org.openmrs.mobile.activities.assessment.Bronchodilator.USERNAME;
import static org.openmrs.mobile.activities.assessment.Bronchodilator.UUIDS;
import static org.openmrs.mobile.activities.assessment.Bronchodilator2.BDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Bronchodilator2.REASON;
import static org.openmrs.mobile.activities.assessment.Bronchodilator3.B3DIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Bronchodilator3.BRONC;
import static org.openmrs.mobile.activities.assessment.ChestIndrawing.CHOICE7;
import static org.openmrs.mobile.activities.assessment.ChestIndrawing.CHOICE72;
import static org.openmrs.mobile.activities.assessment.ChestIndrawing.CIDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.ChestIndrawing.POINT;
import static org.openmrs.mobile.activities.assessment.ChestIndrawing.POINT2;
import static org.openmrs.mobile.activities.assessment.Cough.CHOICE2;
import static org.openmrs.mobile.activities.assessment.Cough.NODIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.CoughD.DAY1;
import static org.openmrs.mobile.activities.assessment.Eczema.CHOICEX2;
import static org.openmrs.mobile.activities.assessment.FTouch.FTDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.FTouch.TOUCH;
import static org.openmrs.mobile.activities.assessment.HIVCare.CHOICEHC;
import static org.openmrs.mobile.activities.assessment.HIVStatus.CHOICE3;
import static org.openmrs.mobile.activities.assessment.HIVStatus.HDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Initials.CIN;
import static org.openmrs.mobile.activities.assessment.Initials.INITIAL_DATE;
import static org.openmrs.mobile.activities.assessment.Initials.PIN;
import static org.openmrs.mobile.activities.assessment.Kerosene.ADIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Kerosene.CHOICET2;
import static org.openmrs.mobile.activities.assessment.Kerosene.TUDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Nasal.CHOICEGN;
import static org.openmrs.mobile.activities.assessment.Oxygen.OXY;
import static org.openmrs.mobile.activities.assessment.RRCounter.FASTBREATHING;
import static org.openmrs.mobile.activities.assessment.RRCounter.FASTBREATHING2;
import static org.openmrs.mobile.activities.assessment.RRCounter.INITIAL_DATE_2;
import static org.openmrs.mobile.activities.assessment.RRCounter.SECOND;
import static org.openmrs.mobile.activities.assessment.Sex.AGE;
import static org.openmrs.mobile.activities.assessment.Sex.AGE2;
import static org.openmrs.mobile.activities.assessment.Sex.CHOICE;
import static org.openmrs.mobile.activities.assessment.Sex.KILO;
import static org.openmrs.mobile.activities.assessment.Sex.MDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Sex.MUAC;
import static org.openmrs.mobile.activities.assessment.Smoke.CHOICET1;
import static org.openmrs.mobile.activities.assessment.Stridor.CHOICE6;
import static org.openmrs.mobile.activities.assessment.Temperature.TDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Temperature.TEMP;
import static org.openmrs.mobile.activities.assessment.WheezD.CHOICEX;
import static org.openmrs.mobile.activities.assessment.WheezY.DAY2;
import static org.openmrs.mobile.activities.assessment.Wheezing.CHOICE8;
import static org.openmrs.mobile.activities.assessment.Wheezing.CHOICE82;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.openmrs.android_sdk.library.api.RestApi;
import com.openmrs.android_sdk.library.databases.entities.LocationEntity;
import com.openmrs.android_sdk.library.models.Assessment;
import com.openmrs.android_sdk.library.models.Diagnosis;
import com.openmrs.android_sdk.library.models.IdentifierType;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.PatientIdentifier;
import com.openmrs.android_sdk.library.models.Person;
import com.openmrs.android_sdk.library.models.PersonAddress;
import com.openmrs.android_sdk.library.models.PersonAttribute;
import com.openmrs.android_sdk.library.models.PersonName;
import com.openmrs.android_sdk.library.models.Resource;
import com.openmrs.android_sdk.library.models.Summary;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.dashboard.DashboardActivity;
import org.openmrs.mobile.net.AlriteAuthorization;
import org.openmrs.mobile.net.AuthorizationManager;
import org.openmrs.mobile.utilities.Instructions;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import com.openmrs.android_sdk.library.api.repository.PatientRepository;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DiagnosisActivity extends AppCompatActivity {
    private static final String OPENMRS_BASE_URL = "http://192.168.1.68:8081/openmrs-standalone/";
    private static final String username = "admin";
    private static final String password = "Admin123";
    private RestApi openMRSAPI;
    LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4;
    Button btnExit, btnExit2, btnContinue, btnSave;
    ImageView imageView1, imageView2;
    RecyclerView recyclerView1, recyclerView2;
    TextView txtInitials, txtAge, txtGender;
    DiagnosisAdapter diagnosisAdapter;
    SummaryAdapter summaryAdapter;
    List<Summary> summaryList;
    List<String> messages = new ArrayList<>();;
    List messageList = new ArrayList<>();;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String DATE_2 = "end_date_2";
    public static final String PENDING = "pending";
    public static final String DURATION_2 = "duration_2";
    SharedPreferences sharedPreferences, sharedPreferences1;
    SharedPreferences.Editor editor, editor1;
    String age, uniqueID, age2, folder, value;
    float ag;
    Dialog dialog;
    RecyclerView recyclerView;
    LinearLayout linearLayout_instruction;
    TextView txtDiagnosis;
    ArrayList<Assessment> assessments;
    List messages2;
    AssessmentAdapter assessmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        AlriteAuthorization authInterceptor = new AlriteAuthorization("admin", "Admin123");

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(authInterceptor)
//                .addInterceptor(loggingInterceptor)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(OPENMRS_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        openMRSAPI = retrofit.create(RestApi.class);

        txtAge = findViewById(R.id.patient_age);
        txtGender = findViewById(R.id.patient_sex);
//        txtInitials = findViewById(R.id.initials);
        imageView1 = findViewById(R.id.accordion);
        linearLayout1 = findViewById(R.id.clickable);
        linearLayout2 = findViewById(R.id.summary2);
        recyclerView1 = findViewById(R.id.recyclerView1);
        imageView2 = findViewById(R.id.accordion2);
        linearLayout3 = findViewById(R.id.clickable2);
        linearLayout4 = findViewById(R.id.summary3);
        btnExit = findViewById(R.id.btnExit);
        btnSave = findViewById(R.id.btnExit2);
        recyclerView2 = findViewById(R.id.recyclerView2);


        Intent intent = getIntent();
        if (intent.hasExtra("filename")){
            folder = intent.getExtras().getString("filename");
            sharedPreferences = getSharedPreferences(folder, Context.MODE_PRIVATE);

            String pending = sharedPreferences.getString(PENDING, "");
//            String incomplete = sharedPreferences.getString(INCOMPLETE, "");

            if (pending.equals("pending")){
                btnSave.setVisibility(View.GONE);
                btnExit.setVisibility(View.VISIBLE);
            } else{
                btnSave.setVisibility(View.GONE);
                btnExit.setVisibility(View.GONE);
            }

        }else{
            sharedPreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
            String bron = sharedPreferences.getString(BRONCHODILATOR, "");
            String fin = sharedPreferences.getString(BRONC, "");
            if (bron.equals("Bronchodialtor Given") && fin.isEmpty()){
                btnSave.setVisibility(View.GONE);
            }else {
                btnSave.setVisibility(View.VISIBLE);
            }
            btnExit.setVisibility(View.VISIBLE);
        }

        editor = sharedPreferences.edit();

        String initials = sharedPreferences.getString(CIN, "");
        age2 = sharedPreferences.getString(AGE, "");
        age = sharedPreferences.getString(AGE2, "");

        String[] split = age.split("\\.");
        ag = Float.parseFloat(age2);
        String gender = sharedPreferences.getString(CHOICE, "");
//        txtInitials.setText(initials);
        txtAge.setText("Age: " + split[0] + " years and " + split[1] + " months");
        txtGender.setText("Gender: " + gender);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linearLayout2.getVisibility() == View.GONE){
                    linearLayout2.setVisibility(View.VISIBLE);
                    imageView1.setImageResource(R.drawable.ic_sub);
                }else{
                    linearLayout2.setVisibility(View.GONE);
                    imageView1.setImageResource(R.drawable.ic_add);
                }
            }
        });

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(DiagnosisActivity.this);
        summaryAdapter = new SummaryAdapter(buildSummaryList());
        recyclerView1.setAdapter(summaryAdapter);
        recyclerView1.setLayoutManager(layoutManager1);

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linearLayout4.getVisibility() == View.GONE){
                    linearLayout4.setVisibility(View.VISIBLE);
                    imageView2.setImageResource(R.drawable.ic_sub);
                }else{
                    linearLayout4.setVisibility(View.GONE);
                    imageView2.setImageResource(R.drawable.ic_add);
                }
            }
        });

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(DiagnosisActivity.this);
        diagnosisAdapter = new DiagnosisAdapter(buildItemList());
        recyclerView2.setAdapter(diagnosisAdapter);
        recyclerView2.setLayoutManager(layoutManager2);

        diagnosisAdapter.setOnItemClickListener(new DiagnosisAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Diagnosis diagnosis = buildItemList().get(position);
                String dia = diagnosis.getDiagnosis();
                showInstructions(dia);
//                Toast.makeText(DiagnosisActivity.this, dia, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClick2(int position) {

            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "not pending";
                saveForm();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = "pending";
//                saveForm();
                syncToOpenMRS(client);
            }
        });
    }

    private void syncToOpenMRS(OkHttpClient client) {
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");

        final String[] patientUuid = new String[1];
        final CountDownLatch searchLatch = new CountDownLatch(1);

        String age = sharedPreferences.getString(AGE2, "");
        String[] split = age.split("\\.");
        int years = Integer.parseInt(split[0]);
        int months = Integer.parseInt(split[1]);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Calendar calendar = Calendar.getInstance();
        String date = sdf.format(calendar.getTime());
        calendar.add(Calendar.YEAR, -years);
        calendar.add(Calendar.MONTH, -months);
        Date estimatedBirthDate = calendar.getTime();
        String estimatedBirthdateString = sdf.format(estimatedBirthDate);

        String cin = sharedPreferences.getString(CIN, "");
        String[] patientName = cin.split(" ");
        String patientFullname = patientName[0].trim();
        if (patientName.length == 2) {
            patientFullname += " " + patientName[1].trim();
        }

        String gender = sharedPreferences.getString(CHOICE, "");


        Request searchPatientRequest = new Request.Builder()
                .url(OPENMRS_BASE_URL + "ws/rest/v1/patient?q=" + patientFullname.trim() + "&v=default")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", Credentials.basic(username, password))
                .build();

        client.newCall(searchPatientRequest).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                e.printStackTrace();
                searchLatch.countDown();
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                try {
                    if (response.isSuccessful()) {
                        String responseBody = response.body().string();
                        System.out.println(responseBody);
                        JSONObject jsonResponse = null;
                        try {
                            jsonResponse = new JSONObject(responseBody);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            JSONArray patients = jsonResponse.getJSONArray("results");
                            if (patients.length() != 0) {
                                for (int i = 0; i < patients.length(); i++) {
                                    JSONObject patient = patients.getJSONObject(i);
                                    System.out.println(patient.toString());
                                    JSONObject person = patient.getJSONObject("person");
                                    String birthdate = person.getString("birthdate");
                                    Calendar birthdateCalendar = Calendar.getInstance();
                                    birthdateCalendar.setTime(sdf.parse(birthdate));

                                    Calendar birthdayEstimateCalendar = Calendar.getInstance();
                                    birthdayEstimateCalendar.setTime(sdf.parse(estimatedBirthdateString));
                                    long timeDifferenceInMillis = Math.abs(birthdateCalendar.getTimeInMillis() - birthdayEstimateCalendar.getTimeInMillis());
                                    long timeDifferenceInMonths = timeDifferenceInMillis / (1000 * 60 * 60 * 24 * 30L);
                                    System.out.println(birthdateCalendar);
                                    System.out.println(birthdayEstimateCalendar);
                                    String patientGender = person.getString("gender");
                                    if (timeDifferenceInMonths <= 1 && patientGender.equalsIgnoreCase("" + gender.toUpperCase().charAt(0))) {
                                        String display = patient.getString("display");
                                        System.out.println(display);
                                        patientUuid[0] = patient.getString("uuid");
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("Error searching");
                    }
                } finally {
                    if (response.body() != null) {
                        response.body().close();
                    }
                    searchLatch.countDown();
                }
            }
        });

        try {
            searchLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (patientUuid[0] == null) {
            final String[] identifier = new String[1];
            final CountDownLatch identifierLatch = new CountDownLatch(1);
            String getIdentifiersPayload = "{"
                    + "\"generateIdentifiers\": true,"
                    + "\"sourceUuid\": \"691eed12-c0f1-11e2-94be-8c13b969e334\","
                    + "\"numberToGenerate\": 1"
                    + "}";

            RequestBody identifierRequestBody = RequestBody.create(getIdentifiersPayload, mediaType);
            Request identifierRequest = new Request.Builder()
                    .url(OPENMRS_BASE_URL + "ws/rest/v1/idgen/identifiersource")
                    .post(identifierRequestBody)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Authorization", Credentials.basic(username, password))
                    .build();

            client.newCall(identifierRequest).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                    identifierLatch.countDown();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try {
                        if (response.isSuccessful()) {
                            String responseBody = response.body().string();
                            JSONObject jsonResponse = null;
                            try {
                                jsonResponse = new JSONObject(responseBody);
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                            try {
                                JSONArray identifiers = jsonResponse.getJSONArray("identifiers");
                                identifier[0] = identifiers.getString(0);
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            System.out.println("Error making identifier: " + response.message());
                        }
                    } finally {
                        if (response.body() != null) {
                            response.body().close();
                        }
                    }
                    identifierLatch.countDown();
                }
            });
            try {
                identifierLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Identifier: " + identifier[0]);
            String patientPayload = "{\n" +
                    "  \"person\": {\n" +
                    "    \"names\": [\n" +
                    "      {\n" +
                    "        \"preferred\": true,\n" +
                    "        \"givenName\": \"" + patientName[0] + "\",\n" +
                    "        \"middleName\": \"\",\n" +
                    "        \"familyName\": \"" + patientName[1] + "\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"gender\": \"" + gender.toUpperCase().charAt(0) + "\",\n" +
                    "    \"birthdate\": \"" + estimatedBirthdateString + "\",\n" +
                    "    \"birthdateEstimated\": true,\n" +
                    "    \"attributes\": [],\n" +
                    "    \"addresses\": [\n" +
                    "      {\n" +
                    "        \"address1\": \"Main Street\",\n" +
                    "        \"country\": \"Uganda\",\n" +
                    "        \"stateProvince\": \"\",\n" +
                    "        \"cityVillage\": \"\",\n" +
                    "        \"postalCode\": \"\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"dead\": false\n" +
                    "  },\n" +
                    "  \"identifiers\": [\n" +
                    "    {\n" +
                    "      \"identifier\": \"" + identifier[0] + "\",\n" +
                    "      \"identifierType\": \"05a29f94-c0ed-11e2-94be-8c13b969e334\",\n" +
                    "      \"location\": \"b1a8b05e-3542-4037-bbd3-998ee9c40574\",\n" +
                    "      \"preferred\": true\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}";

            final CountDownLatch patientLatch2 = new CountDownLatch(1);
            RequestBody patientRequestBody = RequestBody.create(patientPayload, mediaType);
            Request patientRequest = new Request.Builder()
                    .url(OPENMRS_BASE_URL + "ws/rest/v1/patient")
                    .post(patientRequestBody)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Authorization", Credentials.basic(username, password))
                    .build();

            client.newCall(patientRequest).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                    patientLatch2.countDown();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try {
                        if (response.isSuccessful()) {
                            String responseBody = response.body().string();
                            JSONObject jsonResponse = null;
                            try {
                                jsonResponse = new JSONObject(responseBody);
                                System.out.println(jsonResponse);
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                            try {
                                patientUuid[0] = jsonResponse.getString("uuid");
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            System.out.println("Error making patient: " + response.message());
                        }
                    } finally {
                        if (response.body() != null) {
                            response.body().close();
                        }
                    }
                    patientLatch2.countDown();
                }
            });
            try {
                patientLatch2.await(); // Wait for the API call to complete
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(patientUuid[0]);

        calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 1);
        String endDate = sdf.format(calendar.getTime());
        String visitPayload = "{"
                + "\"patient\":\"" + patientUuid[0] + "\","
                + "\"visitType\":\"7b0f5697-27e3-40c4-8bae-f4049abfb4ed\","
                + "\"startDatetime\":\"" + date + "\","
                + "\"stopDatetime\":\"" + endDate + "\","
                + "\"location\":\"b1a8b05e-3542-4037-bbd3-998ee9c40574\""
                + "}";

        final String[] visitUuid = new String[1];
        final CountDownLatch visitLatch = new CountDownLatch(1);
        RequestBody visitRequestBody = RequestBody.create(visitPayload, mediaType);
        Request visitRequest = new Request.Builder()
                .url(OPENMRS_BASE_URL + "ws/rest/v1/visit")
                .post(visitRequestBody)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", Credentials.basic(username, password))
                .build();
        client.newCall(visitRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                visitLatch.countDown();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    if (response.isSuccessful()) {
                        String responseBody = response.body().string();
//                        System.out.println(responseBody);
                        JSONObject jsonResponse = null;
                        try {
                            jsonResponse = new JSONObject(responseBody);
                            System.out.println(jsonResponse);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            visitUuid[0] = jsonResponse.getString("uuid");
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("Error making visit: " + response.message());
                    }
                } finally {
                    if (response.body() != null) {
                        response.body().close();
                    }
                }
                visitLatch.countDown();
            }
        });
        try {
            visitLatch.await(); // Wait for the API call to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(visitUuid[0]);
        String vitalsPayload = "{\n" +
                "  \"encounterDatetime\": \"" + date + "\",\n" +
                "  \"patient\": \"" + patientUuid[0] + "\",\n" +
                "  \"encounterType\": \"67a71486-1a54-468f-ac3e-7091a9a79584\",\n" + // VITALS
                "  \"location\": \"b1a8b05e-3542-4037-bbd3-998ee9c40574\",\n" +
                "  \"visit\":\"" + visitUuid[0] + "\"," +
                "  \"encounterProviders\": [\n" +
                "    {\n" +
                "      \"provider\": \"f9badd80-ab76-11e2-9e96-0800200c9a66\",\n" +
                "      \"encounterRole\": \"240b26f9-dd88-4172-823d-4a8bfeb7841f\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"obs\": [\n" +
                createJSONObservations(patientUuid[0], date) +
                "  ]\n" +
                "}";

        RequestBody vitalsRequestBody = RequestBody.create(vitalsPayload, mediaType);
        Request vitalsRequest = new Request.Builder()
                .url(OPENMRS_BASE_URL + "ws/rest/v1/encounter")
                .post(vitalsRequestBody)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", Credentials.basic(username, password))
                .build();
        client.newCall(vitalsRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    System.out.println("Encounter created");
                } else {
                    System.out.println("Error making encounter: " + response.message());
                }
            }
        });

        String visitNotePayload = "{\n" +
                "  \"encounterDatetime\": \"" + date + "\",\n" +
                "  \"patient\": \"" + patientUuid[0] + "\",\n" +
                "  \"encounterType\": \"d7151f82-c1f3-4152-a605-2f9ea7414a79\",\n" + // Visit note
                "  \"location\": \"b1a8b05e-3542-4037-bbd3-998ee9c40574\",\n" +
                "  \"visit\":\"" + visitUuid[0] + "\"," +
                "  \"encounterProviders\": [\n" +
                "    {\n" +
                "      \"provider\": \"f9badd80-ab76-11e2-9e96-0800200c9a66\",\n" +
                "      \"encounterRole\": \"240b26f9-dd88-4172-823d-4a8bfeb7841f\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"obs\": [\n" +
                createJSONDiagnoses(patientUuid[0]) +
                "  ]\n" +
                "}";

        RequestBody visitNoteRequestBody = RequestBody.create(visitNotePayload, mediaType);
        Request visitNoteRequest = new Request.Builder()
                .url(OPENMRS_BASE_URL + "ws/rest/v1/encounter")
                .post(visitNoteRequestBody)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", Credentials.basic(username, password))
                .build();
        client.newCall(visitNoteRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    System.out.println("Encounter 2 created");
                } else {
                    System.out.println("Error making encounter: " + response.message());
                }
            }
        });
    }

    private void showInstructions(String dia) {
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.assessment_layout);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);

        linearLayout_instruction = dialog.findViewById(R.id.diagnosis);
        txtDiagnosis = dialog.findViewById(R.id.txtDiagnosis);
        recyclerView = dialog.findViewById(R.id.recyclerView1);
        btnExit2 = dialog.findViewById(R.id.btnSave);
        btnContinue = dialog.findViewById(R.id.btnContinue);

        linearLayout_instruction.setBackgroundColor(getResources().getColor(R.color.severeDiagnosisColor));
        txtDiagnosis.setText("Diagnosis: " + dia);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        List<Assessment> assessments = new ArrayList<>();
        assessmentAdapter = new AssessmentAdapter(assessments);

//        messages2 = createList(dia);
        createList(dia);

        for (int i = 0; i < messageList.size(); i++){
            Assessment assessment = new Assessment((Integer) messageList.get(i));
            assessments.add(assessment);
        }
        recyclerView.setAdapter(assessmentAdapter);

        btnExit2.setVisibility(View.GONE);
        btnContinue.setText("Close");

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.show();

    }

    private List<Diagnosis> buildItemList() {
        List<Diagnosis> diagnosisList = new ArrayList<>();

        String mDiagnosis = sharedPreferences.getString(MDIAGNOSIS, "");
        String oneDiagnosis = sharedPreferences.getString(FINAL_DIAGNOSIS, "");
        String tDiagnosis = sharedPreferences.getString(TDIAGNOSIS, "");
//        String oxDiagnosis = sharedPreferences.getString(OXDIAGNOSIS, "");
        String noDiagnosis = sharedPreferences.getString(NODIAGNOSIS, "");
        String hDiagnosis = sharedPreferences.getString(HDIAGNOSIS, "");
//        String stDiagnosis = sharedPreferences.getString(STDIAGNOSIS, "");
//        String gnDiagnosis = sharedPreferences.getString(GNDIAGNOSIS, "");
        String ciDiagnosis = sharedPreferences.getString(CIDIAGNOSIS, "");
        String wDiagnosis = sharedPreferences.getString(BDIAGNOSIS, "");
        String asDiagnosis = sharedPreferences.getString(ADIAGNOSIS, "");
        String tuDiagnosis = sharedPreferences.getString(TUDIAGNOSIS, "");
        String b3Diagnosis = sharedPreferences.getString(B3DIAGNOSIS, "");
        String ftDiagnosis = sharedPreferences.getString(FTDIAGNOSIS, "");

//        if (!aDiagnosis.isEmpty() || !oxDiagnosis.isEmpty() || !stDiagnosis.isEmpty() || !gnDiagnosis.isEmpty()){
//            addToList2("Severe Pneumonia OR very Severe Disease");
//        }

        addToList2(oneDiagnosis);
        addToList2(mDiagnosis);
        addToList2(tDiagnosis);
//        addToList2(oxDiagnosis);
        addToList2(noDiagnosis);
        addToList2(hDiagnosis);
//        addToList2(stDiagnosis);
//        addToList2(gnDiagnosis);
        addToList2(ciDiagnosis);
        addToList2(wDiagnosis);
        addToList2(asDiagnosis);
        addToList2(tuDiagnosis);
        addToList2(b3Diagnosis);
        addToList2(ftDiagnosis);


        for (int i=0; i < messages.size(); i++) {
            Diagnosis diagnosis = new Diagnosis(messages.get(i), buildSubItemList(messages.get(i)));
            diagnosisList.add(diagnosis);
        }
        return diagnosisList;
    }

    private List<Assessment> buildSubItemList(String s) {
        List<Assessment> assessmentList = new ArrayList<>();

        createList(s);

        for (int i=0; i < messageList.size(); i++) {
            Assessment assessment = new Assessment((Integer) messageList.get(i));
            assessmentList.add(assessment);
        }
        return assessmentList;
    }

    private List<Summary> buildSummaryList(){
        summaryList = new ArrayList<>();
        String pin = sharedPreferences.getString(PIN, "");
        String weight = sharedPreferences.getString(KILO, "");
        String muac = sharedPreferences.getString(MUAC, "");
        String assess = sharedPreferences.getString(S4, "");
        String temp = sharedPreferences.getString(TEMP, "");
        String feb = sharedPreferences.getString(TOUCH, "");
        String ox = sharedPreferences.getString(OXY, "");
        String wheez = sharedPreferences.getString(CHOICE8, "");
        String wheez2 = sharedPreferences.getString(CHOICE82, "");
        String cough = sharedPreferences.getString(CHOICE2, "");
        String hiv = sharedPreferences.getString(CHOICE3, "");
        String care = sharedPreferences.getString(CHOICEHC, "");
        String coughD = sharedPreferences.getString(DAY1, "");
        String fastbreathing = sharedPreferences.getString(FASTBREATHING, "");
        String stidor = sharedPreferences.getString(CHOICE6, "");
//        Boolean steth = sharedPreferences.getBoolean(CHECKSTETHO, false);
        String nasal = sharedPreferences.getString(CHOICEGN, "");
        String chest = sharedPreferences.getString(CHOICE7, "");
        String chest2 = sharedPreferences.getString(CHOICE72, "");
        String bronch = sharedPreferences.getString(BRONCHODILATOR, "");
        String reason = sharedPreferences.getString(REASON, "");
        String wheezD = sharedPreferences.getString(CHOICEX, "");
        String wheezY = sharedPreferences.getString(DAY2, "");
        String breathless = sharedPreferences.getString(S5, "");
        String eczema = sharedPreferences.getString(CHOICEX2, "");
        String allergies = sharedPreferences.getString(CHOICEY2, "");
        String smoke = sharedPreferences.getString(CHOICET1, "");
        String kerosene = sharedPreferences.getString(CHOICET2, "");
        String fastbreathing2 = sharedPreferences.getString(FASTBREATHING2, "");
        String better = sharedPreferences.getString(BRONC, "");
        String point1 = sharedPreferences.getString(POINT, "");
        String point2 = sharedPreferences.getString(POINT2, "");
        String diagnosis = sharedPreferences.getString(S7, "");
        String treatment = sharedPreferences.getString(S6, "");

        addToList("Parent's initials", pin);
        addToList("Child's weight", weight);
        addToList("MUAC value", muac);
        addToList("Danger Signs", assess);
        addToList("Child Coughing", cough);
        addToList("Days coughing", coughD);
        addToList("Temperature", temp);
        addToList("Febrile to touch", feb);
        addToList("HIV Status", hiv);
        addToList("Child in HIV Care", care);
        addToList("Oxgyen Saturation", ox);
        addToList("Respiratory Rate", fastbreathing);
        addToList("Child has Stridor", stidor);
        addToList("Child Wheezing", wheez);
//        addToList("Stethoscope was used", String.valueOf(steth));
        addToList("Child has grunting or nasal flaring", nasal);
        addToList("Child has chest indrawing", chest);
        addToList("Respiratory score", point1);
        addToList("Bronchodilator", bronch);
        addToList("Reason", reason);
        addToList("Respiratory Rate (After bronchodilator)", fastbreathing2);
        addToList("Child Wheezing", wheez2);
        addToList("Child has chest indrawing", chest2);
        addToList("Child's breathing after bronchodilator", better);
        addToList("Respiratory score 2", point2);
        addToList("Child has breathing difficulty", wheezD);
        addToList("Episodes in the past year", wheezY);
        addToList("Child his breathless", breathless);
        addToList("Child has Eczema", eczema);
        addToList("Child's family has Allergies", allergies);
        addToList("Any family member smoking tobacco", smoke);
        addToList("Any family member using kerosene", kerosene);
        addToList("Clinician's diagnosis", diagnosis);
        addToList("Clinician's treatment", treatment);
        return summaryList;
    }

    private void addToList(String s, String pin) {
        if (!pin.isEmpty()){
            Summary summary = new Summary(s, pin);
            summaryList.add(summary);
        }
    }

    private void addToList2(String s) {
        if (!s.isEmpty()){
            messages.add(s);
        }
    }

    private void createList(String s) {
        String weight = sharedPreferences.getString(KILO, "");
        int ag = Integer.parseInt(age2);

        if (s.equals("Severe Pneumonia OR very Severe Disease")){
            String st = sharedPreferences.getString(S4, "");
            Instructions instructions = new Instructions();
            messageList = instructions.GetInstructions(ag, weight, st);
        }
        else if (s.equals("Severe acute malnutrition")){
            messageList = Arrays.asList(R.string.muac, R.string.muac1,
                    R.string.muac2, R.string.muac3, R.string.muac4, R.string.muac5);
        }
        else if (s.equals("Moderate acute malnutrition")){
            messageList = Arrays.asList(R.string.muac6, R.string.muac7);
        }
        else if (s.equals("Fever without danger signs")){
            if (!weight.isEmpty()) {
                float we = Float.parseFloat(weight);
                if (we >= 4.0 && we < 14.0) {
                    messageList = Arrays.asList(R.string.febril3, R.string.paracetamol2, R.string.febril5,
                            R.string.febril6, R.string.febril7);
                }else if (we >= 14.0) {
                    messageList = Arrays.asList(R.string.febril3, R.string.paracetamol3, R.string.febril5,
                            R.string.febril6, R.string.febril7);
                }else {
                    if (ag >= 2 && ag < 36){
                        messageList = Arrays.asList(R.string.febril3, R.string.paracetamol2, R.string.febril5,
                                R.string.febril6, R.string.febril7);
                    }else  if (ag >= 36 && ag < 60){
                        messageList = Arrays.asList(R.string.febril3, R.string.paracetamol3, R.string.febril5,
                                R.string.febril6, R.string.febril7);
                    }
                }
            } else {
                if (ag >= 2 && ag < 36){
                    messageList = Arrays.asList(R.string.febril3, R.string.paracetamol2, R.string.febril5,
                            R.string.febril6, R.string.febril7);
                }else  if (ag >= 36 && ag < 60){
                    messageList = Arrays.asList(R.string.febril3, R.string.paracetamol3, R.string.febril5,
                            R.string.febril6, R.string.febril7);
                }
            }

        }
        else if (s.equals("Very severe febrile illness")){
            Instructions instructions = new Instructions();
            messageList = instructions.GetFebrilInstructions(ag, weight);
        }
        else if (s.equals("No signs of Pneumonia or Wheezing illness")){
            messageList = Arrays.asList(R.string.selected, R.string.alrite, R.string.no_anti, R.string.other_illness);
        }
        else if (s.contains("HIV-Infected")){
            String care = sharedPreferences.getString(CHOICEHC, "");
            String chest = sharedPreferences.getString(CHOICE7, "");

            Instructions instructions = new Instructions();
            messageList = instructions.GetHIVInfected(care, chest, ag, weight);

        }
        else if (s.contains("HIV-Exposed")){
            String care = sharedPreferences.getString(CHOICEHC, "");
            String chest = sharedPreferences.getString(CHOICE7, "");

            Instructions instructions = new Instructions();
            messageList = instructions.GetHIVExposed(care, chest, ag, weight);

        }
        else if (s.equals("Pneumonia")){
            Instructions instructions = new Instructions();
            messageList = instructions.GetPneumoniaInstructions(ag, weight);
        }
        else if (s.equals("Cough/Cold/No Pneumonia")){
            messageList = Arrays.asList(R.string.cold1, R.string.cold2, R.string.cold3, R.string.cold4);
        }
        else if (s.equals("Wheezing (not clear Bronchodilator response)")){
            if (ag < 24){
                messageList = Arrays.asList(R.string.wheez_ill1, R.string.wheez_ill2, R.string.wheez_ill3,
                        R.string.wheez_ill4, R.string.wheez_ill5, R.string.wheez_ill6);
            }else {
                messageList = Arrays.asList(R.string.wheez_ill1, R.string.wheez_ill2, R.string.wheez_ill7,
                        R.string.wheez_ill8, R.string.wheez_ill9);
            }
        }
        else if (s.equals("Asthma Risk")){
            messageList = Arrays.asList(R.string.asthma1, R.string.wheez3, R.string.asthma2, R.string.asthma3);
        }
        else if (s.equals("Tuberculosis Risk")){
            messageList = Arrays.asList(R.string.tuber1, R.string.tuber2);
        }
        else if (s.equals("Wheezing illness (Bronchodilator response)")){
            messageList = Arrays.asList(R.string.wheez_ill00, R.string.wheez_ill01, R.string.wheez_ill71,
                    R.string.wheez_ill72, R.string.wheez_ill8, R.string.wheez_ill9);
        }else if (s.equals("Severe Disease")){
            messageList = Collections.singletonList(R.string.bronc1x);
        }

    }

    private void saveForm() {

        String file = sharedPreferences.getString(FILENAME, "");

        Date currentTime = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss", Locale.getDefault());
        String formattedDate = df.format(currentTime);

        String username = "";

        uniqueID = UUID.randomUUID().toString();

        if (file.isEmpty()){
            System.out.println("here");
            getDuration(currentTime);

            editor.putString(USERNAME, username);
            editor.putString(DATE, formattedDate);
            editor.putString(UUIDS, uniqueID);
            editor.putString(PENDING, value);
            editor.putString(INCOMPLETE, "complete");
            editor.apply();

            String filename = formattedDate + "_" + uniqueID;
            editor.putString(FILENAME, filename);
            editor.apply();
//            Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show();
            doLogic(filename);
        }else {
            System.out.println("here 2");
            editor.putString(PENDING, value);
            editor.putString(INCOMPLETE, "complete");
            String filename = formattedDate + "_" + uniqueID;
            editor.putString(FILENAME, filename);
            editor.putString(DATE, formattedDate);
            editor.apply();

            getDuration2(currentTime);
//            Toast.makeText(this, "not empty", Toast.LENGTH_SHORT).show();
            doLogic(filename);
        }

    }

    private void getDuration(Date currentTime) {
        String initial_date = sharedPreferences.getString(INITIAL_DATE, "");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss", Locale.getDefault());
        try {
            Date d1 = format.parse(initial_date);

            long diff = currentTime.getTime() - d1.getTime();//as given

            long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
            String duration = String.valueOf(minutes);
            editor.putString(DURATION, duration);
            editor.apply();
            Log.d("Difference in time", "getTimeDifference: " + minutes);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void getDuration2(Date currentTime) {
        String initial_date = sharedPreferences.getString(INITIAL_DATE_2, "");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss", Locale.getDefault());
        try {
            Date d1 = format.parse(initial_date);

            long diff = currentTime.getTime() - d1.getTime();//as given

            long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
            String duration = String.valueOf(minutes);
            editor.putString(DURATION_2, duration);
            editor.apply();
            Log.d("Difference in time", "getTimeDifference: " + minutes);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void doLogic(String file) {
        sharedPreferences1 = getSharedPreferences(file, Context.MODE_PRIVATE);
        editor1 = sharedPreferences1.edit();
        Map<String, ?> all = sharedPreferences.getAll();
        for (Map.Entry<String, ?> x : all.entrySet()) {
            if (x.getValue().getClass().equals(String.class))  editor1.putString(x.getKey(),  (String)x.getValue());
//            else if (x.getValue().getClass().equals(Boolean.class)) editor1.putBoolean(x.getKey(), (Boolean)x.getValue());
        }
        editor1.commit();
        editor.clear();
        editor.commit();

        String bron = sharedPreferences1.getString(BRONCHODILATOR, "");
        String fin = sharedPreferences1.getString(BRONC, "");
        Intent intent;
        if (bron.equals("Bronchodialtor Given") && fin.isEmpty()){
            intent = new Intent(DiagnosisActivity.this, DashboardActivity.class);
        }else{
            if (value.equals("not pending")){
                intent = new Intent(DiagnosisActivity.this, FinalActivity.class);
                intent.putExtra("filename", file);
            }else {
                editor1.putString(SECOND, file);
                editor1.apply();
                intent = new Intent(DiagnosisActivity.this, DashboardActivity.class);
            }
        }

        startActivity(intent);

    }

    private String createJSONDiagnoses(String patientUuid) {
        List<Diagnosis> diagnosisList = buildItemList();
        Set<String> set = new HashSet<>();
        for (Diagnosis diagnosis : diagnosisList) {
            set.add(diagnosis.getDiagnosis());
        }
        Iterator<String> itr = set.iterator();
        String diagnosis = itr.next();
        String result = "    {\n" +
                "      \"concept\": \"159947AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis concept
                "      \"person\": \"" + patientUuid + "\",\n" +
                "      \"obsDatetime\": \"2023-04-24T12:00:00.000Z\",\n" +
                "      \"groupMembers\": [\n" +
                "        {\n" +
                "          \"concept\": \"159946AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis order (e.g., primary)
                "          \"value\": \"159943AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"\n" + // Primary order concept
                "        },\n" +
                "        {\n" +
                "          \"concept\": \"159394AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis certainty
                "          \"value\": \"159393AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"\n" + // Presumed diagnosis concept
                "        },\n" +
                "        {\n" +
                "          \"concept\": \"161602AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                "          \"value\": \"" + diagnosis + "\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n";
        while (itr.hasNext()) {
            String diagnosis2 = itr.next();
            result += ",{\n" +
                    "      \"concept\": \"159947AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis concept
                    "      \"person\": \"" + patientUuid + "\",\n" +
                    "      \"obsDatetime\": \"2023-04-24T12:00:00.000Z\",\n" +
                    "      \"groupMembers\": [\n" +
                    "        {\n" +
                    "          \"concept\": \"159946AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis order (e.g., primary)
                    "          \"value\": \"159943AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"\n" + // Primary order concept
                    "        },\n" +
                    "        {\n" +
                    "          \"concept\": \"159394AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis certainty
                    "          \"value\": \"159393AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"\n" + // Presumed diagnosis concept
                    "        },\n" +
                    "        {\n" +
                    "          \"concept\": \"161602AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                    "          \"value\": \"" + diagnosis2 + "\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    }\n";
        }
        return result;
    }

    private String createJSONObservations(String patientUuid, String date) {
        String weight = sharedPreferences.getString(KILO, "");
        String muac = sharedPreferences.getString(MUAC, "");
        String temperature = sharedPreferences.getString(TEMP, "");
        String oxygen = sharedPreferences.getString(OXY, "");

        String result = "    {\n" +
                "      \"person\": \"" + patientUuid + "\",\n" +
                "      \"concept\": \"5089AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                "      \"obsDatetime\": \"" + date + "\",\n" +
                "      \"value\": \"" + weight + "\" \n" +
                "    }\n";
        if (muac != null && !muac.isEmpty()) {
            result += ",{\n" +
                    "      \"person\": \"" + patientUuid + "\",\n" +
                    "      \"concept\": \"1343AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                    "      \"obsDatetime\": \"" + date + "\",\n" +
                    "      \"value\": \"" + muac + "\" \n" +
                    "    }\n";
        }

        if (temperature != null && !temperature.isEmpty()) {
            result += ",{\n" +
                    "      \"person\": \"" + patientUuid + "\",\n" +
                    "      \"concept\": \"5088AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                    "      \"obsDatetime\": \"" + date + "\",\n" +
                    "      \"value\": \"" + temperature + "\" \n" +
                    "    }\n";
        }

        if (oxygen != null && !oxygen.isEmpty()) {
            result += ",{\n" +
                    "      \"person\": \"" + patientUuid + "\",\n" +
                    "      \"concept\": \"5092AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                    "      \"obsDatetime\": \"" + date + "\",\n" +
                    "      \"value\": \"" + oxygen + "\" \n" +
                    "    }\n";
        }
        return result;
    }

    @Override
    public void onBackPressed() {
        Intent intent = getIntent();
        if (intent.hasExtra("filename")){
            Bundle bundle = new Bundle();
            Intent intent2 = new Intent(this, PatientActivity.class);
            bundle.putInt("Fragment", 3);
            intent2.putExtras(bundle);
            startActivity(intent2);
            finish();
        }else{
            Toast.makeText(this, "Please click the Save button", Toast.LENGTH_SHORT).show();
        }

    }
}