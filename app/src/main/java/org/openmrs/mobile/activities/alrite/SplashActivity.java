package org.openmrs.mobile.activities.alrite;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

//import com.ug.air.alrite.BuildConfig;
//import com.ug.air.alrite.Database.DatabaseHelper;
//import com.ug.air.alrite.R;
//import com.ug.air.alrite.Utils.Counter;
//import com.ug.air.alrite.Utils.Credentials;

import java.io.File;

public class SplashActivity extends AppCompatActivity {

    Intent i = null;
    LinearLayout logo;
    File[] contents;
//    DatabaseHelper databaseHelper;
    public static final String APP_OPENING_COUNT = "app_opening_count";
    public static final String LEARN_OPENING_COUNT = "learn_opening_count";
    public static final String RR_COUNTER_COUNT = "rr_counter_count";
    public static final String MANUAL_COUNT = "manual_count";
    public static final String COUNTING_DATA = "counter_file";
    public static final String BRONCHODILATOR_COUNT = "bronchodilator_count";
    public static final String STRIDOR_COUNT = "stridor_count";
    public static final String NASAL_COUNT = "nasal_count";
    public static final String GRANT_COUNT = "grant_count";
    public static final String WHEEZING_COUNT = "wheezing_count";
    public static final String CHESTINDRWAING_COUNT = "chest_indrawing_count";
    public static final String ECZEMA_COUNT = "eczema_count";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

//        setContentView(R.layout.activity_splash);
//        logo = findViewById(R.id.logo);
//
//        databaseHelper = new DatabaseHelper(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        startSplashTimeout(2000);
    }

    private void startSplashTimeout(int timeout){
        AlphaAnimation animation1 = new AlphaAnimation(0.2f, 1.0f);
        animation1.setDuration(1500);
        animation1.setStartOffset(100);
        animation1.setFillAfter(true);
        logo.startAnimation(animation1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                createFileCounter();
            }
        }, timeout);
    }

    private void createFileCounter() {
//        File file = new File("/data/data/" + BuildConfig.APPLICATION_ID + "/shared_prefs/counter_file.xml");
//        if (!file.exists()) {
//            sharedPreferences = getSharedPreferences(COUNTING_DATA, Context.MODE_PRIVATE);
//            editor = sharedPreferences.edit();
//            editor.putString(APP_OPENING_COUNT, "0");
//            editor.putString(LEARN_OPENING_COUNT, "0");
//            editor.putString(RR_COUNTER_COUNT, "0");
//            editor.putString(BRONCHODILATOR_COUNT, "0");
//            editor.putString(STRIDOR_COUNT, "0");
//            editor.putString(NASAL_COUNT, "0");
//            editor.putString(GRANT_COUNT, "0");
//            editor.putString(WHEEZING_COUNT, "0");
//            editor.putString(CHESTINDRWAING_COUNT, "0");
//            editor.putString(ECZEMA_COUNT, "0");
//            editor.putString(MANUAL_COUNT, "0");
//            editor.apply();
//        }
        checkDatabase();
    }

    private void checkDatabase() {
//        File src = new File("/data/data/" + BuildConfig.APPLICATION_ID + "/databases/alrite.db");
//        if (src.exists()){
//
//            Credentials credentials = new Credentials();
//            String username = credentials.creds(this).getUsername();
//            if (!username.equals("None")){
//                Counter counter = new Counter();
//                counter.Count(this, APP_OPENING_COUNT);
//            }
//        }else {
//            databaseHelper.insertData(1, "None", "None", "None", "None", "None", "None");
//        }
//        i = new Intent(SplashActivity.this, Dashboard.class);
        startActivity(i);
        finish();
    }
}