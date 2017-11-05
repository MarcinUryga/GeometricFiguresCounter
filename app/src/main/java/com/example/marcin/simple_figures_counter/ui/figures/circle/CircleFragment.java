package com.example.marcin.simple_figures_counter.ui.figures.circle;

import android.widget.EditText;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.common.KeyboardUtils;
import com.example.marcin.simple_figures_counter.ui.figures.BaseFigureFragment;

import butterknife.BindView;
import butterknife.OnClick;

public final class CircleFragment extends BaseFigureFragment {

  @SuppressWarnings("WeakerAccess")
  @BindView(R.id.radiusEditText)
  EditText radiusEditText;

  public CircleFragment() {
    super(R.layout.circle_fragment);
  }

  @Override
  public void setResultTextView() {
    String radiusString = radiusEditText.getText().toString();
    if (!radiusString.isEmpty()) {
      resultTextView.setText(getString(R.string.result, CircleCounter.countFigureArea(Double.parseDouble(radiusString))));
    }
  }

  @OnClick(R.id.countAreaBtn)
  public void countCircleAreaClicked() {
    KeyboardUtils.hide(getView());
    setResultTextView();
  }
}
