package com.example.imagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void newCat(View view){
        ImageView cat1 = (ImageView) findViewById(R.id.catImage);

        cat1.setImageResource(R.drawable.cat2);

        Log.i("Info", "Cat Image Changed");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
