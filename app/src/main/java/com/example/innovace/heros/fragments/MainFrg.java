package com.example.innovace.heros.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.innovace.heros.MainActivity;
import com.example.innovace.heros.R;
import com.example.innovace.heros.activites.MainData;

/**
 * Created by innovace on 22/1/18.
 */

public class MainFrg extends Fragment implements View.OnClickListener {

    Button cameBtn,autoBtn,accBtn,choBtn;

    private  mainFragDataInter listnerInter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_frag, container, false);

        cameBtn = (Button)view.findViewById(R.id.came);
        autoBtn = (Button)view.findViewById(R.id.genitic);
        accBtn = (Button)view.findViewById(R.id.bron);
        choBtn = (Button)view.findViewById(R.id.choose);


        cameBtn.setOnClickListener(this);
        autoBtn.setOnClickListener(this);
        accBtn.setOnClickListener(this);

        choBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainData mainData = (MainData)getActivity();
                mainData.loadPickPowerScreen();
            }
        });
        choBtn.setEnabled(false);
        choBtn.getBackground().setAlpha(128);


        return view;

    }


    @Override
    public void onClick(View view) {

        choBtn.setEnabled(true);
        choBtn.getBackground().setAlpha(225);

        cameBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lightning,0,0,0);
        autoBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.atomic,0,0,0);

        accBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.rocket,0,0,0);

        int leftDrawable = 0;

        Button b = (Button)view;

        if (b == cameBtn){
            leftDrawable = R.drawable.lightning;

        }
        else if (b == autoBtn){
            leftDrawable = R.drawable.atomic;

        }else if (b == accBtn){
            leftDrawable = R.drawable.rocket;

        }

        b.setCompoundDrawablesWithIntrinsicBounds(leftDrawable,0,R.drawable.itemselected,0);


    }


    public  interface  mainFragDataInter{


        void onMainFragmentInteraction(Uri uri);

    }



    }

