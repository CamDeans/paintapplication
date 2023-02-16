package com.example.comp208.paintapplication;

import android.graphics.Path;

public class Line {
    // set int value to handle color of crayon, brush and pencil
    public int color;

    // set int value to handle stroke width of crayon, brush and pencil
    public int strokeWidth;

    // set Path of type linePath to handle user path motion on the UI
    public Path linePath;

    // build constructor to handle color, strokeWidth and linePath
    public Line(int color, int strokeWidth, Path linePath) {
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.linePath = linePath;
    }
}
