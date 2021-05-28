package com.example.tfedummyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
    }

    public void nextPage2(View v){
        startActivity(new Intent(this, page3.class));
    }

    public void backPage2(View v){
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
    }
}