package com.example.marcin.simple_figures_counter.model;

/**
 * Created by MARCIN on 2017-10-07.
 */

public class Figure {

  private final int id;
  private final int imageId;
  private final int textViewId;

  public Figure(int id, int textViewId, int imageId) {
    this.id = id;
    this.textViewId = textViewId;
    this.imageId = imageId;
  }

  public int getId() {
    return id;
  }

  public int getImageId() {
    return imageId;
  }

  public int getTextViewId() {
    return textViewId;
  }
}
