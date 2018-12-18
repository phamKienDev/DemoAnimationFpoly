package com.hlub.dev.testanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgHinh;
    Animation animFadeIn, animFadeOut,animRepeat,animZoomIn,animZoomOut,animMove,animRotate,animSildeUp,animSlideDown,animSequential,animTogether;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgHinh = (ImageView) findViewById(R.id.imgHinh);
        animFadeIn= AnimationUtils.loadAnimation(this,R.anim.anim_fadein);
        animFadeOut= AnimationUtils.loadAnimation(this,R.anim.anim_fadeout);
        animRepeat= AnimationUtils.loadAnimation(this,R.anim.anim_repeat);
        animZoomIn= AnimationUtils.loadAnimation(this,R.anim.anim_zoomin);
        animZoomOut= AnimationUtils.loadAnimation(this,R.anim.anim_zoomout);
        animMove= AnimationUtils.loadAnimation(this,R.anim.anim_move);
        animRotate= AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        animSildeUp= AnimationUtils.loadAnimation(this,R.anim.anim_slideup);
        animSlideDown= AnimationUtils.loadAnimation(this,R.anim.anim_slidedown);
        animSequential= AnimationUtils.loadAnimation(this,R.anim.anim_sequential);
        animTogether= AnimationUtils.loadAnimation(this,R.anim.anim_together);

    }

    public void fadeIn(View view) {
        imgHinh.startAnimation(animFadeIn);
    }

    public void fadeOut(View view) {
        imgHinh.startAnimation(animFadeOut);
    }

    public void repeat(View view) {
        imgHinh.startAnimation(animRepeat);
    }

    public void zoomIn(View view) {
        imgHinh.startAnimation(animZoomIn);
    }

    public void zoomOut(View view) {
        imgHinh.startAnimation(animZoomOut);
    }

    public void slideUp(View view) {
        imgHinh.startAnimation(animSildeUp);
    }

    public void slideDow(View view) {
        imgHinh.startAnimation(animSlideDown);
    }

    public void rotate(View view) {
        imgHinh.startAnimation(animRotate);
    }

    public void move(View view) {
        imgHinh.startAnimation(animMove);
    }

    public void sequential(View view) {
        imgHinh.startAnimation(animSequential);
    }

    public void together(View view) {
        imgHinh.startAnimation(animTogether);

    }

    public void bai03Animation(View view) {
        Intent intent=new Intent(MainActivity.this,Bai03Activity.class);
        startActivity(intent);
    }
}
