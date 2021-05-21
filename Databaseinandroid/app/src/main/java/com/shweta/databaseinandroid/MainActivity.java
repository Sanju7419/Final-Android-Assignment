package com.shweta.databaseinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button next,save;
EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=findViewById(R.id.next);
        save = findViewById(R.id.save);
        editText1=findViewById(R.id.textView5);
        editText2=findViewById(R.id.textView6);
        next.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String email = editText1.getText().toString();
               String pass = editText2.getText().toString();

               SharedPreferences preferences =getSharedPreferences("abhi",MODE_PRIVATE);
              SharedPreferences.Editor editor = preferences.edit();
              editor.putString("email_key",email);
                editor.putString("pass_key",pass);
                Toast.makeText(MainActivity.this, "Data Save SuceessFully", Toast.LENGTH_SHORT).show();
                 editor.commit();

            }
        });
    }
}
