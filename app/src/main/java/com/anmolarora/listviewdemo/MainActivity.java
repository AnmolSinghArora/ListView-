package com.anmolarora.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        final ArrayList<String> myFamily = new ArrayList<String>(); // or ArrayList<String> myFamily = new ArrayList<String>(asList("Anmol","Mom","Sasha","Dad"));
        myFamily.add("Anmol");
        myFamily.add("Mom");
        myFamily.add("Sasha");
        myFamily.add("Dad");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { //onItemClickListener to get this code
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position , long id) {

                Log.i("Person Tapped", myFamily.get(position));
                Toast.makeText(MainActivity.this, "Hello "+ myFamily.get(position), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
