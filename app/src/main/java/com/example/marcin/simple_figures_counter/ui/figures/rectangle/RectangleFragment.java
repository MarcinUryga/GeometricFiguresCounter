package com.example.marcin.simple_figures_counter.ui.figures.rectangle;

import android.widget.EditText;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.common.KeyboardUtils;
import com.example.marcin.simple_figures_counter.ui.figures.BaseFigureFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class RectangleFragment extends BaseFigureFragment {

  @SuppressWarnings("WeakerAccess")
  @BindView(R.id.heightEditText)
  EditText heightEditText;
  @SuppressWarnings("WeakerAccess")
  @BindView(R.id.baseEditText)
  EditText baseEditText;

  public RectangleFragment() {
    super(R.layout.rectangle_fragment);
  }

  @Override
  public void setResultTextView() {
    String baseString = baseEditText.getText().toString();
    String heightString = heightEditText.getText().toString();
    if (!baseString.isEmpty() && !heightString.isEmpty()) {
      resultTextView.setText(getString(R.string.result, RectangleCounter.countFigureArea(
          Double.parseDouble(baseString),
          Double.parseDouble(heightString)
      )));
    }
  }

  @OnClick(R.id.countAreaBtn)
  public void countRectangleClicked() {
    KeyboardUtils.hide(getView());
    setResultTextView();
  }
}