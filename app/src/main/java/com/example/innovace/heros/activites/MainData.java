package com.example.innovace.heros.activites;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.innovace.heros.R;
import com.example.innovace.heros.fragments.MainFrg;
import com.example.innovace.heros.fragments.PickerFrg;

/**
 * Created by innovace on 22/1/18.
 */

public class MainData extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_data);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment);
        if (fragment == null){
            fragment = new MainFrg();
            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment,fragment);
            fragmentTransaction.commit();

        }


    }

   /* @Override
    public void onMainFragmentInteraction(Uri uri) {

    }*/

    /*@Override
    public void onPickPowerFragmentInteraction(Uri uri) {

    }*/

    public void loadPickPowerScreen() {

        PickerFrg pickerFrg = new PickerFrg();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, pickerFrg).addToBackStack(null).commit();



    }
}
