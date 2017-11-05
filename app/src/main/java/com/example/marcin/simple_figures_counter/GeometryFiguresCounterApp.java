package com.example.marcin.simple_figures_counter;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by MARCIN on 2017-11-04.
 */

public class GeometryFiguresCounterApp extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    if (BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree());
    }
  }
}
