package com.example.importdatabaze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class razrab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_razrab);
    }
    public void  OnVvestiClick(View v){
       final String rightString="SamsungHuligans2021";//
     EditText el1 = (EditText)findViewById(R.id.editTextTextPassword);
     if (el1.getText().toString().equals(rightString)){
         Intent i= new Intent(razrab.this,razrab2.class);
         startActivity(i);}else{el1.setText("");}
     }
    }
