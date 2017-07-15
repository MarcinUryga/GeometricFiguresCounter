package com.example.marcin.projektpodsumowujacy;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.ActivityListener;
import com.example.marcin.projektpodsumowujacy.fragments.OverviewFiguresFragment;

public final class MainActivity extends Activity implements ActivityListener {

    private FragmentManager fragmentManager = getFragmentManager();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setOverviewFiguresFragment();
    }

    private void setOverviewFiguresFragment() {
        fragmentManager.beginTransaction()
                .replace(R.id.containerForFragments,
                        new OverviewFiguresFragment())
                .commit();
    }

    @Override
    public void onFigureFragmentSelected(final android.app.Fragment fragment) {
        fragmentManager.beginTransaction()
                .replace(R.id.containerForFragments, fragment)
                .addToBackStack(null)
                .commit();
    }
}
