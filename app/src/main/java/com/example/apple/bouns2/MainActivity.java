package com.example.apple.bouns2;

import android.content.Intent;
import android.media.MediaPlayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this,MyService.class));


    }
    public void Play(View V){
      MyService.player = MediaPlayer.create(this, R.raw.sound);
      MyService.play();

    }
    public void Stop(View V){

        MyService.stop();

    }



}

