package com.shweta.databaseinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tv1 = findViewById(R.id.textView3);
        tv2 = findViewById(R.id.textView4);

    }

    public void load(View view) {
        SharedPreferences preferences = getSharedPreferences("abhi",MODE_PRIVATE);
      String mail=  preferences.getString("email_key","data not Found");
      String pass=  preferences.getString("pass_key","data not Found");
      tv1.setText(mail);
      tv2.setText(pass);

    }
}
