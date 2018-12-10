package com.example.task3_4;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new MyOnClickListener());
    }
    class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.button:
                    replaceFragment(new AnotherRightFragment());
                    break;
                default:
                    break;
            }
        }
        private void replaceFragment(Fragment fragment){
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.
                    beginTransaction();
            transaction.replace(R.id.right_layout, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
