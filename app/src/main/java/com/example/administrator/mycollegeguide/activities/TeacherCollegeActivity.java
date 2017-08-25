package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.TeacherCollegeFragment;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class TeacherCollegeActivity extends MotherActivity {


    @Override
    protected Fragment getFragment() {
        return new TeacherCollegeFragment();
    }



    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, TeacherCollegeActivity.class);
        return intent;
    }
}
