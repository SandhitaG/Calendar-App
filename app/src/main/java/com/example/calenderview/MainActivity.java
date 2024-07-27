package com.example.calenderview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";
    private TextView theDate;
    private Button btnGoCalender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theDate = findViewById(R.id.date);
        btnGoCalender = findViewById(R.id.btnGoCalender);

        Intent incomingIntent=getIntent();
        String date=incomingIntent.getStringExtra("date");
        theDate.setText(date);

        btnGoCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,CalenderviewActivity.class);
                startActivity(intent);
            }
        });
    }
}