package com.example.iotproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Main3Activitycheck extends AppCompatActivity {

    Button daybu, monthbu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main3_activitycheck);

        daybu=(Button)findViewById(R.id.daybut);
        monthbu=(Button)findViewById(R.id.monthbut);

        daybu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openweekactiv();
            }
        }
        );

        monthbu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openyearactiv();
            }
        }
        );

    }

    public void openweekactiv(){
        Intent intent = new Intent(this, MainActivitycheck.class);
        startActivity(intent);
    }

    public void openyearactiv(){
        Intent intent = new Intent(this, MainActivitycheck2.class);
        startActivity(intent);
    }

}
