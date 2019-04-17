package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.forecastAdapterViewHolder>{

    private String[] mWeatherData;

    public ForecastAdapter(){

    }

    public class forecastAdapterViewHolder extends RecyclerView.ViewHolder{

        public final TextView mWeatherTextView;

        public forecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = itemView.findViewById(R.id.weather_data);;
        }
    }

    @Override
    public forecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(R.layout.forecast_list_item, viewGroup, shouldAttachToParentImmediately);
        return new forecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(forecastAdapterViewHolder holder, int position) {
        String weatherForThisDay = mWeatherData[position];
        holder.mWeatherTextView.setText(weatherForThisDay);
    }

    @Override
    public int getItemCount() {
        if (null == mWeatherData) return 0;
        return mWeatherData.length;
    }

    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }
}
