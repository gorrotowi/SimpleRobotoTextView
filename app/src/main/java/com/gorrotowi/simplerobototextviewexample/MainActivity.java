package com.gorrotowi.simplerobototextviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gorrotowi.simplerobototextview.RobotoTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RobotoTextView robotoTextView = new RobotoTextView(this);
    }
}
