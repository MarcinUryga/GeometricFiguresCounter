package com.example.marcin.geometricfigurescounter.FigurePackages.DiamondPackage;

import android.content.Context;
import android.content.Intent;

import com.example.marcin.geometricfigurescounter.FigurePackages.FigureActivity;
import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.AFigureIntent;
import com.example.marcin.projektpodsumowujacy.R;

/**
 * Created by MARCIN on 2017-04-07.
 */
public class DiamondIntent extends AFigureIntent {

    public DiamondIntent(Context context) {
        super(context);
    }

    @Override
    public Intent createFigureIntent() {

        Intent intent = new Intent(this.getFigureContext(), FigureActivity.class);

        intent.putExtra("contentView", R.layout.activity_pole_rombu);
        intent.putExtra("nameAdaptee", "DiamondAdaptee");

        return intent;
    }
}
