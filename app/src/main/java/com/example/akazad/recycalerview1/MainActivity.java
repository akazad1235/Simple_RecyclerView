package com.example.akazad.recycalerview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

            ArrayList<String> CityNames=new ArrayList<>(Arrays.asList("Dhaka", "Rajshahi", "Rangpur", "Sylhet", "Khulna", "Barishal", "Chittagong"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView RV= findViewById(R.id.recyclerId);
        RV.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adpt=new MyAdapter(this, CityNames);
        RV.setAdapter(adpt);
    }
}
