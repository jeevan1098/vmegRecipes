package com.example.vmegrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class chicken65 extends AppCompatActivity {
 TextView t1,t2,t3;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken65);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t1.setText("Chicken 65");
        t2.setText("Ingredients"+

                "\n500 grams boneless chicken pieces\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "1 tablespoon red chili powder\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1 teaspoon garam masala\n" +
                "2 tablespoons corn flour\n" +
                "2 tablespoons all-purpose flour (maida)\n" +
                "1 tablespoon rice flour\n" +
                "1 tablespoon lemon juice\n" +
                "1 tablespoon yogurt\n" +
                "Salt to taste\n" +
                "Curry leaves\n" +
                "Green chilies, slit\n" +
                "1 tablespoon oil for marination\n" +
                "Oil for deep frying\n" +
                "Additional oil for tempering\n" +
                "Finely chopped coriander leaves (cilantro) for garnishing\n" +
                "Lemon wedges for serving\n");
        t3.setText("Procedure:"+"\n1. In a mixing bowl, add the boneless chicken pieces, ginger-garlic paste, red chili powder, turmeric powder, garam masala, corn flour, all-purpose flour, rice flour, lemon juice, yogurt, and salt. Mix well to coat the chicken pieces with the marinade. Let it marinate for about 30 minutes.\n" +
                "2. Heat oil for deep frying in a pan or kadai. Once the oil is hot, add the marinated chicken pieces in small batches and deep fry until they turn golden brown and crispy. Remove the fried chicken pieces from the oil and drain on a paper towel.\n" +
                "3. In a separate pan, heat some oil for tempering. Add curry leaves and slit green chilies. Stir-fry for a few seconds.\n" +
                "4. Add the fried chicken pieces to the tempering and toss well until they are coated evenly.\n"
                );

    }
}