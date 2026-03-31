package com.example.sherlock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ChooseActivity extends AppCompatActivity {
    public final static String THIEF = "com.example.sherlock.THIEF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void onRadioClick(View v) {
        Intent answerIntent = new Intent();

        int id = v.getId();

        if (id == R.id.radioDog) {
            answerIntent.putExtra(THIEF, "Собака");
        } else if (id == R.id.radioCrow) {
            answerIntent.putExtra(THIEF, "Ворона");
        } else if (id == R.id.radioCow) {
            answerIntent.putExtra(THIEF, "Корова");
        }

        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
