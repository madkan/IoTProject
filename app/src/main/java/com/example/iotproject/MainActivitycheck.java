package com.example.iotproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivitycheck extends AppCompatActivity {

    Button weekbu1, yearbu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main_activitycheck);

        weekbu1=(Button)findViewById(R.id.weekbut1);
        yearbu1=(Button)findViewById(R.id.yearbut1);

        weekbu1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openweekactivityy();
            }
        }
        );

        yearbu1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openyearactivityy();
            }
        }
        );


        private static final String TAG = "UsingThingspeakAPI";
        private static final String THINGSPEAK_CHANNEL_ID = "1076783";
        private static final String THINGSPEAK_API_KEY = "87R3NSFFSAJNGVUI"; //GARBAGE KEY
        private static final String THINGSPEAK_API_KEY_STRING = "4OI0GA81E6DVDWZA";

        private static final String THINGSPEAK_FIELD2 = "equivalent bill";
        private static final String THINGSPEAK_FIELD1 = "kilowatts used";
        private static final String THINGSPEAK_UPDATE_URL = "https://api.thingspeak.com/update?";
        private static final String THINGSPEAK_CHANNEL_URL = "https://api.thingspeak.com/channels/";
        private static final String THINGSPEAK_FEEDS_LAST = "/feeds/last?";


        class FetchThingspeakTask extends AsyncTask<Void, Void, String> {
            protected void onPreExecute() {
                t2.setText("Fetching Data from Server.Please Wait...");
            }
            protected String doInBackground(Void... urls) {
                try {
                    URL url = new URL(THINGSPEAK_CHANNEL_URL + THINGSPEAK_CHANNEL_ID +
                            THINGSPEAK_FEEDS_LAST + THINGSPEAK_API_KEY_STRING + "=" +
                            THINGSPEAK_API_KEY + "");
                    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                        StringBuilder stringBuilder = new StringBuilder();
                        String line;
                        while ((line = bufferedReader.readLine()) != null) {
                            stringBuilder.append(line).append("\n");
                        }
                        bufferedReader.close();
                        return stringBuilder.toString();
                    }
                    finally{
                        urlConnection.disconnect();
                    }
                }
                catch(Exception e) {
                    Log.e("ERROR", e.getMessage(), e);
                    return null;
                }
            }



    }

    public void openweekactivityy(){
        Intent intent = new Intent(this, Main3Activitycheck.class);
        startActivity(intent);
    }

    public void openyearactivityy(){
        Intent intent = new Intent(this, MainActivitycheck2.class);
        startActivity(intent);
    }

}
