package com.example.gridpopupapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup("Button 1 clicked!");
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup("Button 2 clicked!");
            }
        });

        // Add more buttons as needed
    }

    /**
     * Display a popup message
     *
     * @param message Message to display
     */
    public void showPopup(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
