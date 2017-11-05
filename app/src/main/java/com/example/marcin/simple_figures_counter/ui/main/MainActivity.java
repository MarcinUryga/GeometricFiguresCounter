package com.example.marcin.simple_figures_counter.ui.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.marcin.simple_figures_counter.R;
import com.example.marcin.simple_figures_counter.ui.overview_menu.ActivityListener;
import com.example.marcin.simple_figures_counter.ui.overview_menu.OverviewMenuFragment;

public final class MainActivity extends AppCompatActivity implements ActivityListener {

  private final FragmentManager fragmentManager = getSupportFragmentManager();

  @Override
  protected void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    setOverviewFiguresFragment();
  }

  private void setOverviewFiguresFragment() {
    fragmentManager.beginTransaction()
        .replace(R.id.containerForFragments, new OverviewMenuFragment())
        .commit();
  }

  @Override
  public void onFigureFragmentSelected(final Fragment fragment) {
    fragmentManager.beginTransaction()
        .replace(R.id.containerForFragments, fragment)
        .addToBackStack(null)
        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        .commit();
  }
}
