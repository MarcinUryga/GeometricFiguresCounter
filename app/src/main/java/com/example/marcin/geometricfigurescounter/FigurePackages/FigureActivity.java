package com.example.marcin.geometricfigurescounter.FigurePackages;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.marcin.geometricfigurescounter.FigurePackages.CirclePackage.CircleAdaptee;
import com.example.marcin.geometricfigurescounter.FigurePackages.DiamondPackage.DiamondAdaptee;
import com.example.marcin.geometricfigurescounter.FigurePackages.EquilateralTrianglePackage.EquilateralTriangleAdaptee;
import com.example.marcin.geometricfigurescounter.FigurePackages.RectanglePackage.RectangleAdaptee;
import com.example.marcin.geometricfigurescounter.FigurePackages.RightAngledTriangle.RightAngledTriangleAdaptee;
import com.example.marcin.geometricfigurescounter.FigurePackages.SquarePackage.SquareAdaptee;
import com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses.IGeometryFiguresData;
import com.example.marcin.projektpodsumowujacy.R;

import java.util.ArrayList;

public class FigureActivity extends Activity{


    TextView result;
    Button countButton;

    FigureAdapter figureAdapter;
    IGeometryFiguresData figureAdaptee;

    private IGeometryFiguresData returnAdaptee(String nameAdaptee){

        switch (nameAdaptee){
            case "SquareAdaptee":
                figureAdaptee = new SquareAdaptee(
                        new ArrayList<EditText>() {
                            {
                                add((EditText) findViewById(R.id.baseEditText));
                            }
                        });
                break;

            case "CircleAdaptee":
                figureAdaptee = new CircleAdaptee(
                    new ArrayList<EditText>() {
                        {
                            add(
                                    (EditText) findViewById(R.id.radiusEditText)
                            );
                        }
                    });
                break;

            case "DiamondAdaptee":
                figureAdaptee = new DiamondAdaptee(
                    new ArrayList<EditText>() {
                        {
                            add((EditText) findViewById(R.id.firstDiagonalEditText));
                            add((EditText) findViewById(R.id.secondDiagonalEditText));
                        }
                    });
                break;

            case "EquilateralTriangleAdaptee":
                figureAdaptee = new EquilateralTriangleAdaptee(
                        new ArrayList<EditText>() {
                            {
                                add((EditText) findViewById(R.id.triangleBaseEditText));
                            }
                        });
                break;

            case "RightAngledTriangleAdaptee":
                figureAdaptee = new RightAngledTriangleAdaptee(
                    new ArrayList<EditText>() {
                        {
                            add((EditText) findViewById(R.id.triangleBaseEditText));
                            add((EditText) findViewById(R.id.triangleHeightEditText));
                        }
                    });
                break;

            case "RectangleAdaptee":
                figureAdaptee = new RectangleAdaptee(
                    new ArrayList<EditText>() {
                        {
                            add((EditText) findViewById(R.id.baseEditText));
                            add((EditText) findViewById(R.id.heightEditText));
                        }
                    });
                break;

        }

        return figureAdaptee;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Bundle b = getIntent().getExtras();
        int contentView = b.getInt("contentView");
        setContentView(contentView);

        countButton = (Button) findViewById(R.id.buttonOblicz);
        figureAdapter = new FigureAdapter(returnAdaptee(b.getString("nameAdaptee")));
        result = (TextView) findViewById(R.id.wynikView);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(figureAdapter.getFigureField());
            }
        });
    }
}
