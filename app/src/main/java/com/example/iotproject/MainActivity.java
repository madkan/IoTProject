package com.example.iotproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buutoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        buutoo=(Button)findViewById(R.id.butid);

        buutoo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openthemainscreen();
            }
        }
        );

    }

    public void openthemainscreen(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
