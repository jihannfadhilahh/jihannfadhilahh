package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnpopular, btntrending, btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnpopular = (Button) findViewById(R.id.popular);
        btntrending = (Button) findViewById(R.id.trending);
        btn = (Button) findViewById(R.id.Button);
        btnpopular.setOnClickListener(this);
        btntrending.setOnClickListener(this);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.popular:
                Intent intentPopular = new Intent(MainActivity.this, PopularActivity.class);
                startActivity(intentPopular);
                break;
            case R.id.trending:
                Intent intentTrending = new Intent(MainActivity.this, TrendingActivity.class);
                startActivity(intentTrending);
                break;

        }
    }
}
