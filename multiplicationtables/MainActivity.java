package com.example.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private TextView textView1, textView2;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editTextNumber2);
        textView1=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        Toast.makeText(this, "Thanks for using this App !!", Toast.LENGTH_SHORT).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long a=Integer.parseInt(editText.getText().toString());
                String result="";
                for (long i=1;i<=10;i++)
                {
                    result+=a+" "+"*"+" "+i+" "+"="+" "+a*i+"\n";
                    textView2.setText(result);
                }
            }
        });
    }
}