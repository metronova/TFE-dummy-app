package com.example.tfedummyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alarmPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_page);
    }

    public void backPageAlarm(View v){
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
    }


}