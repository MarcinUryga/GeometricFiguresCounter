package com.example.marcin.geometricfigurescounter.FigurePackages.RectanglePackage;

import android.widget.EditText;


import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.IGeometryFiguresData;

import java.util.ArrayList;

/**
 * Created by MARCIN on 2017-04-09.
 */
public class RectangleAdaptee implements IGeometryFiguresData {

    EditText baseData;
    EditText heightData;


    public RectangleAdaptee(ArrayList<EditText> data){
        this.setFiguresData(data);
    }


    @Override
    public void setFiguresData(ArrayList<EditText> data) {
        this.baseData = data.get(0);
        this.heightData = data.get(1);
    }

    @Override
    public EditText getFiguresData() {
        return baseData;
    }

    @Override
    public double countFigureField() {
        return
                Double.parseDouble(baseData.getText().toString()) *
                Double.parseDouble(heightData.getText().toString());
    }
}
