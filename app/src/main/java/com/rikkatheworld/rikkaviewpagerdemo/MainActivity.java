package com.rikkatheworld.rikkaviewpagerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View ivR, ivB, ivG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivR = findViewById(R.id.iv_red);
        ivB = findViewById(R.id.iv_blue);
        ivG = findViewById(R.id.iv_green);

        RikkaViewPager.RikkaLayoutParams lpR = (RikkaViewPager.RikkaLayoutParams) ivR.getLayoutParams();
        lpR.setFrom(0);
        lpR.setTo(0);
        RikkaViewPager.RikkaLayoutParams lpG = (RikkaViewPager.RikkaLayoutParams) ivG.getLayoutParams();
        lpG.setFrom(1);
        lpG.setTo(1);
        RikkaViewPager.RikkaLayoutParams lpB = (RikkaViewPager.RikkaLayoutParams) ivB.getLayoutParams();
        lpB.setFrom(2);
        lpB.setTo(2);
    }
}
