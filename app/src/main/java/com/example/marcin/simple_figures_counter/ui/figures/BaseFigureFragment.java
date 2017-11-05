package com.example.marcin.simple_figures_counter.ui.figures;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marcin.simple_figures_counter.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by MARCIN on 2017-11-05.
 */

public abstract class BaseFigureFragment extends Fragment {

  @BindView(R.id.resultTextView)
  protected TextView resultTextView;
  private Unbinder unbinder;

  private final int layoutId;

  protected BaseFigureFragment(int layoutId) {
    this.layoutId = layoutId;
  }

  @Nullable
  @Override
  public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
    View view = inflater.inflate(layoutId, container, false);
    unbinder = ButterKnife.bind(this, view);
    return view;
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    unbinder.unbind();
  }

  public abstract void setResultTextView();
}
