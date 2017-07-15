package com.example.marcin.projektpodsumowujacy.model;

import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.GeometryFiguresData;

import java.util.List;

/**
 * Created by MARCIN on 2017-04-09.
 */
public final class RectangleCounter implements GeometryFiguresData {

    private double baseData;
    private double heightData;

    public RectangleCounter(final List<String> data) {
        this.setFiguresData(data);
    }

    @Override
    public void setFiguresData(final List<String> data) {
        try {
            this.baseData = Double.parseDouble(data.get(0));
            this.heightData = Double.parseDouble(data.get(1));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public double getFiguresData() {
        return baseData;
    }

    @Override
    public double countFigureArea() {
        return this.baseData * this.heightData;
    }
}
