package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class addMeeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meeting);

    }

    public void checkForEmail(View view) {
        CheckBox checkBox1, checkBox2;
        checkBox1 = (CheckBox) findViewById(R.id.CheckBoxEmail);
        checkBox2 = (CheckBox) findViewById(R.id.CheckboxContact);

        if (checkBox1.isChecked()) {
            checkBox2.setChecked(false);
        }

    }

    public void checkForContact(View view) {
        CheckBox checkBox1, checkBox2;
        checkBox1 = (CheckBox) findViewById(R.id.CheckBoxEmail);
        checkBox2 = (CheckBox) findViewById(R.id.CheckboxContact);

        if (checkBox2.isChecked()) {
            checkBox1.setChecked(false);
        }
    }

}
