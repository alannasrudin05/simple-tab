package com.praktikum.simple_tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class TennisFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tennis, container, false);


//        TextView textview = new TextView(this);
//        textview.setText("This is the Tennis tab \n Rafael Nadal \n Roger Federrer \n Novac Djokovic");
//        setContentView(textview);

    }
}