package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        getSupportActionBar().setTitle("Simple Calculator");
    }
    public void addListenerOnButton()
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String value1=e1.getText().toString();
                String value2=e2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();
            }
        });
    }
}