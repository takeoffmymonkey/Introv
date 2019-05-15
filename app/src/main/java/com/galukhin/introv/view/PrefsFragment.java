package com.galukhin.introv.view;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

import com.galukhin.introv.R;

public class PrefsFragment extends PreferenceFragment
        implements SharedPreferences.OnSharedPreferenceChangeListener {
    private String TAG = "INTROVERT:" + getClass().getSimpleName();

    public static final String KEY_PREF_SYNC = "pref_sync";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.fragment_preferences);

        // можно получать пары ключ-значения, если используется вместе с PreferenceActivity
//        String settings = getArguments().getString("from header");
//        if ("from header 1".equals(settings))
//            Toast.makeText(getActivity(), "Came here from header 1", Toast.LENGTH_SHORT).show();
//        else Toast.makeText(getActivity(), "Came here from header 2", Toast.LENGTH_SHORT).show();

    }

    //регистрировать слушатель желательно здесь
    @Override
    public void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(this);
    }

    //отменять регистрацию слушателя желательно здесь
    @Override
    public void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (key.equals(KEY_PREF_SYNC)) {
            // Find the current value
            SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity());
            boolean sync = sharedPref.getBoolean(PrefsFragment.KEY_PREF_SYNC, false);

            // Set summary to be the user-description for the selected value
            Preference syncPref = findPreference(key);
            syncPref.setSummary("Sync is on: " + sync);
        }
    }
}