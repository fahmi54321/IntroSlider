package com.android.a37introslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sessions
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
                boolean isfirstStart = sharedPreferences.getBoolean("firstStart",true);
                if (isfirstStart){
                    startActivity(new Intent(MainActivity.this,MyIntro.class));
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("firstStart",false);
                    editor.apply();
                }
            }
        });
        thread.start();
    }
}