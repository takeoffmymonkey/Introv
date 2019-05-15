package com.galukhin.introv.presenter;

import android.content.Context;
import android.content.Intent;

import com.galukhin.introv.view.ActivityForPrefsFragment;

public class NavigationDrawerPresenter implements INavigationDrawerPresenter {

    @Override
    public void onTemplatesSelected(Context c) {

    }

    @Override
    public void onSettingsSelected(Context c) {
        Intent intent = new Intent(c, ActivityForPrefsFragment.class);
        c.startActivity(intent);
    }
}
