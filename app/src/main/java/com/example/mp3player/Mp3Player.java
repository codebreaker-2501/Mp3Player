package com.example.mp3player;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class Mp3Player extends Service {

    // MediaPlayer variable
    private MediaPlayer mediaPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    //service to be executed on start
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        // create an instance of mediaPlayer for audio playback
        mediaPlayer = MediaPlayer.create(this,R.raw.levitate);
        mediaPlayer.start(); //plays Music
        Toast.makeText(this, "Music starts", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //stops the audio
        mediaPlayer.stop();
        Toast.makeText(this, "Music stops", Toast.LENGTH_SHORT).show();
    }
}