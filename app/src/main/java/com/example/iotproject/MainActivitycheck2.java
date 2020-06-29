package com.example.iotproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivitycheck2 extends AppCompatActivity {

    Button daybutton,weekbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main_activitycheck2);

        daybutton=(Button)findViewById(R.id.dayybuton);
        weekbutton=(Button)findViewById(R.id.weekbuton);

        daybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                functionnum1();
            }
        }
        );

        weekbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                functionnum2();
            }
        }
        );

    }

    public void functionnum1(){
        Intent intent = new Intent(this, MainActivitycheck.class);
        startActivity(intent);
    }

    public void functionnum2(){
        Intent intent = new Intent(this, Main3Activitycheck.class);
        startActivity(intent);
    }

}
