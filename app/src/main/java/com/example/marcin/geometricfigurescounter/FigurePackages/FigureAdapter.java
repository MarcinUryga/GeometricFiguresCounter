package com.example.marcin.geometricfigurescounter.FigurePackages;


import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.IFiguresCounter;
import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.IGeometryFiguresData;

/**
 * Created by MARCIN on 2017-04-09.
 */
public class FigureAdapter implements IFiguresCounter {

    IGeometryFiguresData geometryFiguresData;

    public FigureAdapter(IGeometryFiguresData geometryFiguresData){
        this.geometryFiguresData = geometryFiguresData;
    }

    @Override
    public String getFigureField() {
        return "= " + geometryFiguresData.countFigureField();
    }
}
