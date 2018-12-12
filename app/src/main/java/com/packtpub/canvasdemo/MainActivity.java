package com.packtpub.canvasdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity; // Cannot be used if you want to make app takes full screen
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

// Required imports
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.Display;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.IOException;
import java.util.Random;

public class MainActivity extends Activity implements View.OnTouchListener {

    // Create all the required variables
    Canvas canvas;
    SquashCourtView squashCourtView;
    //Sound
    //initialize sound variables
    private SoundPool soundPool;
    int sample1 = -1;
    int sample2 = -1;
    int sample3 = -1;
    int sample4 = -1;
    //For getting display details like the number of pixels
    Display display;
    Point size;
    int screenWidth;
    int screenHeight;
    //Game objects
    int racketWidth;
    int racketHeight;
    Point racketPosition;
    Point ballPosition;
    int ballWidth;
    //for ball movement
    boolean ballIsMovingLeft;
    boolean ballIsMovingRight;
    boolean ballIsMovingUp;
    boolean ballIsMovingDown;
    //for racket movement
    boolean racketIsMovingLeft;
    boolean racketIsMovingRight;
    //stats
    long lastFrameTime;
    int fps;
    int score;
    int lives;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a reference to our ImageView in the layout
        ImageView ourFrame = (ImageView) findViewById(R.id.imageView);
        //Create a bitmap object to use as our canvas
        Bitmap ourBitmap = Bitmap.createBitmap(300,600, Bitmap.Config.ARGB_8888);
        Canvas ourCanvas = new Canvas(ourBitmap);
        //A paint object that does our drawing, on our canvas
        Paint paint = new Paint();

        //Set the background color
        ourCanvas.drawColor(Color.BLACK);
        //Change the color of the virtual paint brush
        paint.setColor(Color.argb(255, 255, 255, 255));

        //Now draw a load of stuff on our canvas
        ourCanvas.drawText("Score: 42 Lives: 3 Hi: 97", 10, 10, paint);
        ourCanvas.drawLine(10, 50, 200, 50, paint);
        ourCanvas.drawCircle(110, 160, 100, paint);
        ourCanvas.drawPoint(10, 260, paint);

        //Now put the canvas in the frame
        ourFrame.setImageBitmap(ourBitmap);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        //do something with the x and y values
        return false;
    }

    //Inner class SquashCourtView

    // Some Android lifecycle method overrides
}
