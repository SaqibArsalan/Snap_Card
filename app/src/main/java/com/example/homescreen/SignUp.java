package com.example.homescreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import de.hdodenhof.circleimageview.CircleImageView;

public class SignUp extends AppCompatActivity {
    EditText user_email, user_password;
    Button registerButton, loginButton;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        user_email = (EditText) findViewById(R.id.email);
        user_password = (EditText) findViewById(R.id.password);
        registerButton = (Button) findViewById(R.id.register);

        firebaseAuth = FirebaseAuth.getInstance();

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = user_email.getText().toString();
                String password = user_password.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Please fill in the required fields", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Please fill in the required fields", Toast.LENGTH_SHORT).show();
                }

                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
                }

                firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(), "Your Account has been created", Toast.LENGTH_LONG).show();
                                    startActivity(new Intent(getApplicationContext(), SignIn.class));
                                    finish();
                                } else {
                                    Toast.makeText(getApplicationContext(), "E-mail or password is wrong", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

                loginButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), SignIn.class));
                    }
                });

                if (firebaseAuth.getCurrentUser() != null) {
                    startActivity(new Intent(getApplicationContext(), SignIn.class));
                }
            }


        });

    }

    public void male_profile(View view) {
        RadioButton radioButton;
        radioButton = (RadioButton) findViewById(R.id.radioMale);
        CircleImageView circleImageView;
        circleImageView = (CircleImageView) findViewById(R.id.image2);

        if(radioButton.isChecked()) {
           circleImageView.setImageResource(R.drawable.ic_businessman);
       }
    }

    public void women_profile(View view) {
        RadioButton radioButtonFeMale;
        radioButtonFeMale = (RadioButton) findViewById(R.id.radioFemale);
        CircleImageView circleImageView;
        circleImageView = (CircleImageView) findViewById(R.id.image2);

        if(radioButtonFeMale.isChecked()) {
            circleImageView.setImageResource(R.drawable.ic_businesswoman);
        }
    }
}