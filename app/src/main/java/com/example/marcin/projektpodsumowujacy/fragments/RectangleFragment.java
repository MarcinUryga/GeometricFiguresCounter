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
import com.example.marcin.projektpodsumowujacy.model.RectangleCounter;

import java.util.ArrayList;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class RectangleFragment extends Fragment {
    private Button countRectangleAreaBtn;
    private EditText baseEditText;
    private EditText heightEditText;
    private TextView resultTextView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.rectangle_fragment, container, false);
    }

    @Override
    public void onViewCreated(final View view,
                              @Nullable final Bundle savedInstanceState) {
        baseEditText = (EditText) view.findViewById(R.id.baseEditText);
        heightEditText = (EditText) view.findViewById(R.id.heightEditText);
        resultTextView = (TextView) view.findViewById(R.id.resultTextView);
        countRectangleAreaBtn = (Button) view.findViewById(R.id.countAreaBtn);

        countRectangleAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                String result = new RectangleCounter(new ArrayList<String>() {
                    {
                        add(baseEditText.getText().toString());
                        add(heightEditText.getText().toString());
                    }
                }).countFigureArea() + "";
                resultTextView.setText(result);
            }
        });
    }
}
