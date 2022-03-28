package com.example.mp3player;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button playMusic = findViewById(R.id.play);
        Button stopMusic = findViewById(R.id.stop);

        playMusic.setOnClickListener(this);
        stopMusic.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        int id = view.getId();
        if (id == R.id.play) startService(new Intent(this, Mp3Player.class));
        else if (id == R.id.stop) stopService(new Intent(this, Mp3Player.class));
    }
}