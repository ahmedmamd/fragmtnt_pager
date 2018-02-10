package com.example.mashal.fragment_pager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
    adabter adabter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        adabter =new adabter(getSupportFragmentManager());
        viewPager.setAdapter(adabter);
    }
}
