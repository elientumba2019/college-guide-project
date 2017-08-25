package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.administrator.mycollegeguide.fragments.CollegeFragment;


/**
 * Main activity that will be extended by other activities
 */
public class CollegeActivity extends MotherActivity {


    /**
     * will return some fragment that is to be displayed
     * on screen on the layout inflated by the Mother Activity
     * @return
     */
   @Override
   protected Fragment getFragment(){
       return new CollegeFragment();
   }



    /**
     * returns an intent to an activity that launches it
     * @param c
     * @return
     */
    public static Intent getIntent(Context c){
        Intent intent = new Intent(c , CollegeActivity.class);
        return intent;
    }
}
