package com.example.sherlock;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    static final private int CHOOSE_THIEF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent questionIntent = new Intent(MainActivity.this, ChooseActivity.class);
        startActivityForResult(questionIntent, CHOOSE_THIEF);
    }
    public static final String ACTION_SECOND_ACTIVITY = "com.example.sherlock.ACTION_CHOOSE";
    public void onFilterClick(View view) {
        startActivity(new Intent(ACTION_SECOND_ACTIVITY));
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView infoTextView = findViewById(R.id.textViewInfo);

        if (requestCode == CHOOSE_THIEF) {
            if (resultCode == RESULT_OK) {
                String thiefName = data.getStringExtra(ChooseActivity.THIEF);
                infoTextView.setText(thiefName);
            } else {
                infoTextView.setText("Никого не выбрали");
            }
        }
    }

}