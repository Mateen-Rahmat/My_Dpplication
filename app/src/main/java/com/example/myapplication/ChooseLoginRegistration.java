package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseLoginRegistration extends AppCompatActivity {

    private Button mlogin, mregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login_registration);

        mlogin = (Button) findViewById(R.id.login);
        mregister = (Button) findViewById(R.id.register);

        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(ChooseLoginRegistration.this, Login.class);
            startActivity(intent);
                finish();
                return;
            }
        });

        mregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseLoginRegistration.this, Registration.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
