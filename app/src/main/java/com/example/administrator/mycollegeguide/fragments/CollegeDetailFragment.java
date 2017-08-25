package com.example.administrator.mycollegeguide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.mycollegeguide.R;
import com.example.administrator.mycollegeguide.activities.AboutCollegeActivity;
import com.example.administrator.mycollegeguide.activities.ActivitiesCollegeActivity;
import com.example.administrator.mycollegeguide.activities.CompetitionCollegeActivity;
import com.example.administrator.mycollegeguide.activities.MajorCollegeActivity;
import com.example.administrator.mycollegeguide.activities.OfficeCollegeActivity;
import com.example.administrator.mycollegeguide.activities.TeacherCollegeActivity;

/**
 * Created by Administrator on 2017/8/11 0011.
 */


/**
 * CollegeDetail Fragment class
 */
public class CollegeDetailFragment extends Fragment implements View.OnClickListener{


    private static final String ARGUMENT_VALUE = "key";
    private static String url;
    private static final String COMPETITION_MESSAGE = "no competition for now come back later"
                                                        + " for more information";

    private static final String ACTIVITIES_MESSAGE = "no activities for now come back later"
                                                    + " for more information";

    private Button about , major , competition , teacher , offices , activities;


    /**
     * onCreate method
     * @param savedInstanceState
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         url = (String) getArguments().get(ARGUMENT_VALUE);
    }





    /**
     * returns the view corresponding to a single college
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.college_details_layout , container , false);

        about = view.findViewById(R.id.about_detail);
        major = view.findViewById(R.id.major_detail);
        competition = view.findViewById(R.id.competitiion_detail);
        teacher = view.findViewById(R.id.teacher_detail);
        offices = view.findViewById(R.id.offices_detail);
        activities = view.findViewById(R.id.activities_detail);


        about.setOnClickListener(this);
        major.setOnClickListener(this);
        competition.setOnClickListener(this);
        teacher.setOnClickListener(this);
        offices.setOnClickListener(this);
        activities.setOnClickListener(this);

        return view;
    }





    /**
     * returns an instance of this
     * with its frgament argument values
     * @param url
     * @return
     */
    public static CollegeDetailFragment getInstance(String url){

        Bundle bundle = new Bundle();
        bundle.putString(ARGUMENT_VALUE , url);
        CollegeDetailFragment fragment = new CollegeDetailFragment();
        fragment.setArguments(bundle);
        return fragment;
    }





    /**
     * opens an activity based on the button that was
     * clicked by the user
     * @param view
     */
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.about_detail : {
                Intent intent = AboutCollegeActivity.getIntent(getActivity() , url);
                startActivity(intent);
                break;
            }


            case R.id.major_detail : {
                Intent intent = MajorCollegeActivity.getIntent(getActivity());
                startActivity(intent);
                break;
            }


            case R.id.competitiion_detail : {
                Intent intent = CompetitionCollegeActivity.getIntent(getActivity(), COMPETITION_MESSAGE);
                startActivity(intent);
                break;
            }

            case R.id.teacher_detail : {
                Intent intent = TeacherCollegeActivity.getIntent(getActivity());
                startActivity(intent);
                break;

            }

            case R.id.offices_detail : {
                Intent intent = OfficeCollegeActivity.getIntent(getActivity());
                startActivity(intent);
                break;
            }

            case R.id.activities_detail : {
                Intent intent = ActivitiesCollegeActivity.getIntent(getActivity(), ACTIVITIES_MESSAGE);
                startActivity(intent);
            }
        }
    }
}
