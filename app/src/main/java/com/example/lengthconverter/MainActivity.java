package com.example.lengthconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Spinner spinner2;
    EditText editText;
    Button button;
    TextView text_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        text_result = findViewById(R.id.text_result);

        String[] units_from = {"Meters", "Centimeters", "Miles", "Kilometers", "Inch"};
        ArrayAdapter adapter1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, units_from);
        spinner.setAdapter(adapter1);

        String[] units_to = {"Meters", "Centimeters", "Miles", "Kilometers", "Inch"};
        ArrayAdapter adapter2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, units_to);
        spinner2.setAdapter(adapter2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;
                Double amount = Double.parseDouble(editText.getText().toString());

                if(spinner.getSelectedItem().toString() == "Meters" && spinner2.getSelectedItem().toString() == "Meters")
                {
                    tot = amount;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Meters" && spinner2.getSelectedItem().toString() == "Centimeters")
                {
                    tot = amount * 100;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Meters" && spinner2.getSelectedItem().toString() == "Miles")
                {
                    tot = amount * 0.000621371;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Meters" && spinner2.getSelectedItem().toString() == "Kilometers")
                {
                    tot = amount * 0.001;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Meters" && spinner2.getSelectedItem().toString() == "Inch")
                {
                    tot = amount * 39.3701;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Centimeters" && spinner2.getSelectedItem().toString() == "Meters")
                {
                    tot = amount * 0.01;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Centimeters" && spinner2.getSelectedItem().toString() == "Centimeters")
                {
                    tot = amount;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Centimeters" && spinner2.getSelectedItem().toString() == "Miles")
                {
                    tot = amount * 0.0000062137;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Centimeters" && spinner2.getSelectedItem().toString() == "Kilometers")
                {
                    tot = amount * 0.00001;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Centimeters" && spinner2.getSelectedItem().toString() == "Inch")
                {
                    tot = amount * 0.393701;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Miles" && spinner2.getSelectedItem().toString() == "Miles")
                {
                    tot = amount;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Miles" && spinner2.getSelectedItem().toString() == "Meters")
                {
                    tot = amount * 1609.34;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Miles" && spinner2.getSelectedItem().toString() == "Centimeters")
                {
                    tot = amount * 160934;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Miles" && spinner2.getSelectedItem().toString() == "Kilometers")
                {
                    tot = amount * 1.609;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Miles" && spinner2.getSelectedItem().toString() == "Inch")
                {
                    tot = amount * 63360;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Kilometers" && spinner2.getSelectedItem().toString() == "Inch")
                {
                    tot = amount * 39370.1;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Kilometers" && spinner2.getSelectedItem().toString() == "Kilometers")
                {
                    tot = amount;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Kilometers" && spinner2.getSelectedItem().toString() == "Meters")
                {
                    tot = amount *1000;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Kilometers" && spinner2.getSelectedItem().toString() == "Miles")
                {
                    tot = amount * 0.621371;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Kilometers" && spinner2.getSelectedItem().toString() == "Centimeters")
                {
                    tot = amount * 100000;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Inch" && spinner2.getSelectedItem().toString() == "Inch")
                {
                    tot = amount;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Inch" && spinner2.getSelectedItem().toString() == "Kilometers")
                {
                    tot = amount * Math.pow(2.54, -5);
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Inch" && spinner2.getSelectedItem().toString() == "Meters")
                {
                    tot = amount * 0.0254;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Inches" && spinner2.getSelectedItem().toString() == "Miles")
                {
                    tot = amount * Math.pow(1.58, -5);
                    text_result.setText(String.format("The result is: %.2f", tot));
                }

                else if(spinner.getSelectedItem().toString() == "Inches" && spinner2.getSelectedItem().toString() == "Centimeters")
                {
                    tot = amount * 2.54;
                    text_result.setText(String.format("The result is: %.2f", tot));
                }




            }
        });
    }
}