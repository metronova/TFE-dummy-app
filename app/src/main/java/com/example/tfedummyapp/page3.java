package com.example.tfedummyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);
    }

    public void nextPage3(View v){
        startActivity(new Intent(this, page4.class));
    }

    public void backPage3(View v){
        startActivity(new Intent(this, page2.class));
    }

    public void onBackPressed() {
        startActivity(new Intent(this, page2.class));
    }
}