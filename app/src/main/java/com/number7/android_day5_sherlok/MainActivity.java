package com.number7.android_day5_sherlok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final int CHOOSE_THIEF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickChoose(View view) {
        Intent questionIntent = new Intent(MainActivity.this, ChooseActivity.class);
        startActivityForResult(questionIntent, CHOOSE_THIEF);
    }
}
