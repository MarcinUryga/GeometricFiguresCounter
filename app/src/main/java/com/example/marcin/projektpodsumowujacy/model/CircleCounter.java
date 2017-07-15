package com.example.marcin.projektpodsumowujacy.model;

import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.GeometryFiguresData;

import java.util.List;

/**
 * Created by MARCIN on 2017-04-09.
 */

public final class CircleCounter implements GeometryFiguresData {

    /**
    * comment
     */
    private double radiusData;

    /**
     * @param dataList **
     */
    public CircleCounter(final List<String> dataList) {
        this.setFiguresData(dataList);
    }

    @Override
    public void setFiguresData(final List<String> data) {
        try {
            this.radiusData = Double.parseDouble(data.get(0));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public double getFiguresData() {
        return this.radiusData;
    }

    @Override
    public double countFigureArea() {
        return Math.PI * radiusData * radiusData;
    }
}
