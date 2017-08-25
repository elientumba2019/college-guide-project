package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.ListScienceCollegeFragment;

/**
 * Created by Administrator on 2017/8/8 0008.
 */

public class ListScienceCollegeActivity extends MotherActivity {
    @Override
    protected Fragment getFragment() {
        return new ListScienceCollegeFragment();
    }


    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, ListScienceCollegeActivity.class);
        return intent;
    }
}
