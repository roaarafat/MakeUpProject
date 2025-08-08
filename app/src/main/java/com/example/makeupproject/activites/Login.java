package com.example.makeupproject.activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.makeupproject.R;

public class Login extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.button);
        EditText password = findViewById(R.id.button2);
        Button loginButton = findViewById(R.id.button3);
        TextView signupText = findViewById(R.id.textLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("roaa") && pass.equals("123456r")) {
                    Toast.makeText(Login.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Login.this, Home.class);
                    startActivity(i);
                } else {
                    Toast.makeText(Login.this, "Wrong username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signupText.setOnClickListener(v -> {
            Intent i=new Intent(Login.this, Signup.class);
            startActivity(i);
        });
    }
}