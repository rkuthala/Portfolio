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

        Button app1 = (Button)findViewById(R.id.app1);
        Button app2 = (Button)findViewById(R.id.app2);
        Button app3 = (Button)findViewById(R.id.app3);
        Button app4 = (Button)findViewById(R.id.app4);
        Button app5 = (Button)findViewById(R.id.app5);
        Button app6 = (Button)findViewById(R.id.app6);

        app1.setOnClickListener(this);
        app2.setOnClickListener(this);
        app3.setOnClickListener(this);
        app4.setOnClickListener(this);
        app5.setOnClickListener(this);
        app6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String toastMessage = "";

        switch (v.getId()) {
            case R.id.app1:
                toastMessage = "This button will launch Spotify Steamer";
                break;
            case R.id.app2:
                toastMessage = "This button will launch Scores app";
                break;
            case R.id.app3:
                toastMessage = "This button will launch Library app";
                break;
            case R.id.app4:
                toastMessage = "This button will launch Bigger app";
                break;
            case R.id.app5:
                toastMessage = "This button will launch XZY reader";
                break;
            case R.id.app6:
                toastMessage = "This button will launch my Capstone app";
                break;
        }

        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }
}
