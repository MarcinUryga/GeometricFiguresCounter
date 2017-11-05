package com.example.marcin.simple_figures_counter.ui.overview_menu.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.model.Figure;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class OverviewMenuAdapter extends RecyclerView.Adapter {

  private List<Figure> listOfFigures = new ArrayList<>();
  private final PublishSubject<Figure> publishSubject = PublishSubject.create();

  public OverviewMenuAdapter(final List<Figure> listOfFigures) {
    this.listOfFigures = listOfFigures;
  }

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
    final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_figure, parent, false);
    return new ListOfFiguresViewHolder(view);
  }

  @Override
  public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
    ((ListOfFiguresViewHolder) holder).bind(listOfFigures.get(position));
  }

  public Observable<Figure> getClickEvent() {
    return publishSubject;
  }

  @Override
  public int getItemCount() {
    return listOfFigures.size();
  }

  class ListOfFiguresViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.figureTextView)
    TextView textView;

    ListOfFiguresViewHolder(final View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
      itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          publishSubject.onNext(listOfFigures.get(getLayoutPosition()));
        }
      });
    }

    void bind(Figure figure) {
      textView.setText(itemView.getContext().getString(figure.getTextViewId()));
      textView.setCompoundDrawablesWithIntrinsicBounds(figure.getImageId(), 0, 0, 0);
    }
  }
}
