package com.example.vmegrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class butter extends AppCompatActivity {
    TextView t1,t2,t3;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter);
        t1=findViewById(R.id.t5);
        t2=findViewById(R.id.t4);
        t3=findViewById(R.id.t6);
        t1.setText("Butter Chicken");
        t3.setText("Ingredients:\n"+"\n500 grams boneless chicken\n" +
                "1 cup plain yogurt\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "2 tablespoons butter\n" +
                // Rest of the ingredients...
                "Fresh cream for garnishing");
        t2.setText("Procedure:\n"+"\n1. Marinate the boneless chicken pieces in yogurt, ginger-garlic paste, and other spices for about 1 hour...\n" +
                "2. Heat butter in a pan and add the marinated chicken. Cook until the chicken is tender and cooked through...\n" +
                "3. Add tomato puree, cream, and other ingredients. Cook for a few more minutes until the flavors blend together...\n" +
                // Rest of the instructions...
                "Garnish with fresh cream and serve hot with naan or rice.\n");
    }
}