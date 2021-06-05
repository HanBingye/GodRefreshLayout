package com.bing.godrefreshlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bing.refresh.GodRefreshLayout;

public class MainActivity extends AppCompatActivity {

    private GodRefreshLayout godRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        godRefreshLayout = (GodRefreshLayout) findViewById(R.id.god_refresh_layout);
        godRefreshLayout.setRefreshManger();

    }
}