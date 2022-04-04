package com.example.duckgame;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;

import java.util.Random;
import java.util.logging.Handler;

public class GameView extends View
{
    Bitmap background;
    Rect rect;
    int width, height;
    Bitmap duck[] = new Bitmap[9];
    int duckX, duckY, velocity, duckFrame;
    int duckWidth;
    Random random;
    Handler handler;
    Runnable runnable;
    final long UPDATE_MILLIS = 30;


    public GameView(Context context)
    {
        super(context);
        background = BitmapFactory.decodeResource(getResources(), R.drawable.bg_nova);
        Display display = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
        rect = new Rect(0, 0,width, height);


        duck[0]=BitmapFactory.decodeResource(getResources(), R.drawable.duck0);
        duck[1]=BitmapFactory.decodeResource(getResources(), R.drawable.duck1);
        duck[2]=BitmapFactory.decodeResource(getResources(), R.drawable.duck0);
        duck[3]=BitmapFactory.decodeResource(getResources(), R.drawable.duck1);
        duck[4]=BitmapFactory.decodeResource(getResources(), R.drawable.duck0);
        duck[5]=BitmapFactory.decodeResource(getResources(), R.drawable.duck1);
        duck[6]=BitmapFactory.decodeResource(getResources(), R.drawable.duck0);
        duck[7]=BitmapFactory.decodeResource(getResources(), R.drawable.duck1);
        duck[8]=BitmapFactory.decodeResource(getResources(), R.drawable.duck0);
        duckX = width + 300;
        duckY = 100;
        velocity = 15;
        duckFrame = 0;
        duckWidth = duck [0].getWidth();

    }


    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawBitmap(background, null, rect, null);
        /*canvas.drawBitmap(duck[duckFrame], duck);*/
    }
}
