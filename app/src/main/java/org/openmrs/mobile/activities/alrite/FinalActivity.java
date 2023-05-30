package org.openmrs.mobile.activities.alrite;

import static org.openmrs.mobile.activities.assessment.Assess.FINAL_DIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Assess.S4;
import static org.openmrs.mobile.activities.assessment.Bronchodilator2.BDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Bronchodilator3.B3DIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.ChestIndrawing.CHOICE7;
import static org.openmrs.mobile.activities.assessment.ChestIndrawing.CIDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Cough.NODIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.FTouch.FTDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.HIVCare.CHOICEHC;
import static org.openmrs.mobile.activities.assessment.HIVStatus.HDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Initials.CIN;
import static org.openmrs.mobile.activities.assessment.Initials.PIN;
import static org.openmrs.mobile.activities.assessment.Kerosene.ADIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Kerosene.TUDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Oxygen.OXY;
import static org.openmrs.mobile.activities.assessment.Sex.AGE;
import static org.openmrs.mobile.activities.assessment.Sex.AGE2;
import static org.openmrs.mobile.activities.assessment.Sex.CHOICE;
import static org.openmrs.mobile.activities.assessment.Sex.KILO;
import static org.openmrs.mobile.activities.assessment.Sex.MDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Sex.MUAC;
import static org.openmrs.mobile.activities.assessment.Temperature.TDIAGNOSIS;
import static org.openmrs.mobile.activities.assessment.Temperature.TEMP;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.openmrs.android_sdk.library.models.Assessment;
import com.openmrs.android_sdk.library.models.Diagnosis;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.dashboard.DashboardActivity;
import org.openmrs.mobile.net.AlriteAuthorization;
import org.openmrs.mobile.utilities.Instructions;

import java.io.IOException;
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
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

public class FinalActivity extends AppCompatActivity {
    private static final String OPENMRS_BASE_URL = "http://192.168.1.68:8081/openmrs-standalone/";
//    private static final String OPENMRS_BASE_URL = "http://10.19.131.217:8086/openmrs-standalone/";

    private static final String username = "admin";
    private static final String password = "Admin123";
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11, checkBox12, checkBox13, checkBox14;
    EditText etOther1, etOther2;
    Button btnSave;
    String s1, s2, diagnosis, treatment, filename;
    String age, uniqueID, age2, folder, value;
    public static final String S6 = "clinician_treatment";
    public static final String S7 = "clinician_diagnosis";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    List<String> messages = new ArrayList<>();
    List messageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        filename = getIntent().getStringExtra("filename");

