package com.example.vmegrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pannertikka extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pannertikka);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t1.setText("Panner Tikka");
        t2.setText("Ingredients\n"+"\n250 grams paneer (cottage cheese), cut into cubes\n" +
                "1/2 cup yogurt\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "1 tablespoon tandoori masala\n" +
                // Rest of the ingredients...
                "Fresh coriander leaves for garnishing");
        t3.setText("Procedure\n"+"\n1. In a mixing bowl, add yogurt, ginger-garlic paste, tandoori masala, and other spices. Mix well to make the marinade...\n" +
                "2. Add paneer cubes to the marinade and gently coat them. Let the paneer marinate for about 30 minutes...\n" +
                "3. Preheat the grill or oven to medium-high heat. Thread the marinated paneer cubes onto skewers...\n" +
                // Rest of the instructions...
                "Garnish with fresh coriander leaves and serve hot.\n");
    }
}