package com.feliscatus909.mypaint;

/*
*@author: Anastasiya Voronyuk
* My GitHub: https://github.com/FelixCatzuz
* Contacts: feliscatus909@gmail.com
 */


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import static com.feliscatus909.mypaint.DrawView.colorList;
import static com.feliscatus909.mypaint.DrawView.current_brush;
import static com.feliscatus909.mypaint.DrawView.pathList;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    public static Path path = new Path();
    public static Paint paint_brush = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redColor(View view) {
        paint_brush.setColor(getResources().getColor(R.color.color_red));
        currentColor(paint_brush.getColor());
    }

    public void blueColor(View view) {
        paint_brush.setColor(getResources().getColor(R.color.color_blue));
        currentColor(paint_brush.getColor());
    }

    public void yellowColor(View view) {
        paint_brush.setColor(getResources().getColor(R.color.color_yellow));
        currentColor(paint_brush.getColor());
    }

    public void greenColor(View view) {
        paint_brush.setColor(getResources().getColor(R.color.color_green));
        currentColor(paint_brush.getColor());
    }

    public void blackColor(View view) {
        paint_brush.setColor(getResources().getColor(R.color.color_black));
        currentColor(paint_brush.getColor());
    }

    public void orangeColor(View view) {
        paint_brush.setColor(getResources().getColor(R.color.color_orange));
        currentColor(paint_brush.getColor());
    }

    public void brush(View view) {
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }

    public void clean(View view) {
        paint_brush.setColor(Color.WHITE);
        currentColor(paint_brush.getColor());
    }

    public void currentColor(int color){
        current_brush = color;
        path = new Path();
    }

    public void save(View view) {

    }

    public void delete_all(View view) {
        pathList.clear();
        colorList.clear();
        path.reset();
    }
}