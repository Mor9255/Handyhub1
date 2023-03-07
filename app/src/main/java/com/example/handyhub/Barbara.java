package com.example.handyhub;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Barbara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbara);

        // Find the back button view
        Button backButton = findViewById(R.id.back_barbara_plumber);

        // Set a click listener for the back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go back to Plumber activity
                Intent intent = new Intent(Barbara.this, Plumber.class);
                startActivity(intent);

                // Finish the current activity
                finish();
            }
        });

        // Find the book button view
        Button bookButton = findViewById(R.id.book_barbara);

        // Set a click listener for the book button
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go to CalendarBarbara activity
                Intent intent = new Intent(Barbara.this, calenderbarbara.class);
                startActivity(intent);
            }
        });
    }
}
