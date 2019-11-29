package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.text.TimeZoneFormat;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class addMeeting extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
    private TextView meeting_date,meeting_time;
    private EditText nameOfContact,meeting_title;
    private Button addContact;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meeting);


        databaseReference = FirebaseDatabase.getInstance().getReference("Meeting");

        nameOfContact = (EditText) findViewById(R.id.contactName);
        meeting_title = (EditText) findViewById(R.id.meetingTitle);
        addContact = (Button) findViewById(R.id.addMeeting);

        addContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeMeeting();

            }
        });

         meeting_date = (TextView) findViewById(R.id.meetingDate);
        meeting_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(),"date picker");
            }
        });

         meeting_time = (TextView) findViewById(R.id.meetingTime);
        meeting_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timePicker = new TimePickerFragment();
                timePicker.show(getSupportFragmentManager(),"time picker");
            }
        });


    }
    public void storeMeeting() {

        String contact_name = nameOfContact.getText().toString();
        String date_meeting = meeting_date.getText().toString();
        String time_meeting = meeting_time.getText().toString();
        String title_meeting = meeting_title.getText().toString();


        if(TextUtils.isEmpty(contact_name)){
            Toast.makeText(addMeeting.this,"Please enter the Name",Toast.LENGTH_LONG).show();

        }
        else {

        }


        if(TextUtils.isEmpty(date_meeting)){
            Toast.makeText(addMeeting.this,"Please provide the date",Toast.LENGTH_LONG).show();

        }
        else {

        }


        if(TextUtils.isEmpty(time_meeting)){
            Toast.makeText(addMeeting.this,"Please provide the Time",Toast.LENGTH_LONG).show();

        }
        else {

        }


        if(TextUtils.isEmpty(title_meeting)){
            Toast.makeText(addMeeting.this,"Please enter the title",Toast.LENGTH_LONG).show();

        }
        else {

        }





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

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);

        String currentDateString = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textView = (TextView) findViewById(R.id.meetingDate);
        textView.setText(currentDateString);


    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView meetingTime = (TextView)findViewById(R.id.meetingTime);
        meetingTime.setText("Hour: "+ hourOfDay + " " + "Minute: " + minute);



    }

    public void GoToHomePage(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
