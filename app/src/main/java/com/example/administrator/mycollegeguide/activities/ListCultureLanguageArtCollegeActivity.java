package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.ListCultureLanguageArtFragment;

/**
 * Created by Administrator on 2017/8/9 0009.
 */

public class ListCultureLanguageArtCollegeActivity extends MotherActivity {
    @Override
    protected Fragment getFragment() {
        return new ListCultureLanguageArtFragment();
    }


    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, ListCultureLanguageArtCollegeActivity.class);
        return intent;
    }
}
