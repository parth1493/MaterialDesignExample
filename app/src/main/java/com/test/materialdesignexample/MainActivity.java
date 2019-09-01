package com.test.materialdesignexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        // will not support for above api 21
//        getActionBar(toolbar);

        //this will support below and above 21
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Welcome !");
        toolbar.setSubtitle("Folks");


//        toolbar.setLogo(R.drawable.ic_launcher_background);
//        toolbar.setNavigationIcon(R.drawable.ic_launcher_background);
    }
}
