package com.example.lab2_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log; //to view logs in the console
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String MY_TAG = "the_custome_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG,"inside onCreate method");
    }

    public void onButtonClick(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.editText2);
        EditText e2 = (EditText)findViewById(R.id.editText3);
        TextView t1 = (TextView)findViewById(R.id.textView3);

        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());

        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(MY_TAG,"inside on start method");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(MY_TAG,"inside onResume method");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(MY_TAG,"inside onPause method");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(MY_TAG,"inside onRestart method");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(MY_TAG,"inside onStop method");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(MY_TAG,"inside onDestroy method");
    }
}
