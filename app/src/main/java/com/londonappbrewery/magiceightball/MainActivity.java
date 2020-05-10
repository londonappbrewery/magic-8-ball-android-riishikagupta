package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.askButton);
        final ImageView ballImage = findViewById(R.id.ballImage);

        final int[] ballArray = {
                R.drawable.ballone,
                R.drawable.balltwo,
                R.drawable.ballthree,
                R.drawable.ballfour,
                R.drawable.ballfive};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Magic ball","Pressed");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                Log.d("Number","is:"+number);
                ballImage.setImageResource(ballArray[number]);
            }
        });

    }
}
