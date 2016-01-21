package com.kaku.wcv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WeatherChartView chartView = (WeatherChartView) findViewById(R.id.line_char);
        // set day
        chartView.setTempDay(new int[]{14, 15, 16, 17, 9, 9});
        // set night
        chartView.setTempNight(new int[]{7, 5, 9, 10, 3, 2});
        chartView.invalidate();
    }
}