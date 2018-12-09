package com.packtpub.canvasdemo;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

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
    }
}
