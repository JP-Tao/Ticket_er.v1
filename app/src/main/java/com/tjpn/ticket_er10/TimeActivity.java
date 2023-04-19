package com.tjpn.ticket_er10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TimeActivity extends AppCompatActivity {

    private RecyclerView timeRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        timeRecView = findViewById(R.id.timeRecView);

        //ArrayList input
        ArrayList<BusCompany> time = new ArrayList<>();
        time.add(new BusCompany("04:30", 1));
        time.add(new BusCompany("06:00", 2));
        time.add(new BusCompany("07:00", 3));
        time.add(new BusCompany("08:30", 4));
        time.add(new BusCompany("09:00", 5));
        time.add(new BusCompany("10:00", 6));
        time.add(new BusCompany("11:00", 7));
        time.add(new BusCompany("12:30", 8));
        time.add(new BusCompany("13:30", 9));
        time.add(new BusCompany("14:00", 10));


        TimeAdapter adapter = new TimeAdapter(this);
        adapter.setTime(time);
        timeRecView.setAdapter(adapter);
        timeRecView.setLayoutManager(new GridLayoutManager(this, 2));


    }
}