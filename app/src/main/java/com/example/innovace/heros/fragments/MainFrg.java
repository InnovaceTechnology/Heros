package com.example.innovace.heros.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.innovace.heros.R;

/**
 * Created by innovace on 22/1/18.
 */

public class MainFrg extends Fragment implements View.OnClickListener {
    @Override
    public void onClick(View view) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_frag, container, false);

        return view;

    }
}
