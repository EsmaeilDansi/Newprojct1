package com.example.mypc.newprojct1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"messsage",Toast.LENGTH_LONG).show();
        int i=1;
        Toast.makeText(getApplicationContext(),"i="+i,Toast.LENGTH_LONG).show();
    }
}
