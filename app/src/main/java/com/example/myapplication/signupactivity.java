package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signupactivity extends AppCompatActivity {

    Button register_done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);

        register_done=findViewById(R.id.register_done);
        register_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signupactivity.this,"You Registered Sucessfully..!!",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(signupactivity.this, signin_activity.class);
                startActivity(intent);
            }
        });
    }
}