package com.example.networkingapis; // Ensure this package name is correct

// ... (other imports) ...

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button fetchDataButton; // Variable declaration

    // ... (other declarations) ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This line MUST match the ID in your activity_main.xml
        // If your XML button ID is @+id/fetchButton, then it must be R.id.fetchButton
        fetchDataButton = findViewById(R.id.fetchButton); // <<<--- THIS IS THE CRITICAL LINE

        // ... (rest of your onCreate method) ...

        // This is where the crash occurs if fetchDataButton is null
        fetchDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchPosts();
            }

            private void fetchPosts() {

            }
        });
    }

    // ... (rest of your MainActivity code) ...
}
