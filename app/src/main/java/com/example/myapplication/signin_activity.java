package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signin_activity extends AppCompatActivity {

    Button dont,done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);




        dont=findViewById(R.id.dont);
        dont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(signin_activity.this,"you are creating to account..",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(signin_activity.this, signupactivity.class);
                startActivity(intent);
            }
        });

        done=findViewById(R.id.register_done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(signin_activity.this,"Congrats..!you have log in.",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(signin_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}