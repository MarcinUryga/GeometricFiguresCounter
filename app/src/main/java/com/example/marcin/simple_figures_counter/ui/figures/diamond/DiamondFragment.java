package com.example.marcin.simple_figures_counter.ui.figures.diamond;

import android.widget.EditText;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.common.KeyboardUtils;
import com.example.marcin.simple_figures_counter.ui.figures.BaseFigureFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class DiamondFragment extends BaseFigureFragment {

  @SuppressWarnings("WeakerAccess")
  @BindView(R.id.firstDiagonalEditText)
  EditText firstDiagonalEditText;
  @SuppressWarnings("WeakerAccess")
  @BindView(R.id.secondDiagonalEditText)
  EditText secondDiagonalEditText;

  public DiamondFragment() {
    super(R.layout.diamond_fragment);
  }

  @Override
  public void setResultTextView() {
    String firstDiagonalString = firstDiagonalEditText.getText().toString();
    String secondDiagonalString = secondDiagonalEditText.getText().toString();
    if (!firstDiagonalString.isEmpty() && !secondDiagonalString.isEmpty()) {
      resultTextView.setText(getString(R.string.result, DiamondCounter.countFigureArea(
          Double.parseDouble(firstDiagonalString),
          Double.parseDouble(secondDiagonalString)
      )));
    }
  }

  @OnClick(R.id.countAreaBtn)
  public void countDiamondAreaClicked() {
    KeyboardUtils.hide(getView());
    setResultTextView();
  }
}