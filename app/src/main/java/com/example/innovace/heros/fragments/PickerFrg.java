package com.example.innovace.heros.fragments;

import android.net.Uri;
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

public class PickerFrg extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pick_frag, container, false);
        return  view;
    }

    /*public interface  pickerFrgInterface{
        void onPickPowerFragmentInteraction(Uri uri);
    }
*/
}
