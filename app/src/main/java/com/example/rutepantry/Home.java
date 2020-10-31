package com.example.rutepantry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button food_pedia;
    Button pantry_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        food_pedia = (Button) findViewById(R.id.foodpediaButton);
        pantry_button = (Button) findViewById(R.id.pantryButton);

        pantry_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                pantry();
            }
        });

        food_pedia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                foodPedia();
            }
        });
    }

    public void foodPedia(){

    }

    public void pantry(){
        Intent intent = new Intent(this, Pantry.class);
        startActivity(intent);
    }
}