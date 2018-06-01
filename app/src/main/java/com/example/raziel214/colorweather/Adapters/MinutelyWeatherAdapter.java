package com.example.raziel214.colorweather.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raziel214.colorweather.Minute;
import com.example.raziel214.colorweather.R;

import java.util.ArrayList;

public class MinutelyWeatherAdapter extends RecyclerView.Adapter {

    Context  context;
    ArrayList<Minute> minutes;

    public MinutelyWeatherAdapter(Context context, ArrayList<Minute> minutes) {
        this.context = context;
        this.minutes = minutes;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.minutely_list_item,parent,false);

        MinuteViewHolder minuteViewHolder = new MinuteViewHolder(view);


        return minuteViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((MinuteViewHolder)holder).onBidn(position);

    }

    @Override
    public int getItemCount() {

        if (minutes== null){

            return 0;

        }
        return minutes.size();
    }


    class MinuteViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextView;
        TextView rainProbabilityTextView;

        public MinuteViewHolder(View itemView) {
            super(itemView);

            titleTextView= itemView.findViewById(R.id.minutelyTitleTextVie);
            rainProbabilityTextView= itemView.findViewById(R.id.minutelyRainProbabilityTexView);


        }

        public void onBidn(int position){
            Minute minute=minutes.get(position);

            titleTextView.setText(minute.getTitle());
            rainProbabilityTextView.setText(minute.getRainProbability());

        }



    }

}
