package com.galukhin.introv.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.galukhin.introv.R;

public class FutureFragment extends Fragment {
    private String TAG = "INTROVERT:" + getClass().getSimpleName();


    // newInstance constructor for creating fragment with arguments
    public static FutureFragment newInstance(int page, String title) {
        FutureFragment fragment = new FutureFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_future, container,
                false);

        // Return the view
        return view;
    }
}
