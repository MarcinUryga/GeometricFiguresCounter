package com.example.marcin.simple_figures_counter.ui.figures.equilateral_triangle;

import com.example.marcin.simple_figures_counter.ui.figures.GeometryFiguresData;

/**
 * Created by MARCIN on 2017-04-09.
 */

final class EquilateralTriangleCounter implements GeometryFiguresData {

  public static double countFigureArea(Double baseData) {
    return (baseData * baseData * Math.sqrt(3)) / 4;
  }
}
