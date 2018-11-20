package com.example.apple.bouns2;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class MyService extends Service{
    static MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }



    static void stop() {
        player.stop();
    }
    static void play() {

        player.start();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        player = MediaPlayer.create(this, R.raw.sound);
        player.start();
    }

    @Override
    public void onCreate() {
        super.onCreate();


    }

}
