package com.david.www.task4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);
    }
    public void calculate(View v){
        String s1=num1.getText().toString();
        int n1=Integer.parseInt(s1);
        String s2=num2.getText().toString();
        int n2=Integer.parseInt(s2);
        int re=n1+n2;
        result.setText(re+"");
    }
}
