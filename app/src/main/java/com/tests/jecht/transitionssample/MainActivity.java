package com.tests.jecht.transitionssample;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.tests.jecht.transitionssample.R.layout.activity_main);

        mView = findViewById(com.tests.jecht.transitionssample.R.id.main_view);
    }

    public void openSecondActivity(View view) {
        Intent i = new Intent(this, SecondaryActivity.class);
        Pair<View, String> pair = Pair.create(mView, getString(com.tests.jecht.transitionssample.R.string.transition_name));
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair);
        startActivity(i, options.toBundle());
    }
}
