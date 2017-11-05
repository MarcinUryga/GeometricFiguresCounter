package com.example.marcin.simple_figures_counter.ui.figures.square;

import android.widget.EditText;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.common.KeyboardUtils;
import com.example.marcin.simple_figures_counter.ui.figures.BaseFigureFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class SquareFragment extends BaseFigureFragment {

  @SuppressWarnings("WeakerAccess")
  @BindView(R.id.baseEditText)
  EditText baseEditText;

  public SquareFragment() {
    super(R.layout.square_fragment);
  }

  @Override
  public void setResultTextView() {
    String baseString = baseEditText.getText().toString();
    if (!baseString.isEmpty()) {
      resultTextView.setText(getString(R.string.result, SquareCounter.countFigureArea(Double.parseDouble(baseString))));
    }
  }

  @OnClick(R.id.countAreaBtn)
  public void countSquareClicked() {
    KeyboardUtils.hide(getView());
    setResultTextView();
  }
}
