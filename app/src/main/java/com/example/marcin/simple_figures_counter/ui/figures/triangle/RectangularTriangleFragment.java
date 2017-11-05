package com.example.marcin.simple_figures_counter.ui.figures.triangle;

import android.widget.EditText;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.common.KeyboardUtils;
import com.example.marcin.simple_figures_counter.ui.figures.BaseFigureFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class RectangularTriangleFragment extends BaseFigureFragment {

  @SuppressWarnings("WeakerAccess")
  @BindView(R.id.triangleHeightEditText)
  EditText triangleHeightEditText;
  @SuppressWarnings("WeakerAccess")
  @BindView(R.id.triangleBaseEditText)
  EditText triangleBaseEditText;

  public RectangularTriangleFragment() {
    super(R.layout.rectangulartriangle_fragment);
  }

  @Override
  public void setResultTextView() {
    String triangleBaseString = triangleBaseEditText.getText().toString();
    String triangleHeightString = triangleHeightEditText.getText().toString();
    if (!triangleBaseString.isEmpty() && !triangleHeightString.isEmpty()) {
      resultTextView.setText(getString(R.string.result, RectangularTriangleCounter.countFigureArea(
          Double.parseDouble(triangleBaseString),
          Double.parseDouble(triangleHeightString)
      )));
    }
  }

  @OnClick(R.id.countAreaBtn)
  public void countRectangularTriangleClicked() {
    KeyboardUtils.hide(getView());
    setResultTextView();
  }
}
