package com.example.administrator.mycollegeguide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.mycollegeguide.activities.ListCultureLanguageArtCollegeActivity;
import com.example.administrator.mycollegeguide.activities.ListEconomyHumanitiesCollegeActivity;
import com.example.administrator.mycollegeguide.activities.ListEducationCollegeActivity;
import com.example.administrator.mycollegeguide.activities.ListScienceCollegeActivity;
import com.example.administrator.mycollegeguide.temp_singleton.CollegeFactory;
import com.example.administrator.mycollegeguide.R;

/**
 * Created by Administrator on 2017/8/2 0002.
 */


/**
 * new comment to test git
 */

/**
 * CollegeFragment is responsible for inflating the view that belongs to the
 * CollegeActivity as well as implementing all functionalities
 */
public class CollegeFragment extends Fragment{


    //instance variables
    private Button education, science, economicsAndHumanities, cultureAndArt;

    /**
     *
     *
     *
     * onCreateView method for inflating the View;
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_college , container , false);

        education = (Button)view.findViewById(R.id.education);
        science = (Button)view.findViewById(R.id.science);
        economicsAndHumanities = (Button)view.findViewById(R.id.eco_hum);
        cultureAndArt = (Button)view.findViewById(R.id.cul_lan_art);




        /**
         * opens the education college list
         */
        education.setOnClickListener(action -> {

            Intent intent = ListEducationCollegeActivity.getIntent(getActivity());
            startActivity(intent);
        });




        /**
         * opens the science college list
         */
        science.setOnClickListener(action -> {
            Intent intent = ListScienceCollegeActivity.getIntent(getActivity());
            startActivity(intent);

        });





        /**
         * opens the economic college list
         */
        economicsAndHumanities.setOnClickListener(action ->{
            Intent intent = ListEconomyHumanitiesCollegeActivity.getIntent(getActivity());
            startActivity(intent);
        });





        /**
         *opens the culture and language category
         */
        cultureAndArt.setOnClickListener(action ->{
            Intent intent = ListCultureLanguageArtCollegeActivity.getIntent(getActivity());
            startActivity(intent);
        });


        return view;
    }

}
