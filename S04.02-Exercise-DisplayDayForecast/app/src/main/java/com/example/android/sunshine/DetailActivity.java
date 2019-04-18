package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mTV_displayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mTV_displayText = (TextView) findViewById(R.id.tv_displayText);
        if(getIntent().hasExtra(Intent.EXTRA_TEXT)){
            String textFromIntent = getIntent().getStringExtra(Intent.EXTRA_TEXT);
            mTV_displayText.setText(textFromIntent);
        }
        // TODO (2) Display the weather forecast that was passed from MainActivity
    }
}