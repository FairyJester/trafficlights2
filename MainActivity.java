package com.example.trafficlights2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        public void onClick(View view)
        {
            ConstraintLayout constraintLayout = findViewById(R.id.Light);
            constraintLayout.setBackgroundColor(Color.RED);
        }
        public void onClickYellow(View view)
        {
            ConstraintLayout constraintLayout = findViewById(R.id.Light);
            constraintLayout.setBackgroundColor(Color.YELLOW);
        }
        public void onClickGreen(View view)
        {
            ConstraintLayout constraintLayout = findViewById(R.id.Light);
            constraintLayout.setBackgroundColor(Color.GREEN);
        }
    }
