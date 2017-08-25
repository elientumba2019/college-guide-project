package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.OfficeCollegeFragment;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class OfficeCollegeActivity extends MotherActivity {


    @Override
    protected Fragment getFragment() {
        return new OfficeCollegeFragment();
    }


    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, OfficeCollegeActivity.class);
        return intent;
    }
}
