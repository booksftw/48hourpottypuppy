package com.example.a48hourpottypuppy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.buttonLogin);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MAIN ACTIVITY", String.valueOf(view));
                Intent loginPage = new Intent(getApplicationContext() , ActivityLogin2.class);
                startActivity(loginPage);
            }
        });

        Button signupBtn = findViewById(R.id.buttonSignup);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupPage = new Intent(getApplicationContext() , ActivitySignUp.class);
                startActivity(signupPage);
            }
        });
    }
}