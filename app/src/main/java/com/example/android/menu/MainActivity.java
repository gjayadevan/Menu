
package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView tv = (TextView)findViewById(R.id.menu_item_1);
        String str = (String)tv.getText();
        Log.i("Value in menu_item_1",str);

        // Find second menu item TextView and print the text to the logs

        tv = (TextView)findViewById(R.id.menu_item_2);
         str = (String)tv.getText();
        Log.i("Value in menu_item_2",str);
        // Find third menu item TextView and print the text to the logs

        tv = (TextView)findViewById(R.id.menu_item_1);
         str = (String)tv.getText();
        Log.i("Value in menu_item_3",str);

    }
}