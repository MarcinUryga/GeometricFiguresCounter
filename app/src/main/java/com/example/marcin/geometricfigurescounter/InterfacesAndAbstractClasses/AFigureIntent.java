package com.example.marcin.geometricfigurescounter.InterfacesAndAbstractClasses;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by MARCIN on 2017-04-07.
 */
public abstract class AFigureIntent extends Activity {

    private Context context;

    public AFigureIntent(Context context){
        this.context = context;
    }

    public Context getFigureContext(){
        return context;
    }

    public abstract Intent createFigureIntent();
}
