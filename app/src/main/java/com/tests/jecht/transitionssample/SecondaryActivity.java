package com.tests.jecht.transitionssample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondaryActivity extends AppCompatActivity {

    private View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.tests.jecht.transitionssample.R.layout.activity_secondary);

        mView = findViewById(com.tests.jecht.transitionssample.R.id.secondary_view);

    }
}
