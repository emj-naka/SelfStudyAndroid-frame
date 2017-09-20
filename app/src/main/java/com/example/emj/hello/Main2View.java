package com.example.emj.hello;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by emj on 2017/09/19.
 */

public class Main2View extends View {
    public Main2View(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int splitSize_x = 3;
        int splitSize_y = 3;
        int displayMerge = 500;


        // 枠線の表示
        Paint paint = new Paint();
        DisplayMetrics dm = Resources.getSystem().getDisplayMetrics();
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        int base_width = (width) / splitSize_x;
        int base_height = (height - displayMerge) / splitSize_y;

        Log.d("base_width", " -- " + base_width);
        Log.d("base_height", " -- " + base_height);

        for(int i = 1; i < 3; i++) {
            canvas.drawLine(base_width * i, 0, base_width * i, height - displayMerge, paint);
        }

        for(int i = 1; i < 3; i++) {
            canvas.drawLine(0, base_height * i, width, base_height * i, paint);
        }

        canvas.drawLine(0, height - displayMerge, width, height - displayMerge, paint);

        drawSquare(canvas, paint, 0, 0, width, height - displayMerge);
    }


    @Override
    public boolean onTouchEvent (MotionEvent event) {
        Log.d("TouchEvent", "X:" + event.getX() + ",Y:" + event.getY());
        return true;
    }

    protected void drawSquare(Canvas canvas, Paint paint, int start_x, int start_y, int end_x, int end_y) {
//        // 上辺
//        canvas.drawLine(start_x, start_y, end_x, start_y, paint);
//        // 左辺
//        canvas.drawLine(start_x, start_y, start_x, end_y, paint);
//        // 右辺
//        canvas.drawLine(end_x, start_y, end_x, end_y, paint);
//        // 下辺
//        canvas.drawLine(start_x, end_y, start_x, end_y, paint);
    }
}
