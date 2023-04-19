package com.tjpn.ticket_er10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SeatActivity extends AppCompatActivity {

    private RecyclerView seatRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat);

        seatRecView = findViewById(R.id.seatRecView);

        ArrayList<BusCompany> seat = new ArrayList<>();
        seat.add(new BusCompany(1));
        seat.add(new BusCompany(2));
        seat.add(new BusCompany(3));
        seat.add(new BusCompany(4));
        seat.add(new BusCompany(5));
        seat.add(new BusCompany(6));
        seat.add(new BusCompany(7));
        seat.add(new BusCompany(8));
        seat.add(new BusCompany(9));
        seat.add(new BusCompany(10));
        seat.add(new BusCompany(11));
        seat.add(new BusCompany(12));
        seat.add(new BusCompany(13));
        seat.add(new BusCompany(14));
        seat.add(new BusCompany(15));
        seat.add(new BusCompany(16));
        seat.add(new BusCompany(17));
        seat.add(new BusCompany(18));
        seat.add(new BusCompany(19));
        seat.add(new BusCompany(21));
        seat.add(new BusCompany(23));


        SeatAdapter adapter = new SeatAdapter(this);
        adapter.setSeat(seat);
        seatRecView.setAdapter(adapter);
        seatRecView.setLayoutManager(new GridLayoutManager(this, 3));

    }
}