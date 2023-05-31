package com.example.a48hourpottypuppy;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ActivityMainDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);
        TextView date = findViewById(R.id.activityMainDashboardTimeNow);

        DateTimeFormatter dtf = null;
        DateFormat df = new SimpleDateFormat("hh:mm a");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            dtf = DateTimeFormatter.ofPattern("HH:mm");
        }

        LocalDateTime now = null;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            now = LocalDateTime.now();
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            date.setText(dtf.format(now));

            //Todo update every second
            // rx java library
            // https://stackoverflow.com/questions/40103742/update-textview-every-second-in-android
            date.setText(df.format(new Date()));
//            Log.d(TAG, "onCreate:  " + df.format(new java.util.Date()));
        }


    }
}