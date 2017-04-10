package com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses;

import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by MARCIN on 2017-04-06.
 */
public interface IGeometryFiguresData {

    void setFiguresData(ArrayList<EditText> data);
    EditText getFiguresData();

    double countFigureField();

}
