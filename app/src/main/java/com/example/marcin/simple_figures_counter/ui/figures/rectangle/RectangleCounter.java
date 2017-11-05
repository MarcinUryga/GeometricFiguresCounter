package com.example.marcin.simple_figures_counter.ui.figures.rectangle;

import com.example.marcin.simple_figures_counter.ui.figures.GeometryFiguresData;

/**
 * Created by MARCIN on 2017-04-09.
 */
final class RectangleCounter implements GeometryFiguresData {

  public static double countFigureArea(Double baseData, Double heightData) {
    return baseData * heightData;
  }
}
