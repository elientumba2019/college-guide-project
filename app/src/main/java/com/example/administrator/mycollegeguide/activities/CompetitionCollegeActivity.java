package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.CompetitionCollegeFragment;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class CompetitionCollegeActivity extends MotherActivity {

    private static final String EXTRA_INFOS = "infos";


    @Override
    protected Fragment getFragment() {
        String str = getIntent().getStringExtra(EXTRA_INFOS);
        return CompetitionCollegeFragment.getInstance(str);
    }



    public static Intent getIntent(Context context, String str){
        Intent intent = new Intent(context, CompetitionCollegeActivity.class);
        intent.putExtra(EXTRA_INFOS, str);
        return intent;
    }
}
