package com.example.marcin.simple_figures_counter.ui.figures.circle;

import com.example.marcin.simple_figures_counter.ui.figures.GeometryFiguresData;

/**
 * Created by MARCIN on 2017-04-09.
 */

final class CircleCounter implements GeometryFiguresData {

  public static double countFigureArea(Double radiusData) {
    return Math.PI * radiusData * radiusData;
  }
}
