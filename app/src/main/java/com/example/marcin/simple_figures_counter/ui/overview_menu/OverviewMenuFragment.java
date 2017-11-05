package com.example.marcin.simple_figures_counter.ui.overview_menu;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.model.Figure;
import com.example.marcin.simple_figures_counter.ui.figures.FiguresFactory;
import com.example.marcin.simple_figures_counter.ui.figures.circle.CircleFragment;
import com.example.marcin.simple_figures_counter.ui.figures.diamond.DiamondFragment;
import com.example.marcin.simple_figures_counter.ui.figures.equilateral_triangle.EquilateralTriangleFragment;
import com.example.marcin.simple_figures_counter.ui.figures.rectangle.RectangleFragment;
import com.example.marcin.simple_figures_counter.ui.figures.square.SquareFragment;
import com.example.marcin.simple_figures_counter.ui.figures.triangle.RectangularTriangleFragment;
import com.example.marcin.simple_figures_counter.ui.overview_menu.adapter.OverviewMenuAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import timber.log.Timber;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class OverviewMenuFragment extends Fragment {

  @SuppressWarnings({"WeakerAccess", "CanBeFinal"})
  @BindView(R.id.recyclerviewFigures)
  RecyclerView recyclerviewFigures;
  private Unbinder unbinder;

  private ActivityListener listener;
  private Disposable subscribe = null;
  private final List<Figure> listOfFigures = new ArrayList<>();


  @Override
  public void onAttach(final Context context) {
    super.onAttach(context);
    if (context instanceof ActivityListener) {
      listener = (ActivityListener) context;
    } else {
      throw new ClassCastException(
          context.toString() + " should implements " + " ActivityListener");
    }
  }

  @Nullable
  @Override
  public View onCreateView(
      final LayoutInflater inflater,
      @Nullable final ViewGroup container,
      @Nullable final Bundle savedInstanceState
  ) {
    View view = inflater
        .inflate(R.layout.overviewfigures_fragment, container, false);
    unbinder = ButterKnife.bind(this, view);
    prepareListOfFigures();
    prepareRecyclerView();
    return view;
  }

  private void prepareListOfFigures() {
    listOfFigures.clear();
    listOfFigures.add(FiguresFactory.buildSquare());
    listOfFigures.add(FiguresFactory.buildCircle());
    listOfFigures.add(FiguresFactory.buildDiamond());
    listOfFigures.add(FiguresFactory.buildEquilateralTriangle());
    listOfFigures.add(FiguresFactory.buildRectangularTriangle());
    listOfFigures.add(FiguresFactory.buildRectangle());
  }

  @android.support.annotation.NonNull
  private OverviewMenuAdapter prepareAdapter() {
    final OverviewMenuAdapter adapter = new OverviewMenuAdapter(listOfFigures);
    subscribe = adapter.getClickEvent().subscribe(new Consumer<Figure>() {
      @Override
      public void accept(@NonNull final Figure figure) throws Exception {
        onFigureClick(figure.getId());
      }
    });
    return adapter;
  }

  private void prepareRecyclerView() {
    OverviewMenuAdapter adapter = prepareAdapter();
    recyclerviewFigures.setHasFixedSize(true);
    recyclerviewFigures.setLayoutManager(new LinearLayoutManager(getContext()));
    recyclerviewFigures.setAdapter(adapter);
  }

  private void onFigureClick(final int clickedFigure) {
    switch (clickedFigure) {
      case R.id.squareId:
        listener.onFigureFragmentSelected(new SquareFragment());
        break;
      case R.id.circleId:
        listener.onFigureFragmentSelected(new CircleFragment());
        break;
      case R.id.diamondId:
        listener.onFigureFragmentSelected(new DiamondFragment());
        break;
      case R.id.equilateralTriangleId:
        listener.onFigureFragmentSelected(new EquilateralTriangleFragment());
        break;
      case R.id.rectangularTriangleId:
        listener.onFigureFragmentSelected(new RectangularTriangleFragment());
        break;
      case R.id.rectangleID:
        listener.onFigureFragmentSelected(new RectangleFragment());
        break;
      default:
        Timber.e(new IllegalStateException("Cannot find this figure"));
    }
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    subscribe.dispose();
    unbinder.unbind();
  }
}
