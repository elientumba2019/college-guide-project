package com.example.administrator.mycollegeguide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.mycollegeguide.CollegesURL;
import com.example.administrator.mycollegeguide.R;
import com.example.administrator.mycollegeguide.activities.CollegeDetailActivity;

/**
 * Created by Administrator on 2017/8/9 0009.
 */

public class ListCultureLanguageArtFragment extends Fragment implements View.OnClickListener{

    private Button cFL, communicationCreativeArt, african, music, fineArt;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_culture_language_art , container , false);



        //college of foreign language
        cFL = view.findViewById(R.id.foreign_language);
        cFL.setText(R.string.CFL);
        cFL.setOnClickListener(this);


        //college of communication and fine art
        communicationCreativeArt = view.findViewById(R.id.communication);
        communicationCreativeArt.setText(R.string.communication_art);
        communicationCreativeArt.setOnClickListener(this);


        //college of african studies
        african = view.findViewById(R.id.african_studies);
        african.setText(R.string.african_studies);
        african.setOnClickListener(this);


        //college of music
        music = view.findViewById(R.id.music);
        music.setText(R.string.music);
        music.setOnClickListener(this);


        //college of fine art
        fineArt = view.findViewById(R.id.fine_art);
        fineArt.setText(R.string.fine_art);
        fineArt.setOnClickListener(this);

        return view;
    }


    /**
     * starts the CollegDetailActivity
     * using the colleges about website page as parameter
     * @param view
     */
    @Override
    public void onClick(View view) {


        switch (view.getId()){

            case R.id.foreign_language : {
                startActivity(CollegesURL.FOREIGN_LANGUAGE);
                break;
            }


            case R.id.communication : {
                startActivity(CollegesURL.CREATIVE_CULTURE_AND_COMMUNICATION);
                break;
            }

            case R.id.african_studies : {
                startActivity(CollegesURL.CHINA_AFRICA_INTERNATIONAL_BUSINESS_SCHOOL);
                break;
            }

            case R.id.music : {
                startActivity(CollegesURL.MUSIC_COLLEGE);
                break;
            }

            case R.id.fine_art : {
                startActivity(CollegesURL.ART_COLLEGE);
                break;
            }
        }
    }



    /**
     * start the activity : CollegeDetailActivity
     */
    private void startActivity(String url){
        Intent intent = CollegeDetailActivity.getIntent(getActivity() , url);
        startActivity(intent);
    }
}
