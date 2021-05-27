package com.example.importdatabaze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import java.io.IOException;

public class razrab2 extends AppCompatActivity {
Cursor c = null;
    private static final int DATABASE_VERSION = 1;

    private static final String COLUMN_ID = "ID";
    private static final String COLUMN_Name= "Name";
    private static final String COLUMN_Year ="Year";
    private static final String COLUMN_YearInSchool="YearInSchool";
    private static final String COLUMN_History = "History";
    //
    //    private static final int NUM_COLUMN_ID = 0;
    //    private static final int NUM_COLUMN_TEAMHOME = 1;
    //    private static final int NUM_COLUMN_TEAMGUAST = 2;
    //    private static final int NUM_COLUMN_GOALSHOME = 3;
    //    private static final int NUM_COLUMN_GOALSGUEST = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_razrab2);
        ((Button) findViewById(R.id.button3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseHelper myDbHelper = new DatabaseHelper(razrab2.this);
                try {
                    myDbHelper.createDataBase();
                } catch (IOException ioe) {
                    throw new Error("Unable to create database");
                }
                try {
                    myDbHelper.openDataBase();
                } catch (SQLException sqle) {
                    throw sqle;
                }
                Toast.makeText(razrab2.this, "Success", Toast.LENGTH_LONG).show();
                c = myDbHelper.query("Eksponati", null, null, null, null, null, null);
                if (c.moveToFirst()) {
                    do {
                        Toast.makeText(razrab2.this,
                                "ID: " + c.getString(0) + "\n" +
                                        "Name: " + c.getString(1) + "\n" +
                                        "History: " + c.getString(4) + "\n" +
                                        "Photo:  " + c.getString(6),
                                Toast.LENGTH_LONG).show();
                    } while (c.moveToNext());
                }
            }
        });

    }
 ///////////////////////////////////////////
// public long insert(String name, int year, int yearinschool, String history) {
//     ContentValues cv=new ContentValues();
//     cv.put(COLUMN_Name,  name);
//     cv.put(COLUMN_Year,  year);
//     cv.put(COLUMN_YearInSchool, yearinschool);
//     cv.put(COLUMN_History,history);
//     return myDataBase.insert("Eksponati", null, cv);
 //}


}
