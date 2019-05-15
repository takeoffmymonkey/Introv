package com.galukhin.introv.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.galukhin.introv.R;

public class ActivityForPrefsFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_prefs_fragment);

        getFragmentManager().beginTransaction()
                .add(R.id.ll, new PrefsFragment())
                .commit();
    }
}
