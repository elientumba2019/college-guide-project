package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.example.administrator.mycollegeguide.fragments.CollegeDetailFragment;

/**
 * Created by Administrator on 2017/8/11 0011.
 */


/**
 * Returns a College Menu
 */
public class CollegeDetailActivity extends MotherActivity {


    private static final String INTENT_KEY = "intent_key";


    /**
     * returns a new College details fragment
     * @return
     */
    @Override
    protected Fragment getFragment() {
        String url = getIntent().getStringExtra(INTENT_KEY);
        return CollegeDetailFragment.getInstance(url);
    }





    /**
     * returns an intent that will be used to open this activity
     * @param context
     * @return
     */
    public static Intent getIntent(Context context , String url){
        Intent intent = new Intent(context , CollegeDetailActivity.class);
        intent.putExtra(INTENT_KEY , url);
        return intent;
    }
}
