package com.example.lab7module2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    //Creating a static string to use as an id for the order activity
    public static final String MSG = "com.codewithharry.multiscreen.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //The method to handle the order on click event
    public void placeOrder(View view){
// We will handle the click on the button here
//Build an Intent to open another activity
        Intent intent = new Intent(this, OrderActivity.class);
        EditText editText1 = findViewById(R.id.txtItem1);
        EditText editText2 = findViewById(R.id.txtItem2);
        EditText editText3 = findViewById(R.id.txtItem3);
        String message = "Order for " + editText1.getText().toString() + ", "
                + editText2.getText().toString() + " & "
                + editText3.getText().toString() + " has been successfully placed";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }

    public void backButton(View view) {
        finish();
    }
}