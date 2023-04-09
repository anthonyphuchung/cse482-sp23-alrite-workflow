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

public class SyncActivity extends AppCompatActivity implements View.OnClickListener {

    ListView patients;
    ArrayList<String> list;
    ArrayAdapter adapter;
    TextView homeUrl;
    TextView personId;
    TextView givenName;
    TextView familyName;
    private class UpdateInBackgroundTask extends AsyncTask<String, Integer, Long> {

        // these Strings / or String are / is the parameters of the task, that can be handed over via the excecute(params) method of AsyncTask
        protected Long doInBackground(String... params) {
            String url = params[0];
            String id = params[1];
            String name = params[2];
            String family = params[3];
            long longNum = 0;

            postToDB(url, id, name, family);
            return longNum;
        }

        // this is called whenever you call puhlishProgress(Integer), for example when updating a progressbar when downloading stuff
        protected void onProgressUpdate(Integer... progress) {
        }

        void postToDB(String IP, String person_id, String given_name, String family_name)
        {
            final StringBuilder stringBuilder = new StringBuilder(1);
            stringBuilder.append(IP);
            stringBuilder.append("/openmrs-standalone/updatePatientInfo.jsp");

            HttpURLConnection client = null;
            try {
                SimpleDateFormat SDF = new SimpleDateFormat("M/d/y H:m:s", Locale.US);
                String curTime = SDF.format(new Date());

                final StringBuilder sb = new StringBuilder(1);
                // sb.append(String.format("CustomerID=%s&Latitude=%s&Longitude=%s", edtCustID.getText().toString(), edtLat.getText().toString(), edtLon.getText().toString()));
                sb.append("id=").append(URLEncoder.encode(person_id, "UTF-8"));
                sb.append("&given_name"+person_id+"=").append(URLEncoder.encode(given_name, "UTF-8"));
                sb.append("&family_name"+person_id+"=").append(URLEncoder.encode(family_name, "UTF-8"));
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

    private class FetchInBackgroundTask extends AsyncTask<String, Integer, Long> {

        // these Strings / or String are / is the parameters of the task, that can be handed over via the excecute(params) method of AsyncTask
        protected Long doInBackground(String... params) {
            String url = params[0];
            long longNum = 0;

            readFromDB(url, list);
            return longNum;
        }

        // this is called whenever you call puhlishProgress(Integer), for example when updating a progressbar when downloading stuff
        protected void onProgressUpdate(Integer... progress) {
        }

        void readFromDB(String IP, ArrayList<String> list) {
            final StringBuilder stringBuilder = new StringBuilder(1);
            stringBuilder.append(IP);
            stringBuilder.append("/openmrs-standalone/fetchPatientInfo.jsp");

            HttpURLConnection client = null;
            try {
                SimpleDateFormat SDF = new SimpleDateFormat("M/d/y H:m:s", Locale.US);
                String curTime = SDF.format(new Date());

                final StringBuilder sb = new StringBuilder(1);
                // sb.append(String.format("CustomerID=%s&Latitude=%s&Longitude=%s", edtCustID.getText().toString(), edtLat.getText().toString(), edtLon.getText().toString()));

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
                client.setUseCaches(false);
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
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.length() != 0)
                    {
                        list.add(line);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (client != null) // Make sure the connection is not null.
                    client.disconnect();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sync);
        findViewById(R.id.button).setOnClickListener(this);
        patients = findViewById(R.id.patients);
        homeUrl = (TextView) findViewById(R.id.URL);
        personId = (TextView) findViewById(R.id.person_id);
        givenName = (TextView) findViewById(R.id.given_name);
        familyName = (TextView) findViewById(R.id.family_name);

        list = new ArrayList<String>();

        String[] strParams = {homeUrl.getText().toString()};
        new FetchInBackgroundTask().execute(strParams);

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        patients.setAdapter(adapter);

        patients.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                AsyncTask.execute(new Runnable() {
                    @Override
                    public void run() {
                        String text = item;

                        String id = text.substring(0, text.indexOf(" "));
                        text = text.substring(id.length() + 1, text.length());

                        String firstName = text.substring(0, text.indexOf(" "));
                        text = text.substring(firstName.length() + 1, text.length());

                        String lastName = text;

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                personId.setText(id);
                                givenName.setText(firstName);
                                familyName.setText(lastName);
                            }
                        });
                    }
                });
            }
        });
    }

    @Override
    public void onClick(View view)
    {
        String[] strParams = {homeUrl.getText().toString(), personId.getText().toString(), givenName.getText().toString(), familyName.getText().toString()};
        new UpdateInBackgroundTask().execute(strParams);
        list.clear();
        adapter.clear();
        String[] str2Params = {homeUrl.getText().toString()};
        new FetchInBackgroundTask().execute(str2Params);
    }
}