package com.david.www.task5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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
    }
    //隐式跳转至打电话activity
    public void jump1(View v){
        Intent intent = new Intent("com.example.activitytest1.DIAL_ACTION");
        intent.addCategory("com.example.activitytest1.MY_CATEGORY");
        startActivity(intent);
    }
    //显式secondactivity
    public void jump2(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    //隐式跳转至secondActivity
    public void jump3(View v){
        Intent intent = new Intent("com.example.activitytest.SECOND_ACTION");
        intent.addCategory("com.example.activitytest.MY_CATEGORY");
        startActivity(intent);
    }
    //显式跳转至拨号器
    public void jump4(View v){
        Intent intent = new Intent(this, dialActivity.class);
        startActivity(intent);
    }
    //隐式跳转至拨号器
    public void jump5(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:1001011"));
        startActivity(intent);
    }
    //显式跳转至浏览器
    public void jump6(View v){
        Intent intent = new Intent(this, baiduActivity.class);
        startActivity(intent);
    }
    //隐式跳转至浏览器
    public void jump7(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.baidu.com"));
        startActivity(intent);
    }
}
