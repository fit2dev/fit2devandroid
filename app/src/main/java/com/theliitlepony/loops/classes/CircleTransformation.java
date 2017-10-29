package com.theliitlepony.loops.classes;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.squareup.picasso.Transformation;

/**
 * Created by user on 29 ต.ค. 2560.
 */

public class CircleTransformation implements Transformation {

    @Override
    public Bitmap transform(Bitmap source) {
        int size = Math.min(source.getWidth(), source.getHeight());
        int x = (source.getWidth() - size) / 2;
        int y = (source.getHeight() - size) / 2;

        Bitmap squareBitmap = Bitmap.createBitmap(source, x, y, size, size);
        if (squareBitmap != source) {
            source.recycle();
        }

        Bitmap output = Bitmap.createBitmap(size, size, source.getConfig());
        BitmapShader shader = new BitmapShader(squareBitmap, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP);
        Canvas canvas = new Canvas(output);
        Paint paint = new Paint();

        paint.setAntiAlias(true);
        paint.setShader(shader);

        float r = size / 2f;
        canvas.drawCircle(r, r, r, paint);

        squareBitmap.recycle();
        return output;
    }

    @Override
    public String key() {
        return "circle";
    }
}