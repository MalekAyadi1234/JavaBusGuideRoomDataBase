package com.android.uraall.carsdbwithroomstartercode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {
    public Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signin=findViewById(R.id.button2);
        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);

            }
        };
        signin.setOnClickListener(e);

    }
}