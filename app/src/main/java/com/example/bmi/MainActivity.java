package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//MainActivity is referred to as the controller
//The view is the xml

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method below (used for events that happens in the xml, aka clicking the button)

    public void buttonClicked(View V){
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String weight = weightView.getText().toString();

        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String height = heightView.getText().toString();

        BMIModel model = new BMIModel (weight, height);

        String answer = model.getBMI();

        ((TextView)findViewById(R.id.answer)).setText(answer);

    }


}
