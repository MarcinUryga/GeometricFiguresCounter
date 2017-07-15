package com.example.marcin.projektpodsumowujacy;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.FigureRepresentatnionOnList;
import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.OnClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class MyAdapter extends RecyclerView.Adapter {

    private RecyclerView recyclerView;
    private List<FigureRepresentatnionOnList> listOfFigures = new ArrayList<>();
    private Resources resources;
    private OnClickListener clickListener;

    public MyAdapter(final RecyclerView recyclerView,
                     final List<FigureRepresentatnionOnList> listOfFigures,
                     final OnClickListener listener) {
        this.clickListener = listener;
        this.recyclerView = recyclerView;
        this.listOfFigures = listOfFigures;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(
            final ViewGroup parent,
            final int viewType) {
        final View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.cardview_figure, parent, false);
        resources = view.getResources();

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                int clickedPosition =
                        recyclerView.getChildAdapterPosition(view);

                clickListener.onFigureClick(
                        listOfFigures.get(clickedPosition).getFigureId());
            }
        });

        return new ListOfFiguresViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder,
                                 final int position) {
        FigureRepresentatnionOnList figureRepresentation =
                listOfFigures.get(position);
        ((ListOfFiguresViewHolder) holder).getImageView()
                .setImageDrawable(
                        resources.getDrawable(
                                figureRepresentation.getImageId()));
        ((ListOfFiguresViewHolder) holder).getTextView()
                .setText(
                        resources.getString(
                                figureRepresentation.getTextViewId()));
    }

    @Override
    public int getItemCount() {
        return listOfFigures.size();
    }

}
