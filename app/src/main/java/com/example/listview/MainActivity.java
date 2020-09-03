package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.ListView listView1 = (android.widget.ListView) findViewById(R.id.listv);
        String[] sittings = {"Airplane mode","Wifi"," SIM card&Mobile data"," Bluetooth","Other Wireless Connection","Notifications&Status bar","Home screen&lock screen","security"," Battery","App Management","About phone"};
        int xmlFile=R.layout.support_simple_spinner_dropdown_item;
        ArrayAdapter adapter=new ArrayAdapter(this,xmlFile,sittings);
        listView1.setAdapter(adapter);
    }
}