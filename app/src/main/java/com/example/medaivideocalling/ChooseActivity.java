package com.example.medaivideocalling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void patient(View view) {
        startActivity(new Intent(this, PatientActivity.class));
    }

    public void doctor(View view) {
        startActivity(new Intent(this, SymptomActivity.class));
    }
}