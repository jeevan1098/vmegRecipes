package com.example.vmegrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class choco extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choco);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t1.setText("Choco Browni");
        t2.setText("Ingredients:\n"+"\n1 cup all-purpose flour\n" +
                "1/2 cup unsweetened cocoa powder\n" +
                "1 cup granulated sugar\n"+"Vanilla ice cream for serving");
        t3.setText("Procedure:\n"+"\n1. Preheat the oven to 350°F (175°C) and grease a baking dish...\n" +
                "2. In a mixing bowl, combine flour, cocoa powder, sugar, and other dry ingredients. Mix well...\n" +
                "3. Add melted butter, eggs, and vanilla extract. Stir until the batter is smooth and well combined...\n" +
                // Rest of the instructions...
                "Serve warm with a scoop of vanilla ice cream.\n");
    }
}