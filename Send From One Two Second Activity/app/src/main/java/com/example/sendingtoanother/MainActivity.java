package com.example.sendingtoanother;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
EditText e;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e=(EditText) findViewById(R.id.editText);
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=e.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Second_activity.class);
                intent.putExtra("message",str);
                startActivity(intent);
            }
        });
    }
}