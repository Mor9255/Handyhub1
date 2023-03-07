package com.example.handyhub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class John extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_john);

        // Find the back button view
        Button back_button = findViewById(R.id.back_john_plumber);

        // Set a click listener for the back button
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go back to Screen3
                Intent intent = new Intent(John.this, Plumber.class);
                startActivity(intent);

                // Finish the current activity
                finish();
            }
        });

        // Find the book button view
        Button book_button = findViewById(R.id.book);

        // Set a click listener for the book button
        book_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go to Screen5
                Intent intent = new Intent(John.this, Calender.class);
                startActivity(intent);

                // Finish the current activity
                finish();
            }
        });
    }
}
