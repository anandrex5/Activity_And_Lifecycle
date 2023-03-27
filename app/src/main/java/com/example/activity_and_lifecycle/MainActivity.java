package com.example.activity_and_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //define the components
    TextView textView;
    Button button1;
    Button button2;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView2);
        button1 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);

        //SetClickListener to the Button1;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //when you click on button counter will increase

                counter = counter +1;
                //and also write the new counter to the TextView
                textView.setText("" + counter);

                //Now when we click on Button2, it should open the second Activity.

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                        startActivity(i);
                    }
                });
            }
        });


        Log.d("Message"," First Activity onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Message", " First Activity onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Message"," First Activity onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Message"," First Activity onPause");
    }
    @Override
    protected void onStop() {

        super.onStop();
        Log.d("Message"," First Activity onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Message"," First Activity onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message"," First Activity onDestroy");
    }
}










