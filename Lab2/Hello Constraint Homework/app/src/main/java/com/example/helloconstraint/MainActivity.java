package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    //private Button zero_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        //countZero(mShowCount.setBackgroundColor());

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        //countZero(view.setBackgroundColor(Color.DKGRAY));

        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));

        }
        if(mCount%2==0){
            view.setBackgroundColor(Color.GREEN);
        }
        else if(mCount%2!=0){
            view.setBackgroundColor(Color.CYAN);
        }
        view = findViewById(R.id.zero);
        view.setBackgroundColor(Color.MAGENTA);

    }

    public void countZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        view.setBackgroundColor(Color.DKGRAY);
        view = findViewById(R.id.button_count);
        view.setBackgroundColor(Color.GREEN);
        //countUp(findViewById(R.id.button_count).setBackgroundColor(Color.RED));
    }
}