package com.abdul.delia2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements HeadlinesFragment.onHeadlineClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onHeadlineClick(String headline) {
        NewsFragment newsFragment = (NewsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentNews);
                //new NewsFragment();
        newsFragment.updateTextview(headline);
        Toast.makeText(this, headline+" in actiivty", Toast.LENGTH_SHORT).show();
    }
}