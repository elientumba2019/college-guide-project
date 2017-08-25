package com.example.administrator.mycollegeguide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spanned;
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

public class ListEducationCollegeFragment extends Fragment implements View.OnClickListener{

    /**
     * instance field variable
     *
     */
    private Button vocation, culture_edu, teacher_edu, science_edu,
            early_child, physical_edu;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_education_college, container , false);


        //college of vocational education
        vocation= view.findViewById(R.id.vocational_education);
        vocation.setText(R.string.vocation_education);
        vocation.setOnClickListener(this);





        //college of culture education
        culture_edu = view.findViewById(R.id.culture_education);
        culture_edu.setText(R.string.culture_education);
        culture_edu.setOnClickListener(this);


        //college of teacher education
        teacher_edu = view.findViewById(R.id.teacher_education);
        teacher_edu.setText(R.string.teacher_education);
        teacher_edu.setOnClickListener(this);



        //college of education science
        science_edu = view.findViewById(R.id.education_science);
        science_edu.setText(R.string.education_science);
        science_edu.setOnClickListener(this);



        //hangzhou college of early childhood
        early_child = view.findViewById(R.id.early_chilhood);
        early_child.setText(R.string.early_childhood);
        early_child.setOnClickListener(this);



        //college of physical education
        physical_edu = view.findViewById(R.id.physical_education);
        physical_edu.setText(R.string.physical_education);
        physical_edu.setOnClickListener(this);



        return view;
    }







    /**
     * click event when a College is being Clicked
     * @param view
     */
    @Override
    public void onClick(View view) {

        switch (view.getId())
        {

            case R.id.vocational_education : {
                startActivity(CollegesURL.COLLEGE_OF_ENGINEERING);
                break;
            }


            case R.id.culture_education : {
                startActivity(CollegesURL.COLLEGE_OF_INTERNATIONAL_EDUCATION);
                break;
            }


            case R.id.teacher_education : {
                startActivity(CollegesURL.COLLEGE_OF_TEACHER_EDUCATION);
                break;
            }

            case R.id.early_chilhood : {
                startActivity(CollegesURL.EARLY_EDUCATION);
                break;
            }

            case R.id.education_science : {
                startActivity(CollegesURL.COLLEGE_OF_TEACHER_EDUCATION);
                break;
            }

            case R.id.physical_education : {
                startActivity(CollegesURL.PHYSICAL_EDUCATION);
                break;
            }


        }
    }


    /**
     * starts the college detail activity whenever
     * a college is clicked by the user
     */
    private void startActivity(String url){
        Intent intent = CollegeDetailActivity.getIntent(getActivity() , url);
        startActivity(intent);
    }
}
