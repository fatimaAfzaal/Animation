package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button4);
        t= (ImageView) findViewById(R.id.imageView);
    }

    public void clickR(View view) {

        Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
        t.startAnimation(anim);
    }

    public void clickB(View view) {
        Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
        t.startAnimation(anim);
    }


    public void clickF(View view) {
        Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade);
        t.startAnimation(anim);
    }

    public void clickM(View view) {
        Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
        t.startAnimation(anim);
    }

    public void clickS(View view) {
        Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide);
        t.startAnimation(anim);
    }

    public void clickZ(View view) {
        Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom);
        t.startAnimation(anim);
    }

    public void ckI(View view) {
        Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomfade);
        t.startAnimation(anim);
    }

    public void clickzr(View view) {
        Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.moverightandleft);
        t.startAnimation(anim);

    }

    public void clicksd(View view) {
        Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide_left);
        t.startAnimation(anim);
    }

    public void clicksa(View view) {
        t.clearAnimation();
    }
}