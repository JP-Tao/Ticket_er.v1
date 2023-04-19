package com.tjpn.ticket_er10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RoadActivity extends AppCompatActivity {

    private RecyclerView busCompRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road);

        busCompRecView = findViewById(R.id.busComp);

        ArrayList<BusCompany> name = new ArrayList<>();
        name.add(new BusCompany("Power Tools"));
        name.add(new BusCompany("Euro"));
        name.add(new BusCompany("Likili"));
        name.add(new BusCompany("Shalom"));
        name.add(new BusCompany("UBZ"));
        name.add(new BusCompany("Jordan"));
        name.add(new BusCompany("FM"));
        name.add(new BusCompany("Wada Chovu"));

        BusAdapter adapter = new BusAdapter(this);
        adapter.setBusCompany(name);
        busCompRecView.setAdapter(adapter);
        busCompRecView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}