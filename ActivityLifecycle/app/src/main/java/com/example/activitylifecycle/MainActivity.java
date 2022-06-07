package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "This is Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "This is my on create");


    }
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "This my on start");

    }
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "This my on resume");

    }
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "This my on pause");

    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "This my on stop");

    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "This my on Destroy");

    }

}