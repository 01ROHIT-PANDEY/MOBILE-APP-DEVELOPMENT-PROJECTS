package com.example.sharingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {
Button bt;
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle b=getIntent().getExtras();
        String message=b.getString("Message");
        text.setText(message);
        Intent i=new Intent();
        String msg="Intent Called";
        i.putExtra("MESSAGE","msg");
        setResult(2,i);
    }
}