        sharedPreferences = getSharedPreferences(filename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        btnSave = findViewById(R.id.btnExit);
        etOther1 = findViewById(R.id.otherText);
        etOther2 = findViewById(R.id.otherText2);
        checkBox1 = findViewById(R.id.severe);
        checkBox2 = findViewById(R.id.pneumonia);
        checkBox3 = findViewById(R.id.wheezing);
        checkBox4 = findViewById(R.id.cough);
        checkBox5 = findViewById(R.id.other);
        checkBox6 = findViewById(R.id.referral);
        checkBox7 = findViewById(R.id.antibiotics);
        checkBox8 = findViewById(R.id.inhaled);
        checkBox9 = findViewById(R.id.oral);
//        checkBox10 = findViewById(R.id.antimalarials);
        checkBox11= findViewById(R.id.steroids);
        checkBox12= findViewById(R.id.supportive);
        checkBox13 = findViewById(R.id.other2);
//        checkBox14 = findViewById(R.id.malaria);
        String initials = sharedPreferences.getString(CIN, "");
        age2 = sharedPreferences.getString(AGE, "");
        age = sharedPreferences.getString(AGE2, "");
        System.out.println(age2);

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        AlriteAuthorization authInterceptor = new AlriteAuthorization(username, password);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(authInterceptor)
//                .addInterceptor(loggingInterceptor)
                .build();

        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox5.isChecked()){
                    etOther1.setVisibility(View.VISIBLE);
                }else {
                    etOther1.setVisibility(View.GONE);
                    etOther1.setText("");
                }
            }
        });
        
        checkBox13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox13.isChecked()){
                    etOther2.setVisibility(View.VISIBLE);
                }else {
                    etOther2.setVisibility(View.GONE);
                    etOther2.setText("");
                }
            }
        });
        
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diagnosis = etOther1.getText().toString();
                treatment = etOther2.getText().toString();
                if (etOther1.getVisibility()==View.VISIBLE && diagnosis.isEmpty()){
                    Toast.makeText(FinalActivity.this, "Please provide your diagnosis", Toast.LENGTH_SHORT).show();
                }else if(etOther2.getVisibility()==View.VISIBLE && treatment.isEmpty()){
                    Toast.makeText(FinalActivity.this, "Please provide your treatment", Toast.LENGTH_SHORT).show();
                }else {
                    checkedList();
                    syncToOpenMRS(client);
                }
            }
        });

    }

    private void checkedList() {
        s1 = "";

        if(checkBox1.isChecked()){
            s1 += "Severe pneumonia or very severe disease, ";
        }
        if(checkBox2.isChecked()){
            s1 += "Pneumonia, ";
        }
        if(checkBox3.isChecked()){
            s1 += "Wheezing illness, ";
        }
        if(checkBox4.isChecked()){
            s1 += "Cough/Cold/No pneumonia, ";
        }
//        if(checkBox14.isChecked()){
//            s1 += "Malaria, ";
//        }
        if (!diagnosis.isEmpty()){
            s1 += diagnosis + ", ";
        }
        s1 = s1.replaceAll(", $", "");
        System.out.println(s1);
        if (s1.isEmpty()){
            Toast.makeText(this, "Choose at least one diagnosis option", Toast.LENGTH_SHORT).show();
        }else {
            checkedList2();
        }
    }

    private void checkedList2() {
        s2 = "";

        if(checkBox6.isChecked()){
            s2 += "Referral, ";
        }
        if(checkBox7.isChecked()){
            s2 += "Antibiotics, ";
        }
        if(checkBox8.isChecked()){
            s2 += "Inhaled salbutamol, ";
        }
        if(checkBox9.isChecked()){
            s2 += "Oral salbutamol, ";
        }
//        if(checkBox10.isChecked()){
//            s2 += "Antimalarials, ";
//        }
        if(checkBox11.isChecked()){
            s2 += "Systemic steroids, ";
        }
        if(checkBox12.isChecked()){
            s2 += "Supportive care, ";
        }
        if (!treatment.isEmpty()){
            s2 += treatment + ", ";
        }
        s2 = s2.replaceAll(", $", "");
        if (s2.isEmpty()){
            Toast.makeText(this, "Choose at least one treatment option", Toast.LENGTH_SHORT).show();
        }else {
            System.out.println(s2);
        }
    }

    private void saveData() {
        editor.putString(S7, s1);
        editor.putString(S6, s2);
        editor.apply();
        editor.commit();
        startActivity(new Intent(FinalActivity.this, DashboardActivity.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Please click the Save and Exit button", Toast.LENGTH_SHORT).show();
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

    private String createJSONDiagnoses(String patientUuid, String date) {
        List<String> confirmedDiagnoses = Arrays.asList(s1.split(","));

        List<Diagnosis> presumedDiagnoses = buildItemList();
        Set<String> set = new HashSet<>();
        for (Diagnosis presumedDiagnosis : presumedDiagnoses) {
            boolean contains = false;
            for (String confirmedDiagnosis : confirmedDiagnoses){
                if (presumedDiagnosis.getDiagnosis().trim().equalsIgnoreCase(confirmedDiagnosis.trim())) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                set.add(presumedDiagnosis.getDiagnosis());
            }
        }
        Iterator<String> itr = set.iterator();
        String result = "";
        if (itr.hasNext()) {
            String diagnosis = itr.next();

            result += "    {\n" +
                    "      \"concept\": \"159947AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis concept
                    "      \"person\": \"" + patientUuid + "\",\n" +
                    "      \"obsDatetime\": \"" + date + "\",\n" +
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

            // Presumed diagnoses
            while (itr.hasNext()) {
                String diagnosis2 = itr.next();
                result += ",{\n" +
                        "      \"concept\": \"159947AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis concept
                        "      \"person\": \"" + patientUuid + "\",\n" +
                        "      \"obsDatetime\": \"" + date + "\",\n" +
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
        }


        for (String confirmedDiagnosis : confirmedDiagnoses) {
            result += ",{\n" +
                    "      \"concept\": \"159947AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis concept
                    "      \"person\": \"" + patientUuid + "\",\n" +
                    "      \"obsDatetime\": \"" + date + "\",\n" +
                    "      \"groupMembers\": [\n" +
                    "        {\n" +
                    "          \"concept\": \"159946AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis order (e.g., primary)
                    "          \"value\": \"159943AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"\n" + // Primary order concept
                    "        },\n" +
                    "        {\n" +
                    "          \"concept\": \"159394AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Diagnosis certainty
                    "          \"value\": \"159392AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"\n" + // Confirmed diagnosis concept
                    "        },\n" +
                    "        {\n" +
                    "          \"concept\": \"161602AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                    "          \"value\": \"" + confirmedDiagnosis.trim() + "\"\n" +
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

    private void addToList2(String s) {
        if (!s.isEmpty()){
            messages.add(s);
        }
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
                createJSONDiagnoses(patientUuid[0], date) + "," +
                createJSONClinicalNote(patientUuid[0], date) +
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
        saveData();
    }

    private String createJSONClinicalNote(String patientUuid, String date) {

        return "    {\n" +
                "      \"concept\": \"162169AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" + // Clinical note concept
                "      \"person\": \"" + patientUuid + "\",\n" +
                "      \"obsDatetime\": \"" + date + "\",\n" +
                "      \"value\": \"" + s2 + "\"\n" +
                "    }\n";
    }

}