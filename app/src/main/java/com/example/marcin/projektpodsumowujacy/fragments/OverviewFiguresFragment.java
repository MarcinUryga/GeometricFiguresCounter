package com.example.marcin.projektpodsumowujacy.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.ActivityListener;
import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.FigureRepresentatnionOnList;
import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.OnClickListener;
import com.example.marcin.projektpodsumowujacy.MyAdapter;
import com.example.marcin.projektpodsumowujacy.MyFigures;
import com.example.marcin.projektpodsumowujacy.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class OverviewFiguresFragment
        extends Fragment implements OnClickListener {

    private ActivityListener listener;

    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
        if (context instanceof ActivityListener) {
            listener = (ActivityListener) context;
        } else {
            throw new ClassCastException(
                    context.toString()
                            + " should implements " + " ActivityListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(
                R.layout.overviewfigures_fragment,
                container,
                false);
    }

    @Override
    public void onViewCreated(final View view,
                              @Nullable final Bundle savedInstanceState) {
        List<FigureRepresentatnionOnList> listofFigures = new ArrayList<>();
        listofFigures.add(new MyFigures.SquareFigure());
        listofFigures.add(new MyFigures.CircleFigure());
        listofFigures.add(new MyFigures.DiamondFigure());
        listofFigures.add(new MyFigures.EquilateralTriangleFigure());
        listofFigures.add(new MyFigures.RectangularTriangleFigure());
        listofFigures.add(new MyFigures.RectangleFigure());

        RecyclerView recyclerView =
                (RecyclerView) view.findViewById(R.id.recyclerviewFigures);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(
                new MyAdapter(recyclerView, listofFigures, this));
    }


    @Override
    public void onFigureClick(final int clickedFigure) {
        switch (clickedFigure) {
            case R.id.squareID:
                listener.onFigureFragmentSelected(new SquareFragment());
                break;
            case R.id.circleID:
                listener.onFigureFragmentSelected(new CircleFragment());
                break;
            case R.id.diamondID:
                listener.onFigureFragmentSelected(new DiamondFragment());
                break;
            case R.id.equilateraltriangleID:
                listener.onFigureFragmentSelected(
                        new EquilateralTriangleFragment());
                break;
            case R.id.rectangulartriangleID:
                listener.onFigureFragmentSelected(
                        new RectangularTriangleFragment());
                break;
            case R.id.rectangleID:
                listener.onFigureFragmentSelected(new RectangleFragment());
                break;
            default:
                throw new IllegalStateException("Cannot find this figure");
        }
    }
}
