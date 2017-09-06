package com.franck.listeviewcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private HashMap items = new HashMap<Integer,String>();
    private ListView lstView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstView = (ListView) findViewById(R.id.listView);

        for(int i=0 ; i<5 ;i++){
            items.put(i,"Item Number " + i);
        }
    }
}
