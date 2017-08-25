package com.example.administrator.mycollegeguide.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.administrator.mycollegeguide.R;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

/**
 * goes along with ActivitiesCollegeActivity
 */

public class ActivitiesCollegeFragment extends Fragment {

    private static final String GET_ACTIVITIES_INFOS = "get_activities_infos";
    private String str;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        str = getArguments().getString(GET_ACTIVITIES_INFOS);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activities_layout, container, false);

        Toast.makeText(getActivity(), str, Toast.LENGTH_LONG).show();

        return view;
    }




    public static Fragment getInstance(String str){
        Bundle args = new Bundle();
        args.putString(GET_ACTIVITIES_INFOS, str);

        ActivitiesCollegeFragment fragment = new ActivitiesCollegeFragment();
        fragment.setArguments(args);

        return fragment;
    }
}
