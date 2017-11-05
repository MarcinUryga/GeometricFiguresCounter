package com.example.marcin.simple_figures_counter.ui.figures.diamond;

import com.example.marcin.simple_figures_counter.ui.figures.GeometryFiguresData;

/**
 * Created by MARCIN on 2017-04-09.
 */
final class DiamondCounter implements GeometryFiguresData {

  public static double countFigureArea(Double firstDiagonal, Double secondDiagonal) {
    return firstDiagonal * secondDiagonal;
  }
}

