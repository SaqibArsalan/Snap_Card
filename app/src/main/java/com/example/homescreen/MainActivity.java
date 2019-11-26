package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Up();
            }
        });

        signInButton = (Button) findViewById(R.id.button3);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_in();
            }
        });





    }
    public void sign_Up() {
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
    }
    public void sign_in() {
        Intent intent = new Intent(this,SignIn.class);
        startActivity(intent);
    }
}

