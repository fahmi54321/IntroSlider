package com.android.a37introslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MyIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance(
                "Coding is Fun",
                "My Name is Fahmi",
                R.drawable.fahmi,
                Color.parseColor("#51e2b7")));
        addSlide(AppIntroFragment.newInstance(
                "Coding is Fun",
                "My Name is Danny",
                R.drawable.danny,
                Color.parseColor("#8c50e3")));
        addSlide(AppIntroFragment.newInstance(
                "Coding is Fun",
                "My Name is Scott",
                R.drawable.scott,
                Color.parseColor("#4fd7ff")));
        addSlide(AppIntroFragment.newInstance(
                "Coding is Fun",
                "My Name is Wu",
                R.drawable.wu,
                Color.parseColor("#00bcd4")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196F3"));

    }

    @Override
    public void onDonePressed() {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        Toast.makeText(this, "On Skip Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlideChanged() {
        Toast.makeText(this, "On Slide Changed", Toast.LENGTH_SHORT).show();
    }
}