package com.example.lab7module2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
//Create an intent
        Intent intent = getIntent();
//Get the message from the Main Activity
        String message = intent.getStringExtra(MainActivity.MSG);
// Set text inside textview to message
        TextView textView = findViewById(R.id.orderText);
        textView.setText(message);
    }
}