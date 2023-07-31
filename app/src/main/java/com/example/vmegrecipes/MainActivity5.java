package com.example.vmegrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void butter(View v){
        Intent intent=new Intent(MainActivity5.this,butter.class);
        startActivity(intent);
    }
    public void biryani(View v){
        Intent intent=new Intent(MainActivity5.this,biryani.class);
        startActivity(intent);
    }
}