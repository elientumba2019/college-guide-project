package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.AboutCollegeFragment;

/**
 * Created by Administrator on 2017/8/11 0011.
 */


/**
 * About College Activity
 */
public class AboutCollegeActivity extends MotherActivity{


    private static final String URL_EXTRA = "key";

    /**
     * returns the Fragment that contains a link to the
     * page web introducing the College
     * @return
     */
    @Override
    protected Fragment getFragment() {

        //getting the url
        String url = getIntent().getStringExtra(URL_EXTRA);
        return AboutCollegeFragment.getInstance(url);
    }




    /**
     * return an intent that will be used
     * to launch this activity
     * @param context
     * @return
     */
    public static Intent getIntent(Context context , String url){
        Intent intent = new Intent(context , AboutCollegeActivity.class);
        intent.putExtra(URL_EXTRA , url);
        return intent;
    }
}
