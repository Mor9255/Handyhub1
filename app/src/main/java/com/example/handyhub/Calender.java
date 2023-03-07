package com.example.handyhub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.app.DatePickerDialog;
import android.content.Intent;

public class Calender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        // Find the TextView view in your layout
        TextView textView = findViewById(R.id.calender);

        // Set up a listener that will be called when the user clicks the TextView
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current date
                final java.util.Calendar calendar = java.util.Calendar.getInstance();
                int year = calendar.get(java.util.Calendar.YEAR);
                int month = calendar.get(java.util.Calendar.MONTH);
                int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);

                // Create a new instance of the DatePickerDialog class
                DatePickerDialog datePickerDialog = new DatePickerDialog(Calender.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        // This code will be called when the user selects a date from the calendar
                        // You can use the selected date to update your UI or perform other actions
                        // For example, you could display the selected date in a TextView
                        TextView textView = findViewById(R.id.calender);
                        textView.setText("Selected date: " + year + "/" + (month + 1) + "/" + dayOfMonth);
                    }
                }, year, month, day);

                // Set the minimum date for the date picker to today's date
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);

                // Show the date picker dialog
                datePickerDialog.show();
            }
        });

        // Find the back button view
        Button backButton = findViewById(R.id.back_calender_john);

        // Set a click listener for the back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go back to Screen4
                Intent intent = new Intent(Calender.this, John.class);
                startActivity(intent);

                // Finish the current activity
                finish();
            }
        });

        // Find the Book_app button view
        Button bookButton = findViewById(R.id.book_app);

        // Set a click listener for the Book_app button
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go to Confirmation activity
                Intent intent = new Intent(Calender.this, Confirmation.class);
                startActivity(intent);
            }
        });
    }
}
