package com.tjpn.ticket_er10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class DashboardActivity extends AppCompatActivity {

    Toolbar toolbar;
    private CardView cardViewRoad, cardViewPlane, cardViewTrain, cardViewEvents, cardViewSports, cardViewTourism;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        //hooks
        MaterialToolbar toolbar = findViewById(R.id.tool_bar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        cardViewRoad = findViewById(R.id.road);
        cardViewSports = findViewById(R.id.sport);
        cardViewEvents = findViewById(R.id.events);
        cardViewPlane = findViewById(R.id.air);
        cardViewTrain = findViewById(R.id.train);
        cardViewTourism = findViewById(R.id.tourism);

        //OnClickListeners

//        toolbar = findViewById(R.id.navigation_view);
//        toolbar.setTitle("");
//        setSupportActionBar(toolbar);
//
//


        cardViewRoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, RoadActivity.class);
                startActivity(intent);
            }
        });

        cardViewPlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Air Selected", Toast.LENGTH_SHORT).show();
            }
        });


        cardViewTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Train Selected", Toast.LENGTH_SHORT).show();
            }
        });


        cardViewSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Sports Selected", Toast.LENGTH_SHORT).show();
            }
        });


        cardViewEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Events Selected", Toast.LENGTH_SHORT).show();
            }
        });

        cardViewTourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Tourism Selected", Toast.LENGTH_SHORT).show();
            }
        });


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(GravityCompat.START);

            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (id) {

                    case R.id.nav_home:
                        Toast.makeText(DashboardActivity.this, "Home is Clicked", Toast.LENGTH_SHORT);

                    case R.id.nav_settings:
                        Toast.makeText(DashboardActivity.this, "Settings is Clicked", Toast.LENGTH_SHORT);


                    case R.id.nav_history:
                        Toast.makeText(DashboardActivity.this, "History is Clicked", Toast.LENGTH_SHORT);

                    case R.id.nav_account:
                        Toast.makeText(DashboardActivity.this, "User Account is Clicked", Toast.LENGTH_SHORT);

                    default:
                        return true;
                }

            }
        });
    }
}