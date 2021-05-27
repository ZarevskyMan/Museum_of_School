package com.example.importdatabaze;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class test {
    private SQLiteDatabase db;
    private Context cont;
    public test(Context context) {
        //Подключение к базе данных
        db = new DatabaseHelper(context).getWritableDatabase();
        cont=context;
    }
    public ArrayList<String> getData()
    {
        alsotest field = alsotest.NAME;
        ArrayList<String> list = new ArrayList<String>();
        Cursor cursor = db.query("Eksponati", null, null, null, null, null, null);
        if ((cursor != null) && (cursor.getCount() > 0)) {
            cursor.moveToFirst();
            do {
                list.add(cursor.getString(field.getFieldCode()));
            } while (cursor.moveToNext());
        }
        return list;
    }
}