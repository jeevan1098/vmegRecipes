package com.example.vmegrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void chick(View v){
        Intent intent=new Intent(MainActivity4.this,chicken65.class);
        startActivity(intent);
    }
    public void panner(View v){
        Intent intent=new Intent(MainActivity4.this,pannertikka.class);
        startActivity(intent);
    }
}