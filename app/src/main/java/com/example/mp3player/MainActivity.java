package com.example.mp3player;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author dhanush n
 * @version 1.0
 */

// Main Class implementing OnclickListener

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning button ID to variables
        Button playMusic = findViewById(R.id.play);
        Button stopMusic = findViewById(R.id.stop);

        playMusic.setOnClickListener(this);
        stopMusic.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        // operation to be performed when the button is clicked

        int id = view.getId();
        //checking whether to stop or start the service
        if (id == R.id.play) startService(new Intent(this, Mp3Player.class));
        else if (id == R.id.stop) stopService(new Intent(this, Mp3Player.class));
    }
}