package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void euroToDollar(View view){


        EditText euro = (EditText) findViewById(R.id.euro);
        Double euroInDouble = Double.parseDouble(euro.getText().toString());
        Double resultInDollars = euroInDouble * 1.12 ;
        double resultInDollarsRounded = Math.round(resultInDollars);
        Toast.makeText(MainActivity.this, "$ " + resultInDollarsRounded, Toast.LENGTH_SHORT).show();
        Log.i("Amount", "$" + resultInDollarsRounded);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
