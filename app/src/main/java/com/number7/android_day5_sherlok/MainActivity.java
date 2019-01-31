package com.number7.android_day5_sherlok;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final private int CHOOSE_THIEF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickChoose(View view) {
        Intent questionIntent = new Intent(MainActivity.this, ChooseActivity.class);
        startActivityForResult(questionIntent, CHOOSE_THIEF);
    }

    /*
    *
    *
    * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView textViewAnswer = findViewById(R.id.textViewAnswer);

        if(requestCode == CHOOSE_THIEF){
            if(resultCode == RESULT_OK){
                String thiefnames = data.getStringExtra(ChooseActivity.THIEF);
                textViewAnswer.setText(thiefnames);
            }else{
                textViewAnswer.setText(""); // delete text
            }
        }
    }
}
