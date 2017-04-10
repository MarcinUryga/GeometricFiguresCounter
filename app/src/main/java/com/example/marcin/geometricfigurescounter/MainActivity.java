package com.example.marcin.geometricfigurescounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.marcin.geometricfigurescounter.FigurePackages.CirclePackage.CircleIntent;
import com.example.marcin.geometricfigurescounter.FigurePackages.DiamondPackage.DiamondIntent;
import com.example.marcin.geometricfigurescounter.FigurePackages.EquilateralTrianglePackage.EquilateralTriangleIntent;
import com.example.marcin.geometricfigurescounter.FigurePackages.RectanglePackage.RectangleIntent;
import com.example.marcin.geometricfigurescounter.FigurePackages.RightAngledTriangle.RightAngledTriangleIntent;
import com.example.marcin.geometricfigurescounter.FigurePackages.SquarePackage.SquareIntent;
import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.AFigureIntent;
import com.example.marcin.projektpodsumowujacy.R;

public class MainActivity extends Activity {

    AFigureIntent figureIntent;
    Intent i;

    public void SquareIntent(View v){
        figureIntent = new SquareIntent(getApplicationContext());
        startActivity(figureIntent.createFigureIntent());
    }

    public void RectangleIntent(View v){
        figureIntent = new RectangleIntent(getApplicationContext());
        startActivity(figureIntent.createFigureIntent());
    }

    public void CircleIntent(View v){
        figureIntent = new CircleIntent(getApplicationContext());
        startActivity(figureIntent.createFigureIntent());
    }

    public void DiamondIntent(View v){
        figureIntent = new DiamondIntent(getApplicationContext());
        startActivity(figureIntent.createFigureIntent());
    }

    public void EquilateralTriangleIntent(View v){
        figureIntent = new EquilateralTriangleIntent(getApplicationContext());
        startActivity(figureIntent.createFigureIntent());

    }

    public void RightAngledTriangleIntent(View v){
        figureIntent = new RightAngledTriangleIntent(getApplicationContext());
        startActivity(figureIntent.createFigureIntent());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
