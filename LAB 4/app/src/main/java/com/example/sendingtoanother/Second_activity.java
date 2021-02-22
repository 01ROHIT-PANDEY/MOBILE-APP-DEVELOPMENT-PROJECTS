package com.example.sendingtoanother;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Second_activity extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        getSupportActionBar().setTitle("Second_Activity");
        t=(TextView)findViewById(R.id.textView2);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message");
        t.setText(str);
    }
}