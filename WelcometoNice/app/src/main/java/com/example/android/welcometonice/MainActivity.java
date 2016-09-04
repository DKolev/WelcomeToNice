package com.example.android.welcometonice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the ImageView that shows the food category
        ImageView food = (ImageView) findViewById(R.id.food_icon);

        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link FoodActivity}
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                //Start the new activity
                startActivity(foodIntent);

                /**In one of my previous projects, my reviewer had suggested to add finish(); after the activity
                 //is started to avoid the stack of the activities to grow bigger. If I do this here though,
                 //when I hit the back button, my app closes completely. Any hints on this?
                 //finish();
                 **/
            }

        });

        // Find the ImageView that shows the sights category
        ImageView sights = (ImageView) findViewById(R.id.sights_icon);

        // Set a click listener on that View
        sights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link SightsActivity}
                Intent sightsIntent = new Intent(MainActivity.this, SightsActivity.class);

                //Start the new activity
                startActivity(sightsIntent);

            }
        });

        // Find the ImageView that shows the shopping category
        ImageView shopping = (ImageView) findViewById(R.id.shopping_icon);

        // Set a click listener on that View
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                //Start the new activity
                startActivity(shoppingIntent);
            }
        });

        // Find the ImageView that shows the fun category
        ImageView fun = (ImageView) findViewById(R.id.fun_icon);

        // Set a click listener on that View
        fun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link FunActivity}
                Intent funIntent = new Intent(MainActivity.this, FunActivity.class);

                //Start the new activity
                startActivity(funIntent);
            }
        });
    }
}
