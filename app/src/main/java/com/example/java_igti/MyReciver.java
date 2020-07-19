package com.example.java_igti;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReciver extends BroadcastReceiver {
    public static final String TAG = "MyReceiver";
        @Override
        public void onReceive(Context context, Intent intent) {

            if (intent.getAction().equals(Intent.ACTION_BATTERY_LOW)) {
                Toast.makeText(context, "Bateria esta fraca", Toast.LENGTH_SHORT).show();
                Log.d(TAG,"bateria fraca");
            }
        }
    }

