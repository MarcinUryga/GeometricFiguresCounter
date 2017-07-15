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
import com.example.marcin.projektpodsumowujacy.model.EquilateralTriangleCounter;

import java.util.ArrayList;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class EquilateralTriangleFragment extends Fragment {
    private Button countEquilateralTriangleAreaBtn;
    private EditText triangleBaseEditText;
    private TextView resultTextView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        return inflater
                .inflate(R.layout.equilateraltriangle_fragment,
                        container,
                        false);
    }

    @Override
    public void onViewCreated(final View view,
                              @Nullable final Bundle savedInstanceState) {
        triangleBaseEditText =
                (EditText) view.findViewById(R.id.triangleBaseEditText);
        resultTextView =
                (TextView) view.findViewById(R.id.resultTextView);
        countEquilateralTriangleAreaBtn =
                (Button) view.findViewById(R.id.countAreaBtn);

        countEquilateralTriangleAreaBtn
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        String result = new EquilateralTriangleCounter(
                                new ArrayList<String>() {
                                    {
                                        add(triangleBaseEditText
                                                .getText().toString());
                                    }
                                }).countFigureArea() + "";
                        resultTextView.setText(result);
                    }
                });
    }
}
