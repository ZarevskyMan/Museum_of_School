package com.example.importdatabaze;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class User extends Activity {
    DatabaseHelper mDBConnector;
    Context mContext;
    ListView mListView;
    SimpleCursorAdapter scAdapter;
    Cursor cursor;
      ListAdapter myAdapter;

    int ADD_ACTIVITY = 0;
    int UPDATE_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mContext = this;
       mDBConnector = new DatabaseHelper(this);
       mListView = (ListView) findViewById(R.id.list);
        myAdapter = new myListAdapter(mContext, mDBConnector.selectAll());
     mListView.setAdapter(myAdapter);
      // 1registerForContextMenu(mListView);
     //   final test repository = new test(this.getApplicationContext());
     //   ArrayAdapter.createFromResource(this, , android.R.layout.simple_spinner_item);
     //   adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// Вызываем адаптер
       // spinner.setAdapter(adapter);
       //2 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, repository.getData());
       //2 mListView.setAdapter(adapter);

    }
   /////////////////////////////////////////
   class myListAdapter extends BaseAdapter {
       private LayoutInflater mLayoutInflater;
       private ArrayList<Ekspon> arrayMyMatches;

       public myListAdapter (Context ctx, ArrayList<Ekspon> arr) {
           mLayoutInflater = LayoutInflater.from(ctx);
           setArrayMyData(arr);
       }

       public ArrayList<Ekspon> getArrayMyData() {
           return arrayMyMatches;
       }

       public void setArrayMyData(ArrayList<Ekspon> arrayMyData) {
           this.arrayMyMatches = arrayMyData;
       }

       public int getCount () {
           return arrayMyMatches.size();
       }

       public Object getItem (int position) {

           return position;
       }

       public long getItemId (int position) {
           Ekspon md = arrayMyMatches.get(position);
           if (md != null) {
               return md.getId();
           }
           return 0;
       }

       public View getView(int position, View convertView, ViewGroup parent) {

           if (convertView == null)
               convertView = mLayoutInflater.inflate(R.layout.item, null);

           TextView vTeamHome= (TextView)convertView.findViewById(R.id.Name);
           TextView vTeamGuest = (TextView)convertView.findViewById(R.id.Year);
           TextView vTotal=(TextView)convertView.findViewById(R.id.YearInSchool);


          Ekspon md = arrayMyMatches.get(position);
           vTeamHome.setText(md.getName());
           vTeamGuest.setText(md.getYear());
           vTotal.setText(md.getYearInSchool());//+":"+md.getGoalsguest()

           return convertView;
       }
   } // end myAdapter

}

