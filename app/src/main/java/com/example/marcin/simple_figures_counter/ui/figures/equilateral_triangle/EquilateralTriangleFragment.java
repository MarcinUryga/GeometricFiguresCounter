package com.example.marcin.simple_figures_counter.ui.figures.equilateral_triangle;

import android.widget.EditText;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.common.KeyboardUtils;
import com.example.marcin.simple_figures_counter.ui.figures.BaseFigureFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class EquilateralTriangleFragment extends BaseFigureFragment {

  @SuppressWarnings("WeakerAccess")
  @BindView(R.id.triangleBaseEditText)
  EditText triangleBaseEditText;

  public EquilateralTriangleFragment() {
    super(R.layout.equilateraltriangle_fragment);
  }

  @Override
  public void setResultTextView() {
    String triangleBaseString = triangleBaseEditText.getText().toString();
    if (!triangleBaseString.isEmpty()) {
      resultTextView.setText(getString(R.string.result, EquilateralTriangleCounter.countFigureArea(Double.parseDouble(triangleBaseString))));
    }
  }

  @OnClick(R.id.countAreaBtn)
  public void countEquilateralTriangleClicked() {
    KeyboardUtils.hide(getView());
    setResultTextView();
  }
}
