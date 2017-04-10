package com.example.marcin.geometricfigurescounter.FigurePackages.CirclePackage;

import android.widget.EditText;


import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.IGeometryFiguresData;

import java.util.ArrayList;

/**
 * Created by MARCIN on 2017-04-09.
 */
public class CircleAdaptee implements IGeometryFiguresData {

    EditText radiusData;

    public CircleAdaptee(ArrayList<EditText> dataList){

        this.setFiguresData(dataList);
    }

    @Override
    public void setFiguresData(ArrayList<EditText> data) {
        this.radiusData = data.get(0);
    }

    @Override
    public EditText getFiguresData() {
        return this.radiusData;
    }

    @Override
    public double countFigureField() {
        return
                3.14 * Double.parseDouble(radiusData.getText().toString()) *
                        Double.parseDouble(radiusData.getText().toString());
    }
}
