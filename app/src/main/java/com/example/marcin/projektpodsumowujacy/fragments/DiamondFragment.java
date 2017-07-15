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
import com.example.marcin.projektpodsumowujacy.model.DiamondCounter;

import java.util.ArrayList;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class DiamondFragment extends Fragment {
    private Button countDiamondAreaBtn;
    private EditText firstDiagonalEditText;
    private EditText secondDiagonalEditText;
    private TextView resultTextView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.diamond_fragment, container, false);
    }

    @Override
    public void onViewCreated(final View view,
                              @Nullable final Bundle savedInstanceState) {
        firstDiagonalEditText =
                (EditText) view.findViewById(R.id.firstDiagonalEditText);
        secondDiagonalEditText =
                (EditText) view.findViewById(R.id.secondDiagonalEditText);

        resultTextView = (TextView) view.findViewById(R.id.resultTextView);

        countDiamondAreaBtn = (Button) view.findViewById(R.id.countAreaBtn);

        countDiamondAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                String result = new DiamondCounter(new ArrayList<String>() {
                    {
                        add(firstDiagonalEditText.getText().toString());
                        add(secondDiagonalEditText.getText().toString());

                    }
                }).countFigureArea() + "";
                resultTextView.setText(result);
            }
        });
    }
}
