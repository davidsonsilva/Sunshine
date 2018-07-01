package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mDetail_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mDetail_text = (TextView) findViewById(R.id.detail_text);
        Intent startedIntent = getIntent();
        if(startedIntent != null && startedIntent.hasExtra(Intent.EXTRA_TEXT)) {
            mDetail_text.setText(startedIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}