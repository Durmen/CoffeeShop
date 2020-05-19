package com.dumren.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button showButton;
    private RadioButton coffeeButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.raDioGroupID);
        showButton = (Button) findViewById(R.id.showButtonID);
        resultTextView = (TextView) findViewById(R.id.resultTextViewID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    int selectedID = radioGroup.getCheckedRadioButtonId();
                    coffeeButton = (RadioButton) findViewById(selectedID);

                    String value = coffeeButton.getText().toString();
                    resultTextView.setText("We are serving your " + value + " within 10 minutes.Thank you Sir/Ma'am.");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please select first",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
