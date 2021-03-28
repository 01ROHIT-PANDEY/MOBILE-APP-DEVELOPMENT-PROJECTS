package com.example.equationconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    TextView t2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.text);
        e1=findViewById(R.id.edit);
        e2=findViewById(R.id.edit1);

    }

    public void mssg(View view) {
        String s=e1.getText().toString();
        String s1=e2.getText().toString();
        int a=Integer.parseInt(s);
        int b=Integer.parseInt(s1);
        int x=(int)Math.pow(a,2)+(int)Math.pow(b,2)+2*a*b;
        t2.setText("the result is"+x);
    }
}