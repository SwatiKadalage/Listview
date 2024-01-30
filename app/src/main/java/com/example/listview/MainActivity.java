package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] str={ "Android","Java","PHP","Hadoop","Sap","Python","Ajax","C++","Ruby","Rails"};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,str);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), (CharSequence) list.getItemAtPosition(position),Toast.LENGTH_LONG).show();
            }
        });


    }
}