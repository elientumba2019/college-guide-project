package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.ListEconomyHumanityFragment;

/**
 * Created by Administrator on 2017/8/9 0009.
 */

public class ListEconomyHumanitiesCollegeActivity extends MotherActivity {



    @Override
    protected Fragment getFragment() {
        return new ListEconomyHumanityFragment();
    }




    /**
     * return an intent that display the corresponding Activity
     * @param context
     * @return
     */
    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, ListEconomyHumanitiesCollegeActivity.class);
        return intent;
    }
}
