package com.example.calenderview;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalenderviewActivity extends AppCompatActivity {
    public static final String TAG = "CalenderViewActivity";
    private android.widget.CalendarView mCalenderview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);

        mCalenderview = findViewById(R.id.calendarView);
        mCalenderview.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(android.widget.CalendarView calendarView, int year, int month, int dayOfMonth) {
                String date =dayOfMonth + "/" + (month + 1)   + "/" + year;
                Log.d(TAG, "onSelectedDayChange:date:dd/mm/yy " + date);

                Intent intent = new Intent(CalenderviewActivity.this, MainActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
    }
}

