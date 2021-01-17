package com.example.mtoinapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText enterMeters;
    private Button convert;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = (EditText)findViewById(R.id.Enter_M);
        convert = (Button)findViewById(R.id.ConvertID);
        result = (TextView)findViewById(R.id.ResultID);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mul = 39.37;
                double res = 0.0;
                double metervalue = Double.parseDouble(enterMeters.getText().toString());
                res = mul*metervalue;
                result.setText(Double.toString(res));
            }
        });

    }
}