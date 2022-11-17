package com.android.uraall.carsdbwithroomstartercode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    public Button login;
    public TextView signup;
    public EditText username;
    public EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=findViewById(R.id.button);
        signup= findViewById(R.id.textView5);
        username= findViewById(R.id.editTextTextPersonName);
        password= findViewById(R.id.editTextTextPassword);


        View.OnClickListener l = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(username.getText().toString().equals("ismail") && password.getText().toString().equals("mezhoud") ){
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    Toast.makeText(LoginActivity.this, "Welcome back Ismail", Toast.LENGTH_SHORT).show();
                }
                else      Toast.makeText(LoginActivity.this, "Wrong Parameters", Toast.LENGTH_SHORT).show();

                //action to do


            }
        };
        login.setOnClickListener(l);



        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                Intent i = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(i);

            }
        };
        signup.setOnClickListener(e);


    }
}