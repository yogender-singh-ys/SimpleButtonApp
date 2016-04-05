package com.example.yogenders.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button Object and loading layout ref.
        Button BtnSteamer = (Button)findViewById(R.id.btn_streamer);
        Button BtnDuo = (Button)findViewById(R.id.btn_duo);
        Button BtnBuildBigger = (Button)findViewById(R.id.btn_build_bigger);
        Button BtnReader = (Button)findViewById(R.id.btn_reader);
        Button BtnCapstone = (Button)findViewById(R.id.btn_capstone);

        final TextView MainText = (TextView)findViewById(R.id.main_text);

        // Create a toast to display message
        final Context context = getApplicationContext();
        final Toast toast;
        final int duration = Toast.LENGTH_SHORT;


        // button click event handling
        BtnSteamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.toast_text_steamer, duration).show();
            }
        });

        BtnDuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.toast_text_duo, duration).show();
            }
        });

        BtnBuildBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.toast_text_build_bigger, duration).show();
            }
        });

        BtnReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.toast_text_reader, duration).show();
            }
        });

        BtnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.toast_text_capstone, duration).show();
            }
        });
    }
}
