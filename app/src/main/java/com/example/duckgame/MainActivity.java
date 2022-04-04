package com.example.duckgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sound = MediaPlayer.create(MainActivity.this, R.raw.QuackSoundEffect);
    }

    public void startGame(View view)
    {
        Intent intent = new Intent(this, startGame.class);
        startActivity(intent);
        finish();

    }

    public void audioOn(View view) {
        sound.start();
    }

    public void audioOff(View view) {
        sound.stop();
    }
}
