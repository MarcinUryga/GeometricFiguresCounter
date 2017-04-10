package com.example.marcin.geometricfigurescounter.FigurePackages.RightAngledTriangle;

import android.content.Context;
import android.content.Intent;

import com.example.marcin.geometricfigurescounter.FigurePackages.FigureActivity;
import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.AFigureIntent;
import com.example.marcin.projektpodsumowujacy.R;

/**
 * Created by MARCIN on 2017-04-07.
 */
public class RightAngledTriangleIntent extends AFigureIntent {

    public RightAngledTriangleIntent(Context context) {
        super(context);
    }

    @Override
    public Intent createFigureIntent() {
        Intent intent = new Intent(this.getFigureContext(), FigureActivity.class);

        intent.putExtra("contentView", R.layout.activity_pole_trojkata_prostokatnego);
        intent.putExtra("nameAdaptee", "RightAngledTriangleAdaptee");

        return intent;
    }

}
