package com.example.administrator.mycollegeguide.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.mycollegeguide.R;

/**
 * Created by Administrator on 2017/8/9 0009.
 */

public class ListEconomyHumanityFragment extends Fragment {


    private Button economy, humanities;


    /**
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_economy_humanity_college , container , false);


        /**
         * set the corresponding view with their id and action listener to open activities
         */


        //college of economy and management
        //economy = view.findViewById(R.id.button10);





        //college of humanities
        //humanities = view.findViewById(R.id.button11);






        return view;
    }
}
