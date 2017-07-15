package com.example.marcin.projektpodsumowujacy.fragments;

/**
 * Created by MARCIN on 2017-07-15.
 */

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
import com.example.marcin.projektpodsumowujacy.model.CircleCounter;

import java.util.ArrayList;

public final class CircleFragment extends Fragment {

    private Button countCircleAreaBtn;

    private EditText radiusEditText;

    private TextView resultTextView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.circle_fragment, container, false);
    }

    @Override
    public void onViewCreated(final View view,
                              @Nullable final Bundle savedInstanceState) {
        radiusEditText = (EditText) view.findViewById(R.id.radiusEditText);
        resultTextView = (TextView) view.findViewById(R.id.resultTextView);
        countCircleAreaBtn = (Button) view.findViewById(R.id.countAreaBtn);

        countCircleAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                String result = new CircleCounter(new ArrayList<String>() {
                    {
                        add(radiusEditText.getText().toString());
                    }
                }).countFigureArea() + "";
                resultTextView.setText(result);
            }
        });
    }
}
