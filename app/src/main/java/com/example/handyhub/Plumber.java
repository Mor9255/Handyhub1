package com.example.handyhub;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Plumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumber);

        // Find the back button view
        Button back_button = findViewById(R.id.back_plumber_welcome);

        // Set a click listener for the back button
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the activity to go back to the previous activity (Screen2)
                finish();
            }
        });

        // Find the name TextViews
        TextView johnTextView = findViewById(R.id.johnsmith);

        // Set click listeners for the name TextViews
        johnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go to Screen4
                Intent intent = new Intent(Plumber.this, John.class);
                startActivity(intent);
            }
        });

        // Find the clickable TextView
        TextView barbaraTextView = findViewById(R.id.barbara);

        // Set a click listener for the TextView
        barbaraTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go to Barbara's activity
                Intent intent = new Intent(Plumber.this, Barbara.class);
                startActivity(intent);
            }
        });
    }
}
