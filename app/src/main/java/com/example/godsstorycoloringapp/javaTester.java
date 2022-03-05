package com.example.godsstorycoloringapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.ViewGroup.LayoutParams;

import java.util.LinkedList;
import java.util.Queue;

public class javaTester extends View {
    public LayoutParams params;
    private Path path = new Path();
    private Paint brush = new Paint();
    public Bitmap bit;
    public int page;
    public int color;
    public javaTester(Context context, int page) {
        super(context);
        this.page = page;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;


    }
    public Bitmap getMap(){
        return bit;
    }

//code from https://stackoverflow.com/questions/16968412/how-to-use-flood-fill-algorithm-in-android
    public Bitmap floodFill(Bitmap  image, Point node, int targetColor,
                          int replacementColor) {
        int width = image.getWidth();
        int height = image.getHeight();
        int target = targetColor;
        int replacement = replacementColor;
        if (target != replacement) {
            Queue<Point> queue = new LinkedList<Point>();
            do {
                int x = node.x;
                int y = node.y;
                while (x > 0 && image.getPixel(x - 1, y) == target) {
                    x--;
                }
                boolean spanUp = false;
                boolean spanDown = false;
                while (x < width && image.getPixel(x, y) == target) {
                    image.setPixel(x, y, replacement);
                    if (!spanUp && y > 0 && image.getPixel(x, y - 1) == target) {
                        queue.add(new Point(x, y - 1));
                        spanUp = true;
                    } else if (spanUp && y > 0
                            && image.getPixel(x, y - 1) != target) {
                        spanUp = false;
                    }
                    if (!spanDown && y < height - 1
                            && image.getPixel(x, y + 1) == target) {
                        queue.add(new Point(x, y + 1));
                        spanDown = true;
                    } else if (spanDown && y < height - 1
                            && image.getPixel(x, y + 1) != target) {
                        spanDown = false;
                    }
                    x++;
                }
            } while ((node = queue.poll()) != null);
        }
        return image;
    }

}

