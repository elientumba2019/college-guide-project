package com.example.administrator.mycollegeguide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.example.administrator.mycollegeguide.CollegesURL;
import com.example.administrator.mycollegeguide.R;
import com.example.administrator.mycollegeguide.activities.CollegeDetailActivity;

/**
 * Created by Administrator on 2017/8/8 0008.
 */

public class ListScienceCollegeFragment extends Fragment  implements View.OnClickListener{


    private Button law_politic, chemistry_life, mpi, geography_enviromental;



    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_science_college , container , false);




        /**
         * set text to colleges button
         */



        //college of law and political science
        law_politic = view.findViewById(R.id.law);
        law_politic.setText(R.string.politic_science);
        law_politic.setTextSize(15);
        law_politic.setOnClickListener(this);




        //college of chemistry and life science
        chemistry_life = view.findViewById(R.id.chemistry);
        chemistry_life.setText(R.string.chemistry_life_science);
        chemistry_life.setTextSize(15);
        chemistry_life.setOnClickListener(this);



        //college of mpi
        mpi = view.findViewById(R.id.mpi);
        mpi.setText(R.string.mpi);
        mpi.setTextSize(15);
        mpi.setOnClickListener(this);



        //college of geography environment
        geography_enviromental = view.findViewById(R.id.geography_environment);
        geography_enviromental.setText(R.string.geography_environment);
        geography_enviromental.setTextSize(15);
        geography_enviromental.setOnClickListener(this);

        return view;
    }


    /**
     * start the CollegeDetailActivity
     * @param view
     */
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.law : {
                startActivity(CollegesURL.LAW);
                break;
            }

            case R.id.chemistry : {
                startActivity(CollegesURL.CHEMISTRY);
                break;
            }

            case R.id.mpi : {
                startActivity(CollegesURL.MPI);
                break;
            }

            case R.id.geography_environment : {
                startActivity(CollegesURL.GEOGRAPHY);
                break;
            }
        }
    }





    private void startActivity(String url){
        Intent intent = CollegeDetailActivity.getIntent(getActivity() , url);
        startActivity(intent);
    }
}
