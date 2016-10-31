package com.example.feucui.edu.myservice;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class ServiceActivity extends Service {
  // private MyBinder mBinder=new MyBinder();
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("av", "onCreate() executed---");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("av", "onStartCommand() executed=----");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("av", "onDestroy() executed---");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
Binder mBinder=new Binder();
public  class MyBinder extends Binder{
    
}
}

