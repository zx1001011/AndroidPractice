package com.david.www.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R.id;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        Log.d("NormalActivity", "onCreate");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("NormalActivity", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("NormalActivity", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("NormalActivity", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("NormalActivity", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("NormalActivity", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("NormalActivity", "onStop");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
