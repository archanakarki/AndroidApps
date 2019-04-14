package com.example.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.menu.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {

        //e(String, String) (error)
        // w(String, String) (warning)
        // i(String, String) (information)
        // d(String, String) (debug)
        // v(String, String) (verbose)

        // Find first menu item TextView and print the text to the logs
        TextView menu_item_1 = (TextView) findViewById(R.id.menu_item_1);
        String message1 = (String) menu_item_1.getText();
        Log.e("MainActivity.java", message1);

        // Find second menu item TextView and print the text to the logs
        TextView menu_item_2 = (TextView) findViewById(R.id.menu_item_2);
        String message2 = (String) menu_item_2.getText();
        Log.w("MainActivity.java", message2);

        // Find third menu item TextView and print the text to the logs
        TextView menu_item_3 = (TextView) findViewById(R.id.menu_item_3);
        String message3 = (String) menu_item_3.getText();
        Log.d("MainActivity.java", message3);
    }
}