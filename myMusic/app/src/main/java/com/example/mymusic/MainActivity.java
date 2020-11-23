package com.example.mymusic;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView tAiv1, tBiv1, tCiv1, tDiv1, tEiv1, tFiv1;

    // TODO: Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 6;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private MediaPlayer mAPlayer;
    private MediaPlayer mBPlayer;
    private MediaPlayer mCPlayer;
    private MediaPlayer mDPlayer;
    private MediaPlayer mEPlayer;
    private MediaPlayer mFPlayer;

    MediaPlayer[] list = new MediaPlayer[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       initializeViews();

        // TODO: Create a new MediaPlayer
        createmAPlayer();
        createmBPlayer();
        createmCPlayer();
        createmDPlayer();
        createmEPlayer();
        createmFPlayer();

    }

    private void initializeViews() {
        tAiv1 = findViewById(R.id.tAiv1);
        tBiv1 = findViewById(R.id.tBiv1);
        tCiv1 = findViewById(R.id.tCiv1);
        tDiv1 = findViewById(R.id.tDiv1);
        tEiv1 = findViewById(R.id.tEiv1);
        tFiv1 = findViewById(R.id.tFiv1);
    }

    private void createmFPlayer() {
        mFPlayer = MediaPlayer.create(this,R.raw.track_f);
        list[5] = mFPlayer;
    }

    private void createmEPlayer() {
        mEPlayer = MediaPlayer.create(this,R.raw.track_e);
        list[4] = mEPlayer;
    }

    private void createmDPlayer() {
        mDPlayer = MediaPlayer.create(this,R.raw.track_d);
        list[3] = mDPlayer;
    }

    private void createmCPlayer() {
        mCPlayer = MediaPlayer.create(this,R.raw.track_c);
        list[2] = mCPlayer;
    }

    private void createmBPlayer() {
        mBPlayer = MediaPlayer.create(this,R.raw.track_b);
        list[1] = mBPlayer;
    }

    private void createmAPlayer() {
        mAPlayer = MediaPlayer.create(this,R.raw.track_a);
        list[0] = mAPlayer;
    }

    public void playA(View view) {
        if(mAPlayer.isPlaying()) {
           resetA();
         }
        else {
            isRunning();
            startA();
        }
    }

    private void startA() {
        mAPlayer.start();
        tAiv1.setImageResource(android.R.drawable.ic_media_pause);
    }

    private void resetA() {
        mAPlayer.reset();
        createmAPlayer();
        tAiv1.setImageResource(android.R.drawable.ic_media_play);
    }

    public void playB(View view) {

        if(mBPlayer.isPlaying()){
           resetB();
        }
        else {
            isRunning();
           startB();
        }
    }

    private void startB() {
        mBPlayer.start();
        tBiv1.setImageResource(android.R.drawable.ic_media_pause);
    }

    private void resetB() {
        mBPlayer.reset();
        createmBPlayer();
        tBiv1.setImageResource(android.R.drawable.ic_media_play);
    }

    public void playC(View view) {
        if(mCPlayer.isPlaying()){
            resetC();
        }
        else {
            isRunning();
           startC();
        }
    }

    private void startC() {
        mCPlayer.start();
        tCiv1.setImageResource(android.R.drawable.ic_media_pause);
    }

    private void resetC() {
        mCPlayer.reset();
        createmCPlayer();
        tCiv1.setImageResource(android.R.drawable.ic_media_play);
    }

    public void playD(View view) {
        if(mDPlayer.isPlaying()){
           resetD();
        }
        else {
            isRunning();
           startD();
        }
    }

    private void startD() {
        mDPlayer.start();
        tDiv1.setImageResource(android.R.drawable.ic_media_pause);
    }

    private void resetD() {
        mDPlayer.reset();
        createmDPlayer();
        tDiv1.setImageResource(android.R.drawable.ic_media_play);
    }

    public void playE(View view) {
        if(mEPlayer.isPlaying()){
           resetE();
        }
        else {
            isRunning();
           startE();
        }
    }

    private void startE() {
        mEPlayer.start();
        tEiv1.setImageResource(android.R.drawable.ic_media_pause);
    }

    private void resetE() {
        mEPlayer.reset();
        createmEPlayer();
        tEiv1.setImageResource(android.R.drawable.ic_media_play);
    }

    public void playF(View view) {
        if(mFPlayer.isPlaying()){
           resetF();
        }
        else {
            isRunning();
           startF();
        }
    }

    private void startF() {
        mFPlayer.start();
        tFiv1.setImageResource(android.R.drawable.ic_media_pause);
    }

    private void resetF() {
        mFPlayer.reset();
        createmFPlayer();
        tFiv1.setImageResource(android.R.drawable.ic_media_play);
    }

    private void isRunning() {
        for(int i=0;i<list.length;i++){
            if(list[i].isPlaying()){
                if(list[i]==mAPlayer){
                    resetA();
                    break;
                }
                else if(list[i]==mBPlayer){
                    resetB();
                    break;
                }
                else if(list[i]==mCPlayer){
                    resetC();
                    break;
                }
                else if(list[i]==mDPlayer){
                    resetD();
                    break;
                }
                else if(list[i]==mEPlayer){
                    resetE();
                    break;
                }
                else if(list[i]==mFPlayer){
                    resetF();
                    break;
                }
            }
        }
    }
}