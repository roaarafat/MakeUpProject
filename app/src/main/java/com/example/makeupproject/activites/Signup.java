package com.example.makeupproject.activites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.makeupproject.R;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        EditText usernameEditText = findViewById(R.id.user);
        EditText emailEditText = findViewById(R.id.emailtext);
        EditText passwordEditText = findViewById(R.id.password);

        Button createAccountButton = findViewById(R.id.button3);
        Button loginButton = findViewById(R.id.button4);

        createAccountButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if(username.isEmpty() || email.isEmpty() || password.isEmpty()){
                Toast.makeText(Signup.this, "Please Fill All Fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Signup.this, "Account Create Successfully!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Signup.this, Home.class);
                startActivity(i);
                finish();
            }
        });

        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(Signup.this, Login.class);
            startActivity(intent);
            finish();
        });
    }
}
