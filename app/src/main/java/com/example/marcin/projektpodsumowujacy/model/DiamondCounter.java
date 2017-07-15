package com.example.marcin.projektpodsumowujacy.model;

import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.GeometryFiguresData;

import java.util.List;

/**
 * Created by MARCIN on 2017-04-09.
 */
public final class DiamondCounter implements GeometryFiguresData {

    private double firstDiagonal;
    private double secondDiagonal;

    public DiamondCounter(final List<String> data) {
        this.setFiguresData(data);
    }

    @Override
    public void setFiguresData(final List<String> data) {
        try {
            this.firstDiagonal = Double.parseDouble(data.get(0));
            this.secondDiagonal = Double.parseDouble(data.get(1));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public double getFiguresData() {
        return firstDiagonal;
    }

    @Override
    public double countFigureArea() {
        return this.firstDiagonal * this.secondDiagonal;
    }
}

