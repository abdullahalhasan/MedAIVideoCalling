package com.example.medaivideocalling;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final int SPLASH_TIMEOUT = 1500;
    private ImageView logoIV;
    private TextView brandTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        String versionName = "1.5.1";
        brandTV.setText("Version - " + versionName);

        //Log.e(TAG,"CheckingInvoiceID: "+functions.getInvoiceNumber());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), SymptomActivity.class));
                finish();
            }
        }, SPLASH_TIMEOUT);
    }

    private void init() {
        //preferences = getSharedPreferences(Constant.LOGIN_PREFERENCE,MODE_PRIVATE);
        //Initializations
        logoIV = findViewById(R.id.logo);
        brandTV = findViewById(R.id.splashVersionTV);

    }
}