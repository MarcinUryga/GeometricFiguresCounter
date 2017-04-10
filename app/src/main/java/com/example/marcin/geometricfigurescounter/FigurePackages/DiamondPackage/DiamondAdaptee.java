package com.example.marcin.geometricfigurescounter.FigurePackages.DiamondPackage;

import android.widget.EditText;


import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.IGeometryFiguresData;

import java.util.ArrayList;

/**
 * Created by MARCIN on 2017-04-09.
 */
public class DiamondAdaptee implements IGeometryFiguresData {

    EditText firstDiagonal;
    EditText secondDiagonal;


    public DiamondAdaptee(ArrayList<EditText> data){
        this.setFiguresData(data);
    }


    @Override
    public void setFiguresData(ArrayList<EditText> data) {
        this.firstDiagonal = data.get(0);
        this.secondDiagonal = data.get(1);
    }

    @Override
    public EditText getFiguresData() {
        return firstDiagonal;
    }

    @Override
    public double countFigureField() {
        return
                Double.parseDouble(this.firstDiagonal.getText().toString())*
                Double.parseDouble(this.secondDiagonal.getText().toString());
    }
}

