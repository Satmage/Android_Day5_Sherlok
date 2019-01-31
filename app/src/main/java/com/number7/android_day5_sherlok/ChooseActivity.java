package com.number7.android_day5_sherlok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseActivity extends AppCompatActivity {

    public final static String THIEF = "com.number7.android_day5_sherlok";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }


    public void onClickRadioChoose(View view) {
        Intent answerIntent = new Intent();

        switch (view.getId()){
            case R.id.radioButtonDog:
                answerIntent.putExtra(THIEF, "Собакик");
                break;
            case R.id.radioButtonCat:
                answerIntent.putExtra(THIEF,"Котяра");
                break;
            case R.id.radioButtonCrow:
                answerIntent.putExtra(THIEF,"Чеееерный воооорон");
                break;
                default:
                    break;
        }

        setResult(RESULT_OK,answerIntent);
        finish();

    }
}
