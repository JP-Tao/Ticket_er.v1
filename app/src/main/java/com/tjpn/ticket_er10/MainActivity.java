package com.tjpn.ticket_er10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Using handler with postDelayed for introActivity
        h.postDelayed(new Runnable() {

            @Override

            public void run() {

                Intent i = new Intent(MainActivity.this, GetStartedActivity.class);

                startActivity(i);

                // close this activity

                finish();

            }

        }, 2500); // wait for 2.5 seconds


    }
}