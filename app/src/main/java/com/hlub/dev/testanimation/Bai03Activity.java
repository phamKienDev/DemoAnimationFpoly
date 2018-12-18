package com.hlub.dev.testanimation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class Bai03Activity extends AppCompatActivity {
    private ImageView imgClock;
    private ImageView imgSecond;
    private ImageView imgMinute;
    private ImageView imgHour;
    Animation animHour, animSecond, animMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai03);

        imgClock = (ImageView) findViewById(R.id.imgClock);
        imgSecond = (ImageView) findViewById(R.id.imgSecond);
        imgMinute = (ImageView) findViewById(R.id.imgMinute);
        imgHour = (ImageView) findViewById(R.id.imgHour);

        animSecond = AnimationUtils.loadAnimation(this, R.anim.anim_bai03_second);
        animMinute = AnimationUtils.loadAnimation(this, R.anim.anim_bai03_minute);

        //set animation
        imgSecond.startAnimation(animSecond);
        imgMinute.startAnimation(animMinute);


    }
}
