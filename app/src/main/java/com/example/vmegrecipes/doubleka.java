package com.example.vmegrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class doubleka extends AppCompatActivity {
    TextView t1,t2,t3;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doubleka);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t1.setText("Double Ka Meetha");
        t2.setText("1. Remove the crusts from the bread slices and cut them into triangular or rectangular pieces. Set aside...\n" +
                "2. In a pan, heat ghee and fry the bread pieces until they turn golden brown and crispy. Drain excess ghee on a paper towel...\n" +
                "3. In a separate pan, heat milk and add sugar, saffron, and cardamom powder. Stir until the sugar dissolves...\n" +
                // Rest of the instructions...
                "Garnish with sliced almonds and pistachios. Serve warm or chilled.\n");
        t3.setText("Procedure:\n"+"1. Remove the crusts from the bread slices and cut them into triangular or rectangular pieces. Set aside...\n" +
                "2. In a pan, heat ghee and fry the bread pieces until they turn golden brown and crispy. Drain excess ghee on a paper towel...\n" +
                "3. In a separate pan, heat milk and add sugar, saffron, and cardamom powder. Stir until the sugar dissolves...\n" +
                // Rest of the instructions...
                "Garnish with sliced almonds and pistachios. Serve warm or chilled.\n");
    }
}