package com.example.medaivideocalling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MedicineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);
    }

    public void goBack(View view) {
        onBackPressed();

    }

    public void next(View view) {
        startActivity(new Intent(this, TestActivity.class));
    }
}