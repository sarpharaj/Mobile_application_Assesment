package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE= "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void passageOne(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String passage = this.getResources().getString(R.string.passage_one);
        intent.putExtra(EXTRA_MESSAGE, passage);
        startActivity(intent);
    }

    public void passageTwo(View view) {
        Log.d(LOG_TAG, "Button Two Clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String passage = this.getResources().getString(R.string.passage_two);
        intent.putExtra(EXTRA_MESSAGE, passage);
        startActivity(intent);
    }

    public void passageThree(View view) {
        Log.d(LOG_TAG, "Button Third Clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String passage = this.getResources().getString(R.string.passage_third);
        intent.putExtra(EXTRA_MESSAGE, passage);
        startActivity(intent);
    }
}