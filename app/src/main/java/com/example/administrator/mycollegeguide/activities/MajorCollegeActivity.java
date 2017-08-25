package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.MajorCollegeFragment;

/**
 * Created by Administrator on 2017/8/24 0024.
 */


/**
 * handle major activity for all the colleges
 */

public class MajorCollegeActivity extends MotherActivity {




    @Override
    protected Fragment getFragment() {
        return new MajorCollegeFragment();
    }





    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, MajorCollegeActivity.class);
        return intent;
    }
}
