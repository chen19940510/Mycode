package com.example.feucui.edu.myservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/10/20.
 */
public class MainActivity extends Activity implements View.OnClickListener {
    Button OneButton;
    Button TwoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_androud);
        OneButton= (Button) findViewById(R.id.btn_one);
        OneButton.setOnClickListener(this);
        TwoButton= (Button) findViewById(R.id.btn_two);
        TwoButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
   switch (v.getId()){
       case R.id.btn_one:
           Intent intentOne=new Intent(this,ServiceActivity.class);
           startService(intentOne);
           break;
       case R.id.btn_two:
           Intent intentTwo=new Intent(this,ServiceActivity.class);
           stopService(intentTwo);
           default:
           break;
   }
    }
}
