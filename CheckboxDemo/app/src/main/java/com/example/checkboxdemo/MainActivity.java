package com.example.checkboxdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.checkboxdemo.R;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkbox;
    private TextView checkboxStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox = findViewById(R.id.checkbox);
        checkboxStatus = findViewById(R.id.checkboxStatus);

        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox.isChecked()) {
                    checkboxStatus.setText("Checkbox is checked");
                } else {
                    checkboxStatus.setText("Checkbox is not checked");
                }
            }
        });
    }
}
