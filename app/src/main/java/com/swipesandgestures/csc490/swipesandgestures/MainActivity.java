package com.swipesandgestures.csc490.swipesandgestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;


public class MainActivity extends AppCompatActivity implements  GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    private TextView message;
    private GestureDetectorCompat gestureDetectorCompat;
    private RelativeLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.message);
        layout = findViewById(R.id.layout);
        this.gestureDetectorCompat = new GestureDetectorCompat(this,this);
        gestureDetectorCompat.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        message.setText("Single Tap Confirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        message.setText("Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        message.setText("Double Tap Event");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        message.setText("Down Gesture");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        message.setText("Show Press");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        message.setText("Single Tap Up");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        message.setText("Scrolling Scrolling Scrolling");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        message.setText("You've been pressing down for a long time");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        message.setText("FLING");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        this.gestureDetectorCompat.onTouchEvent(e);
        return super.onTouchEvent(e);
    }
}
