package com.example.marcin.projektpodsumowujacy.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.marcin.projektpodsumowujacy.R;
import com.example.marcin.projektpodsumowujacy.model.RectangularTriangleCounter;

import java.util.ArrayList;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class RectangularTriangleFragment extends Fragment {
    private Button countRectangularTriangleAreaBtn;
    private EditText triangleBaseEditText;
    private EditText triangleHeightEditText;
    private TextView resultTextView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.rectangulartriangle_fragment,
                container,
                false);
    }

    @Override
    public void onViewCreated(final View view,
                              @Nullable final Bundle savedInstanceState) {
        triangleBaseEditText =
                (EditText) view.findViewById(R.id.triangleBaseEditText);
        triangleHeightEditText =
                (EditText) view.findViewById(R.id.triangleHeightEditText);
        resultTextView = (TextView) view.findViewById(R.id.resultTextView);
        countRectangularTriangleAreaBtn =
                (Button) view.findViewById(R.id.countAreaBtn);

        countRectangularTriangleAreaBtn
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        String result = new RectangularTriangleCounter(
                                new ArrayList<String>() {
                                    {
                                        add(triangleBaseEditText
                                                .getText().toString());
                                        add(triangleHeightEditText
                                                .getText().toString());
                                    }
                                }).countFigureArea() + "";
                        resultTextView.setText(result);
                    }
                });
    }
}
