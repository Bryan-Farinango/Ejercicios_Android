package com.example.dibujarpixel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);
    }

    class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            Paint pincel1 = new Paint();
            //pincel1.setARGB(255, 0, 0, 0);
            //pincel1.setColor(Color.BLACK);
            canvas.drawPoint(ancho / 2, alto / 2, pincel1);
            //canvas.drawCircle(ancho, alto, 10, pincel1);
            canvas.drawRect(10,70, ancho-10,20,pincel1);
        }
    }
}