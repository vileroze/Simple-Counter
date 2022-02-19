package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroBtn;
    private Button countBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.showCount);
        zeroBtn = (Button) findViewById(R.id.button_zero);
    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if (mCount != 0)
            //zeroBtn.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FA0AED")));
            zeroBtn.setBackgroundColor(Color.parseColor("#FA0AED"));

        if (mCount % 2 == 0)
            view.setBackgroundColor(Color.parseColor("#24E127"));
        else
            view.setBackgroundColor(Color.parseColor("#F1F106"));
    }

    public void isZero(View view){
        mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if (mCount == 0)
            zeroBtn.setBackgroundColor(Color.parseColor("#A69B9B"));
    }
}