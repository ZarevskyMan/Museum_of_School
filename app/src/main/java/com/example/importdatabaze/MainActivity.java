package com.example.importdatabaze;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


    }
    public void OnButtonClick2(View v) {
        Intent i= new Intent(MainActivity.this,razrab.class);
        startActivity(i);}
    public void OnButtonClick1(View v) {
        Intent i= new Intent(MainActivity.this,User.class);
        startActivity(i);}


}



