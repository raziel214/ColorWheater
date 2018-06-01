package com.example.raziel214.colorweather;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.raziel214.colorweather.Adapters.DailyWeatherAdapter;

import java.util.ArrayList;

public class DailyWheatherActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_wheather);

        Intent intent= getIntent();

       ArrayList<Day> days = intent.getParcelableArrayListExtra(MainActivity.DAYS_ARRAY_LIST);


       DailyWeatherAdapter dailyWeatherAdapter= new DailyWeatherAdapter(days, this);


        setListAdapter(dailyWeatherAdapter);
    }
}
