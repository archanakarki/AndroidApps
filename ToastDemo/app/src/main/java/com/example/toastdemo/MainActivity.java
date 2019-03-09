package com.example.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void submitName(View view){

        EditText name = (EditText) findViewById(R.id.name);
        Toast.makeText(MainActivity.this, name.getText().toString(), Toast.LENGTH_SHORT).show();
        Log.i("Info", name.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
