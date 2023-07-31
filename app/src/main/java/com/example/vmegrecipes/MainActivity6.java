package com.example.vmegrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void choco(View v){
        Intent intent=new Intent(MainActivity6.this,choco.class);
        startActivity(intent);
    }
    public void doubleka(View v){
        Intent intent=new Intent(MainActivity6.this,doubleka.class);
        startActivity(intent);
    }
}