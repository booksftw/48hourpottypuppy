package com.example.a48hourpottypuppy;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.d(TAG, "onCreate: LOGIN BUTTON ACTIVITY LOADED");

//        Skip the login process for now and go straight to main dashboard
        loadMainDashboard();
    }

    private void loadMainDashboard() {
        Intent mainDashboardPage = new Intent(getApplicationContext() , ActivityMainDashboard.class);
        startActivity(mainDashboardPage);
    }
}