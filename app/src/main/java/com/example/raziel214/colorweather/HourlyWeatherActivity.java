package com.example.raziel214.colorweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.raziel214.colorweather.Adapters.HourlyweatherAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HourlyWeatherActivity extends AppCompatActivity {

    @BindView(R.id.hourlyListView)    ListView hourlyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_weather);
        ButterKnife.bind(this);

        Intent intent= getIntent();



        ArrayList<Hour> hours= intent.getParcelableArrayListExtra(MainActivity.HOUR_ARRAY_LIST);


        HourlyweatherAdapter hourlyweatherAdapter= new HourlyweatherAdapter(this,hours);

        hourlyListView.setAdapter(hourlyweatherAdapter);
    }
}
