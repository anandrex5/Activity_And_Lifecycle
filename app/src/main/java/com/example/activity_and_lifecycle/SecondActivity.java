package com.example.activity_and_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Define the Button3

    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       button3 = findViewById(R.id.button5);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //when we Click on Button3 we go back to the Main Activity

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        Log.d("Message" ," Second Activity onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Message", " Second Activity onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Message"," Second Activity onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Message"," Second Activity onPause");
    }
    @Override
    protected void onStop() {

        super.onStop();
        Log.d("Message"," Second Activity onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Message"," Second Activity onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message"," Second Activity onDestroy");
    }

}