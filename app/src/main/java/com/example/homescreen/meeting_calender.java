package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class meeting_calender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting_calender);
    }

    // calendar components
    LinearLayout header;
    Button btnToday;
    ImageView btnPrev;
    ImageView btnNext;
    TextView txtDateDay;
    TextView txtDisplayDate;
    TextView txtDateYear;
    GridView gridView;

    public meeting_calender() {

    }

    public meeting_calender(Context context, AttributeSet attrs) {
        initControl(context, attrs);
    }

    @SuppressLint("WrongViewCast")
    private void assignUiElements() {
        // layout is inflated, assign local variables to components
        header = findViewById(R.id.calendar_header);
        btnPrev = findViewById(R.id.calendar_prev_button);
        btnNext = findViewById(R.id.calendar_next_button);
        txtDateDay = findViewById(R.id.date_display_day);
        txtDateYear = findViewById(R.id.date_display_year);
        txtDisplayDate = findViewById(R.id.date_display_date);
    }

    /**
     * Load control xml layout
     */
    private void initControl(Context context, AttributeSet attrs)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //inflater.inflate(R.layout.custom_calendar, this);
        assignUiElements();
    }

}
