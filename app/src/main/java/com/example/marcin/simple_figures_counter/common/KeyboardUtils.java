package com.example.marcin.simple_figures_counter.common;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by MARCIN on 2017-11-04.
 */

public class KeyboardUtils {

  public static void hide(View view) {
    ((InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE))
        .hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
  }
}
