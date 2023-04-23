package com.ug.air.alrite.Activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.ug.air.alrite.R;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;

public class PersonActivity extends AppCompatActivity implements View.OnClickListener {
    TextView homeUrl;
    TextView givenName;
    TextView familyName;
    TextView gender;
    TextView birthDate;
    TextView phoneNumber;
    TextView alriteIdentifier;
    private class AddInBackgroundTask extends AsyncTask<String, Integer, Long> {

        // these Strings / or String are / is the parameters of the task, that can be handed over via the excecute(params) method of AsyncTask
        protected Long doInBackground(String... params) {
            //homeUrl, givenName, familyName  gender  birthDate phoneNumber alriteIdentifier
            String url = params[0];
            String given_name = params[1];
            String family_name = params[2];
            String gender = params[3];
            String birth_date = params[4];
            String phone_number = params[5];
            String alrite_identifier = params[6];
            long longNum = 0;

            postToDB(url, given_name, family_name, gender, birth_date, phone_number, alrite_identifier);
            return longNum;
        }

        // this is called whenever you call puhlishProgress(Integer), for example when updating a progressbar when downloading stuff
        protected void onProgressUpdate(Integer... progress) {
        }

        void postToDB(String IP, String given_name, String family_name, String gender, String birth_date, String phone_number, String alrite_identifier)
        {
            final StringBuilder stringBuilder = new StringBuilder(1);
            stringBuilder.append(IP);
            stringBuilder.append("/openmrs-standalone/addPatientInfoBrowser.jsp");

            HttpURLConnection client = null;
            try {
                SimpleDateFormat SDF = new SimpleDateFormat("M/d/y H:m:s", Locale.US);
                String curTime = SDF.format(new Date());

                final StringBuilder sb = new StringBuilder(1);
                // sb.append(String.format("CustomerID=%s&Latitude=%s&Longitude=%s", edtCustID.getText().toString(), edtLat.getText().toString(), edtLon.getText().toString()));
                sb.append("given_name=").append(URLEncoder.encode(given_name, "UTF-8"));
                sb.append("&family_name=").append(URLEncoder.encode(family_name, "UTF-8"));
                sb.append("&gender=").append(URLEncoder.encode(gender, "UTF-8"));
                sb.append("&birth_date=").append(URLEncoder.encode(birth_date, "UTF-8"));
                sb.append("&phone_number=").append(URLEncoder.encode(phone_number, "UTF-8"));
                sb.append("&identifier=").append(URLEncoder.encode(alrite_identifier, "UTF-8"));
                sb.append("&Submit=Submit");

                URL url = new URL(stringBuilder.toString());
                client = (HttpURLConnection) url.openConnection();

                client.setRequestMethod("POST");
                client.setRequestProperty("User-Agent", "vizAbility");
                client.setRequestProperty("Accept-Charset", "UTF-8");
                client.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                client.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                client.setRequestProperty("Accept-Language", "en-US");
                client.setRequestProperty("Referer", "http://vizability-system.com/visability/AddInjury.html");
                client.setRequestProperty("Accept-Encoding", "gzip, deflate");
                client.setRequestProperty("Host", "vizability-system.com");
                client.setFixedLengthStreamingMode(sb.toString().getBytes().length);
                client.setUseCaches (false);
                client.setDoOutput(true);
                client.setDoInput(true);

                client.setReadTimeout(10000);
                client.setConnectTimeout(15000);

                client.connect();

                DataOutputStream outputPost = new DataOutputStream(client.getOutputStream());
                outputPost.writeBytes(sb.toString());
                outputPost.flush();
                outputPost.close();

                InputStream in = new BufferedInputStream(client.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            finally {
                if (client != null) // Make sure the connection is not null.
                    client.disconnect();
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        findViewById(R.id.button).setOnClickListener(this);
        homeUrl = (TextView) findViewById(R.id.URL);
        givenName = (TextView) findViewById(R.id.given_name);
        familyName = (TextView) findViewById(R.id.family_name);
        gender = (TextView) findViewById(R.id.gender);
        birthDate = (TextView) findViewById(R.id.birth_date);
        phoneNumber = (TextView) findViewById(R.id.phone_number);
        alriteIdentifier = (TextView) findViewById(R.id.alriteIdentifier);
    }

    @Override
    public void onClick(View view)
    {
        String[] strParams = {homeUrl.getText().toString(), givenName.getText().toString(), familyName.getText().toString(), gender.getText().toString(), birthDate.getText().toString(), phoneNumber.getText().toString(), alriteIdentifier.getText().toString()};
        new AddInBackgroundTask().execute(strParams);
    }
}