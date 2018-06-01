package com.example.raziel214.colorweather.Adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.raziel214.colorweather.Hour;
import com.example.raziel214.colorweather.R;

import java.util.ArrayList;

public class HourlyweatherAdapter extends BaseAdapter {
    HourlyweatherAdapter.ViewHolder viewHolder;
    ArrayList<Hour> hours;
    Context context;

    public HourlyweatherAdapter( Context context,ArrayList<Hour> hours) {
        this.hours = hours;
        this.context = context;
    }

    @Override
    public int getCount() {

        if (hours== null){

            return 0;

        }
        return hours.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        Hour hour= hours.get(position);

        if (convertView==null){


            convertView= LayoutInflater.from(context).inflate(R.layout.hourly_list_item,parent,false);
            viewHolder =new HourlyweatherAdapter.ViewHolder();
            viewHolder.title= convertView.findViewById(R.id.hourlyTitleTextVie);
            viewHolder.description =  convertView.findViewById(R.id.hourlyDescriptionTexView);

            convertView.setTag(viewHolder);





        }
        else{

            viewHolder= (ViewHolder) convertView.getTag();

        }

        viewHolder.description.setText(hour.getWheaterDescription());
        viewHolder.title.setText(hour.getTitle());
        return convertView;
    }

    static class ViewHolder{

        TextView title;
        TextView  description;

    }
}


