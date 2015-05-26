package com.iblesa.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_main, container, false);
        String[] forecastArray = {"Monday - Sunny - 25/13"
                ,"Tuesday - Sunny - 25/13"
                ,"Wednesday - Sunny - 25/13"
                ,"Thursday - Sunny - 25/13"
                ,"Friday - Sunny - 25/13"
                ,"Saturday - Sunny - 25/13"
                ,"Sunday - Sunny - 25/13"
        };

        List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));

        return inflate;
    }
}
