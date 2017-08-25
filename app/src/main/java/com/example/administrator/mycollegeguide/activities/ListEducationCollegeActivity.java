package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.ListEducationCollegeFragment;

/**
 * Created by Administrator on 2017/8/8 0008.
 */

public class ListEducationCollegeActivity extends MotherActivity {
    @Override
    protected Fragment getFragment() {
        return new ListEducationCollegeFragment();
    }





    public static Intent getIntent(Context context){
        Intent intent = new Intent(context , ListEducationCollegeActivity.class);
        return  intent;
    }
}
