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
 * goes along with CompetitionCollegeActivity
 */
public class CompetitionCollegeFragment extends Fragment {

    private static final String GET_EXTRA_INFOS = "get_extra";

    private String message;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        message = getArguments().getString(GET_EXTRA_INFOS);
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.competition_fragment, container, false);
        Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
        return view;
    }





    /**
     * the argument here is used to be display in a toast
     * @param str
     * @return
     */
    public static Fragment getInstance(String str){

        Bundle args = new Bundle();
        args.putString(GET_EXTRA_INFOS, str);

        CompetitionCollegeFragment fragment = new CompetitionCollegeFragment();
        fragment.setArguments(args);

        return fragment;

    }
}
