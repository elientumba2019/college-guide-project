package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.ActivitiesCollegeFragment;

/**
 * Created by Administrator on 2017/8/24 0024.
 */


/**
 * inside the college details, handle the activities for all the colleges
 */
public class ActivitiesCollegeActivity extends MotherActivity {

    private static final String ACTIVITY_INFOS = "activity_info";


    @Override
    protected Fragment getFragment() {

        String str = getIntent().getStringExtra(ACTIVITY_INFOS);

        return ActivitiesCollegeFragment.getInstance(str);
    }



    public static Intent getIntent(Context context, String str){
        Intent intent = new Intent(context, ActivitiesCollegeActivity.class);
        intent.putExtra(ACTIVITY_INFOS, str);
        return intent;
    }
}
