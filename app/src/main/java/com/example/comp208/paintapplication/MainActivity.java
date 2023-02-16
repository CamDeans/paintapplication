package com.example.comp208.paintapplication;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    // create new drawing to use values from within the DrawView.java file
    DrawView drawing;

    // set boolean of position to use within DrawView.java
    boolean setPositionNo1 = false;
    boolean setPositionNo2 = false;
    boolean setPositionNo3 = false;
    boolean setPositionNo4 = false;
    boolean setPositionNo5 = false;
    boolean setPositionNo6 = false;
    boolean setPositionNo7 = false;
    boolean setPositionNo8 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // set drawing of type DrawView by id
        drawing = findViewById(R.id.DrawView);

        // create button for clearing the UI
        Button clearButton = (Button) findViewById(R.id.clearBtn);

        // create image buttons to handle crayon, brush and pencil
        ImageButton crayonButton = (ImageButton) findViewById(R.id.crayonBtn);
        ImageButton brushButton = (ImageButton) findViewById(R.id.brushBtn);
        ImageButton pencilButton = (ImageButton) findViewById(R.id.pencilBtn);

        //  set array of type button by id
        Button[] colorButtons = {
                (Button) findViewById(R.id.blackBtn),
                (Button) findViewById(R.id.blueBtn),
                (Button) findViewById(R.id.cyanBtn),
                (Button) findViewById(R.id.greenBtn),
                (Button) findViewById(R.id.magentaBtn),
                (Button) findViewById(R.id.redBtn),
                (Button) findViewById(R.id.whiteBtn),
                (Button) findViewById(R.id.yellowBtn)
        };

        // create on click handlers for clear, and all set requests for crayon, brush and pencil
        View.OnClickListener clear = (view) -> {
            drawing.empty();
        };

        View.OnClickListener setCrayon = (view) -> {
            drawing.setCrayon();
        };

        View.OnClickListener setBrush = (view) -> {
            drawing.setBrush();
        };

        View.OnClickListener setPencil = (view) -> {
            drawing.setPencil();
        };

        // create on click handlers to set the position of color array for each button click
        View.OnClickListener setPosition1 = (view) -> {
            setPositionNo1 = true;
            drawing.setPosition1();
        };

        View.OnClickListener setPosition2 = (view) -> {
            setPositionNo2 = true;
            drawing.setPosition2();
        };

        View.OnClickListener setPosition3 = (view) -> {
            setPositionNo3 = true;
            drawing.setPosition3();
        };

        View.OnClickListener setPosition4 = (view) -> {
            setPositionNo4 = true;
            drawing.setPosition4();
        };

        View.OnClickListener setPosition5 = (view) -> {
            setPositionNo5 = true;
            drawing.setPosition5();
        };

        View.OnClickListener setPosition6 = (view) -> {
            setPositionNo6 = true;
            drawing.setPosition6();
        };

        View.OnClickListener setPosition7 = (view) -> {
            setPositionNo7 = true;
            drawing.setPosition7();
        };

        View.OnClickListener setPosition8 = (view) -> {
            setPositionNo8 = true;
            drawing.setPosition8();
        };

        //  create on touch listener to handle UI screen touch by the user
        OnTouchListener listener = (view, event) -> {
            int action = event.getActionMasked();
            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    drawing.beginPath(event.getX(), event.getY());
                    break;
                case MotionEvent.ACTION_UP:
                    view.performClick();
                    //break;
                case MotionEvent.ACTION_MOVE:
                    drawing.addPointToPath(event.getX(), event.getY());
                    break;
            }
            return true;
        };

        // assign button selection detail to DrawView.java methods ()
        clearButton.setOnClickListener(clear);
        crayonButton.setOnClickListener(setCrayon);
        brushButton.setOnClickListener(setBrush);
        pencilButton.setOnClickListener(setPencil);
        colorButtons[0].setOnClickListener(setPosition1);
        colorButtons[1].setOnClickListener(setPosition2);
        colorButtons[2].setOnClickListener(setPosition3);
        colorButtons[3].setOnClickListener(setPosition4);
        colorButtons[4].setOnClickListener(setPosition5);
        colorButtons[5].setOnClickListener(setPosition6);
        colorButtons[6].setOnClickListener(setPosition7);
        colorButtons[7].setOnClickListener(setPosition8);

        // set on touch listener to type drawing for use within DrawView.java
        drawing.setOnTouchListener(listener);
  }
}