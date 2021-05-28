package com.example.tfedummyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page4);
    }

    public void backPage4(View v){
        startActivity(new Intent(this, page3.class));
    }

    public void onBackPressed() {
        startActivity(new Intent(this, page3.class));
    }
}