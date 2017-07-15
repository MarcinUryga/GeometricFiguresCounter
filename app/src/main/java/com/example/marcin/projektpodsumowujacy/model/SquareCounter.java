package com.example.marcin.projektpodsumowujacy.model;

import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.GeometryFiguresData;

import java.util.List;

/**
 * Created by MARCIN on 2017-04-09.
 */
public final class SquareCounter implements GeometryFiguresData {

    private double baseData;

    public SquareCounter(final List<String> data) {
        this.setFiguresData(data);
    }

    @Override
    public void setFiguresData(final List<String> data) {
        try {
            this.baseData = Double.parseDouble(data.get(0));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public double getFiguresData() {
        return this.baseData;
    }

    @Override
    public double countFigureArea() {
        return this.baseData * this.baseData;
    }


}
