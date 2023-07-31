package com.example.vmegrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class biryani extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biryani);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t1.setText("Chicken Biryani");
        t2.setText("Ingredients:\n"+"\n2 cups basmati rice\n" +
                "500 grams chicken, cut into pieces\n" +
                "1 large onion, thinly sliced\n" +
                // Rest of the ingredients...
                "Fried onions and chopped coriander leaves for garnishing");
        t3.setText("Procedure:\n"+"\n1. Rinse the basmati rice under cold water until the water runs clear. Soak the rice in water for 30 minutes and then drain...\n" +
                "2. In a large pot, heat some oil and add whole spices like cinnamon, cardamom, and cloves. Sauté for a minute to release the aroma...\n" +
                "3. Add the sliced onions and cook until they turn golden brown. Then, add ginger-garlic paste and sauté for a minute...\n" +
                // Rest of the instructions...
                "Garnish with fried onions and chopped coriander leaves. Serve hot with raita.\n");

    }
}