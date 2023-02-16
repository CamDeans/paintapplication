package com.example.comp208.paintapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import java.util.ArrayList;


public class DrawView extends View {
    // create new mainActivity to use values from within the MainActivity.java file
    MainActivity mainActivity = new MainActivity();

    // create an array list to handle all lines drawn on th UI
    private ArrayList<Line> lines = new ArrayList<>();

    // create new paint to use values from built-in class of type Paint
    Paint paint = new Paint();

    // set int value for the brush width and position colors found within the colorsAraay of type int[]
    int brushWidth = 12;
    int position = 0;

    // initialize array of colors used to set values for crayon, brush and pencil
    int[] colorsArray = {
            Color.LTGRAY,
            Color.BLACK,
            Color.BLUE,
            Color.CYAN,
            Color.GREEN,
            Color.MAGENTA,
            Color.RED,
            Color.WHITE,
            Color.YELLOW
    };

    // set int value for color which will be passed in to assign color value of crayon, brush and pencil
    int color = colorsArray[0];

    public DrawView(Context context, @Nullable AttributeSet attrs) {super(context, attrs);}

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //Storing The Lines in an array
        for (Line lp: lines){
            paint.setStrokeWidth(lp.strokeWidth);
            paint.setColor(lp.color);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawPath(lp.linePath, paint);
        }
    }

    // create beginPath method () to create new path, add values to lines and set x,y coordinates
    Path path = null;
    public void beginPath(float x, float y) {
        path = new Path();
        //Optional if storing strokes/lines
        Line lp = new Line(color,brushWidth, path);
        lines.add(lp);
        path.moveTo(x,y);
        //invalidate();
    }

    // create addPointToPAth method () to iterate through path and return path value for use by line x,y coordinates used on the UI
    public void addPointToPath(float x, float y) {
        if (path == null) return;
        path.lineTo(x, y);
        invalidate();
    }

    // create empty method () to erase/clear UI
    public void empty() {
        lines.clear();
        // lines.remove(1);  <<< This will remove the indexed line stored in the ArrayList
        invalidate();
    }

    // increase and set brush width by pressing the brush button, max value == 24
    public void setBrush() {
        brushWidth *= 2;

        if (brushWidth > 24) {
            brushWidth = 24;
        }
    }

    // decrease and set crayon width by pressing the crayon button, min value = 6
    public void setCrayon() {
        brushWidth /= 2;

        if (brushWidth < 6) {
            brushWidth = 6;
        }
    }

    // decrease and set pencil value by pressing the pencil button, min value = 2
    public void setPencil() {
        brushWidth = (brushWidth /2);

        if (brushWidth < 3) {
            brushWidth = 3;
        }
    }

    // set position of type color
    public void setPosition1() {
        if (mainActivity.setPositionNo1 = true) {
            mainActivity.setPositionNo2 = false;
            mainActivity.setPositionNo3 = false;
            mainActivity.setPositionNo4 = false;
            mainActivity.setPositionNo5 = false;
            mainActivity.setPositionNo6 = false;
            mainActivity.setPositionNo7 = false;
            mainActivity.setPositionNo8 = false;
            position = 1;
        }
        color = colorsArray[position];
    }

    public void setPosition2() {
        if (mainActivity.setPositionNo2 = true) {
            mainActivity.setPositionNo1 = false;
            mainActivity.setPositionNo3 = false;
            mainActivity.setPositionNo4 = false;
            mainActivity.setPositionNo5 = false;
            mainActivity.setPositionNo6 = false;
            mainActivity.setPositionNo7 = false;
            mainActivity.setPositionNo8 = false;
            position = 2;
        }
        color = colorsArray[position];
    }

    public void setPosition3() {
        if (mainActivity.setPositionNo3 = true) {
            mainActivity.setPositionNo1 = false;
            mainActivity.setPositionNo2 = false;
            mainActivity.setPositionNo4 = false;
            mainActivity.setPositionNo5 = false;
            mainActivity.setPositionNo6 = false;
            mainActivity.setPositionNo7 = false;
            mainActivity.setPositionNo8 = false;
            position = 3;
        }
        color = colorsArray[position];
    }

    public void setPosition4() {
        if (mainActivity.setPositionNo4 = true) {
            mainActivity.setPositionNo1 = false;
            mainActivity.setPositionNo2 = false;
            mainActivity.setPositionNo3 = false;
            mainActivity.setPositionNo5 = false;
            mainActivity.setPositionNo6 = false;
            mainActivity.setPositionNo7 = false;
            mainActivity.setPositionNo8 = false;
            position = 4;
        }
        color = colorsArray[position];
    }

    public void setPosition5() {
        if (mainActivity.setPositionNo5 = true) {
            mainActivity.setPositionNo1 = false;
            mainActivity.setPositionNo2 = false;
            mainActivity.setPositionNo3 = false;
            mainActivity.setPositionNo4 = false;
            mainActivity.setPositionNo6 = false;
            mainActivity.setPositionNo7 = false;
            mainActivity.setPositionNo8 = false;
            position = 5;
        }
        color = colorsArray[position];
    }

    public void setPosition6() {
        if (mainActivity.setPositionNo6 = true) {
            mainActivity.setPositionNo1 = false;
            mainActivity.setPositionNo2 = false;
            mainActivity.setPositionNo3 = false;
            mainActivity.setPositionNo4 = false;
            mainActivity.setPositionNo5 = false;
            mainActivity.setPositionNo7 = false;
            mainActivity.setPositionNo8 = false;
            position = 6;
        }
        color = colorsArray[position];
    }

    public void setPosition7() {
        if (mainActivity.setPositionNo7 = true) {
            mainActivity.setPositionNo1 = false;
            mainActivity.setPositionNo2 = false;
            mainActivity.setPositionNo3 = false;
            mainActivity.setPositionNo4 = false;
            mainActivity.setPositionNo5 = false;
            mainActivity.setPositionNo6 = false;
            mainActivity.setPositionNo8 = false;
            position = 7;
        }
        color = colorsArray[position];
    }

    public void setPosition8() {
        if (mainActivity.setPositionNo8 = true) {
            mainActivity.setPositionNo1 = false;
            mainActivity.setPositionNo2 = false;
            mainActivity.setPositionNo3 = false;
            mainActivity.setPositionNo4 = false;
            mainActivity.setPositionNo5 = false;
            mainActivity.setPositionNo6 = false;
            mainActivity.setPositionNo7 = false;
            position = 8;
        }
        color = colorsArray[position];
    }
}
