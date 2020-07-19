package com.example.java_igti;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MyActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     }



    public void btnSend(View view){
        Log.d(TAG,"to aqui");
        Intent it = new Intent(MainActivity.this, ActivityTela2.class);

       startActivity(it);
    }


    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

    }

    protected void onStart() {
        super.onStart();

        //Log.d(TAG,"onStart()");
    }

    protected void onRestart() {
        super.onRestart();
       // Log.d(TAG,"onRestart");
    }



    protected void onResume() {
        super.onResume();
      //  Log.d(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
       // Log.d(TAG,"onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
      //  Log.d(TAG,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       // Log.d(TAG,"onDestroy()");

    }
}