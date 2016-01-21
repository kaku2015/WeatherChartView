package com.kaku.wcv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WeatherChartView mCharView = (WeatherChartView) findViewById(R.id.line_char);
        // set day
        mCharView.setTempDay(new int[]{1, 2, 5, 6, -1, -2});
        // set night
        mCharView.setTempNight(new int[]{-1, -2, 0, -3, -5, -6});
        mCharView.invalidate();
    }
}