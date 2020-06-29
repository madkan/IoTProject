package com.example.iotproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button butt, butt2, butt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main2);

        butt=(Button)findViewById(R.id.check);
        butt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openactivitynew1();
            }
        }
        );

        butt2=(Button)findViewById(R.id.predict);
        butt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openactivitynew2();
            }
        }
        );

        butt3=(Button)findViewById(R.id.control);
        butt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openactivitynew3();
            }
        }
        );

    }

    public void openactivitynew1(){
        Intent intent = new Intent(this, MainActivitycheck.class);
        startActivity(intent);
    }
    public void openactivitynew2(){
        Intent intent2 = new Intent(this, MainActivitypredict.class);
        startActivity(intent2);
    }
    public void openactivitynew3(){
        Intent intent3 = new Intent(this, MainActivitycontrol.class);
        startActivity(intent3);
    }

}
