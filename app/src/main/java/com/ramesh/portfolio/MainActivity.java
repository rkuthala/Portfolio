package com.ramesh.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyAppButton = (Button)findViewById(R.id.spotifyAppButton);
        Button scoresAppButton = (Button)findViewById(R.id.scoresAppButton);
        Button libraryAppButton = (Button)findViewById(R.id.libraryAppButton);
        Button biggerAppButton = (Button)findViewById(R.id.biggerAppButton);
        Button xyzReaderAppButton = (Button)findViewById(R.id.xyzReaderAppButton);
        Button capstoneAppButton = (Button)findViewById(R.id.capstoneAppButton);

        spotifyAppButton.setOnClickListener(this);
        scoresAppButton.setOnClickListener(this);
        libraryAppButton.setOnClickListener(this);
        biggerAppButton.setOnClickListener(this);
        xyzReaderAppButton.setOnClickListener(this);
        capstoneAppButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String toastMessage = "";

        switch (v.getId()) {
            case R.id.spotifyAppButton:
                toastMessage = "This button will launch Spotify Steamer";
                break;
            case R.id.scoresAppButton:
                toastMessage = "This button will launch Scores app";
                break;
            case R.id.libraryAppButton:
                toastMessage = "This button will launch Library app";
                break;
            case R.id.biggerAppButton:
                toastMessage = "This button will launch Bigger app";
                break;
            case R.id.xyzReaderAppButton:
                toastMessage = "This button will launch XZY reader";
                break;
            case R.id.capstoneAppButton:
                toastMessage = "This button will launch my Capstone app";
                break;
        }

        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }
}
