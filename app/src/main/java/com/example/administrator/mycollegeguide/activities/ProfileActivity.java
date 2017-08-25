package com.example.administrator.mycollegeguide.activities;

import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.ProfileFragment;

/**
 * Created by Administrator on 2017/8/16 0016.
 */


/**
 * activity to display a user profile
 */
public class ProfileActivity extends MotherActivity {


    /**
     * returns the corresponding fragment
     * @return
     */
    @Override
    protected Fragment getFragment() {
        return new ProfileFragment();
    }
}
