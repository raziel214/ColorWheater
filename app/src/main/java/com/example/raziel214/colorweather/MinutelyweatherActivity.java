package com.example.raziel214.colorweather;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.raziel214.colorweather.Adapters.MinutelyWeatherAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MinutelyweatherActivity extends Activity {

    @BindView(R.id.MinutelyRecyclerView) RecyclerView minutelyRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minutelyweather);
        ButterKnife.bind(this);

        Intent intent=getIntent();


        ArrayList <Minute> minutes= intent.getParcelableArrayListExtra(MainActivity.MINUTE_ARRAY_LIST);



        MinutelyWeatherAdapter minutelyWeatherAdapter= new MinutelyWeatherAdapter(this,minutes);
        minutelyRecyclerView.setAdapter(minutelyWeatherAdapter);

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);

        minutelyRecyclerView.setLayoutManager(layoutManager);
        minutelyRecyclerView.setHasFixedSize(true);
    }
}
