package com.example.medaivideocalling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void goBack(View view) {
        onBackPressed();

    }

    public void next(View view) {
        startActivity(new Intent(this, SymptomActivity.class));
        finish();
    }
}