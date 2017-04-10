package com.example.marcin.geometricfigurescounter.FigurePackages.SquarePackage;

import android.widget.EditText;


import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.IGeometryFiguresData;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by MARCIN on 2017-04-09.
 */
public class SquareAdaptee implements IGeometryFiguresData, Serializable {

    EditText baseData;

    public SquareAdaptee(ArrayList<EditText> data){
        this.setFiguresData(data);
    }

    @Override
    public void setFiguresData(ArrayList<EditText> data) {
        this.baseData = data.get(0);
    }

    @Override
    public EditText getFiguresData() {
        return this.baseData;
    }

    @Override
    public double countFigureField() {
        return Double.parseDouble(baseData.getText().toString()) *
               Double.parseDouble(baseData.getText().toString());
    }


}
