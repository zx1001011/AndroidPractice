package com.david.www.task3;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5;
    private EditText editText1;
    private ImageView imageView1;
    private ProgressBar progressBar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById((Integer) R.id.button1);
        button2 = (Button) findViewById((Integer) R.id.button2);
        button3 = (Button) findViewById((Integer) R.id.button3);
        button4 = (Button) findViewById((Integer) R.id.button4);
        button5 = (Button) findViewById((Integer) R.id.button5);
        editText1 = (EditText) findViewById(R.id.edit_text);
        imageView1 = (ImageView) findViewById(R.id.image_view);
        progressBar1 =  (ProgressBar) findViewById(R.id.progress_bar);
        button1.setOnClickListener(new MyOnClickListener());
        button2.setOnClickListener(new MyOnClickListener());
        button3.setOnClickListener(new MyOnClickListener());
        button4.setOnClickListener(new MyOnClickListener());
        button5.setOnClickListener(new MyOnClickListener());
    }
    private class MyOnClickListener implements OnClickListener{
        @Override
        public void onClick(View v){
            switch (v.getId()) {
                case R.id.button1:
                    String inputText = editText1.getText().toString();
                    Toast.makeText(MainActivity.this, inputText,
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:
                    if (progressBar1.getVisibility() == View.GONE) {
                        progressBar1.setVisibility(View.VISIBLE);
                    } else {
                        progressBar1.setVisibility(View.GONE);
                    }
                    break;
                case R.id.button3:
                    imageView1.setImageResource(R.drawable.images);
                    break;
                case R.id.button4:
                    AlertDialog.Builder dialog = new AlertDialog.Builder
                            (MainActivity.this);
                    dialog.setTitle("This is Dialog");
                    dialog.setMessage("Something important.");
                    dialog.setCancelable(false);
                    dialog.setPositiveButton("OK", new DialogInterface.
                            OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dialog.setNegativeButton("Cancel", new DialogInterface.
                            OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dialog.show();
                    break;
                case R.id.button5:
                    ProgressDialog progressDialog = new ProgressDialog
                            (MainActivity.this);
                    progressDialog.setTitle("This is ProgressDialog");
                    progressDialog.setMessage("Loading...");
                    progressDialog.setCancelable(true);
                    progressDialog.show();
                    break;
                default:
                    break;
            }
        }
    }
}
