package com.tjpn.ticket_er10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RouteActivity extends AppCompatActivity {

    private RecyclerView routeRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        routeRecView = findViewById(R.id.routeRecView);

        //ArrayList input
        ArrayList<BusCompany> route = new ArrayList<>();
        route.add(new BusCompany("LSK - KTK", "Kitwe", "811Km", "Intercity", "K170"));
        route.add(new BusCompany("LSK - NDL", "Ndola", "690Km", "Intercity", "K150"));
        route.add(new BusCompany("LSK - CHP", "Chipata", "944Km", "Intercity", "K250"));
        route.add(new BusCompany("LSK - LST", "Livingstone", "887Km", "Intercity", "K165"));
        route.add(new BusCompany("LSK - NKD", "Nakonde", "967Km", "Intercity", "K220"));

        RouteAdapter adapter = new RouteAdapter(this);
        adapter.setRoute(route);
        routeRecView.setAdapter(adapter);
        routeRecView.setLayoutManager(new LinearLayoutManager(this));

    }
}