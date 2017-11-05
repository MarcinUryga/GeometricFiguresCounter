package com.example.marcin.simple_figures_counter.ui.figures;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.model.Figure;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class FiguresFactory {

  public static Figure buildCircle() {
    return new Figure(R.id.circleId, R.string.circle_area, R.drawable.ic_circle);
  }

  public static Figure buildDiamond() {
    return new Figure(R.id.diamondId, R.string.diamond_area, R.drawable.ic_diamond);
  }

  public static Figure buildEquilateralTriangle() {
    return new Figure(R.id.equilateralTriangleId, R.string.equilateral_triangle_area, R.drawable.ic_equilateral_triangle);
  }

  public static Figure buildRectangle() {
    return new Figure(R.id.rectangleID, R.string.rectangle_area, R.drawable.ic_rectangle);
  }

  public static Figure buildRectangularTriangle() {
    return new Figure(R.id.rectangularTriangleId, R.string.triangle_area, R.drawable.ic_triangle);
  }

  public static Figure buildSquare() {
    return new Figure(R.id.squareId, R.string.square_area, R.drawable.ic_square);
  }
}
