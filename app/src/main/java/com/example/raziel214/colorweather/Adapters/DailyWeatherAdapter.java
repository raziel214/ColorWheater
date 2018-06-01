package com.example.raziel214.colorweather.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.raziel214.colorweather.DailyWheatherActivity;
import com.example.raziel214.colorweather.Day;
import com.example.raziel214.colorweather.R;

import java.util.ArrayList;


public class DailyWeatherAdapter extends BaseAdapter {

    public static final String TAG= DailyWeatherAdapter.class.getSimpleName();

    ArrayList<Day> days;
    Context context;


    public DailyWeatherAdapter(ArrayList<Day> days, Context context) {
        this.days = days;
        this.context = context;
    }



    @Override
    public int getCount() {

        if (days== null){

            return 0;

        }
        return days.size();
    }

    @Override
    public Object getItem(int position) {
        return days.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;

        if(view==null){

            //Log.d(TAG,"creando las vistas");

            view = LayoutInflater.from(context).inflate(R.layout.daily_list_item,parent,false);
            viewHolder=new ViewHolder();

            viewHolder.dayTitle=(TextView)view.findViewById(R.id.dayliListTitle);
            viewHolder.dayDescription=(TextView)view.findViewById(R.id.dayliListDescription);
            viewHolder.dayProbability=(TextView)view.findViewById(R.id.dayliListProbability);
            view.setTag(viewHolder);

        }
        else{

            viewHolder= (ViewHolder) view.getTag();
        }
        Day day=days.get(position);






        viewHolder.dayTitle.setText(day.getDayname());
        viewHolder.dayDescription.setText(day.getWeatherDescription());
        viewHolder.dayProbability.setText(day.getRainProbability());

        return view;
    }

    static class ViewHolder
    {
        TextView dayTitle;
        TextView dayDescription;
        TextView dayProbability;
    }
}




/*
public class DailyWeatherAdapter extends BaseAdapter {
    ViewHolder viewHolder;
    ArrayList<Day> days;
    Context context;

    public DailyWeatherAdapter(DailyWheatherActivity context, ArrayList<Day>days ) {
        this.days = days;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;*/
/**No lo vamos a utilizar por el momento*//*

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        //Day day=days.get(position);

        if(view==null){
            view = LayoutInflater.from(context).inflate(R.layout.daily_list_item,parent,false);

            viewHolder =new ViewHolder();
            viewHolder.dayTitle=(TextView) view.findViewById(R.id.dayliListTitle);
            viewHolder.dayDescription=(TextView)view.findViewById(R.id.dayliListDescription);
            viewHolder.dayProbability=(TextView)view.findViewById(R.id.dayliListProbability);

            view.setTag(viewHolder);
        }
        else{
            viewHolder= (ViewHolder) view.getTag();
        }

        Day day=days.get(position);


        viewHolder.dayTitle.setText(day.getDayname());
        viewHolder.dayDescription.setText(day.getWeatherDescription());
        viewHolder.dayProbability.setText(day.getRainProbability());

        return view;
    }

    static class ViewHolder{
        TextView dayTitle ;
        TextView dayDescription;
        TextView dayProbability;
    }
}
*/
