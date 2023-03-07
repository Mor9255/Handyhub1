package com.example.handyhub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import com.example.handyhub.R.id;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Find the back button view
        Button back_button = findViewById(R.id.back_welcome_main);

        // Set a click listener for the back button
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the activity to go back to the previous activity (Main Activity)
                finish();
            }
        });

        // Find the plumber text view
        TextView plumberText = findViewById(id.plumber1);

        // Set the plumber text view to be clickable
        plumberText.setClickable(true);

        // Set a click listener for the plumber text view
        plumberText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go to the Screen3 activity
                Intent intent = new Intent(Welcome.this, Plumber.class);
                startActivity(intent);
            }
        });

        // Find the button view in your layout
        Button myButton = findViewById(R.id.clickhere);

        // Set up a listener that will be called when the user clicks the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go to the Screen3 activity
                Intent intent = new Intent(Welcome.this, Plumber.class);
                startActivity(intent);
            }
        });
    }
}
