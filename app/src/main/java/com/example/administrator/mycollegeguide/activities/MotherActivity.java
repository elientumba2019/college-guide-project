package com.example.administrator.mycollegeguide.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.mycollegeguide.R;

/**
 * Created by Administrator on 2017/8/2 0002.
 */


/**
 * General Mother class that is going to be extended by all other classes
 */
public abstract class MotherActivity  extends AppCompatActivity{


    /**
     * declare instance field
     */

    private Button mHome_buton;
    private Button mCollege_button;
    private Button mMe_button;
    private BottomNavigationView bottomNavigationView;


    /**
     * abstract method that will return some fragement
     * which will be displayed on Screen
     * @return
     */
    protected abstract Fragment getFragment();


    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_mother);


        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);



        if(fragment == null){
            fragment = getFragment();
            manager.beginTransaction().add(R.id.fragment_container , fragment).commit();
        }


        /**
         * get reference id for the Field instance
         */

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
       // mHome_buton = (Button)findViewById(R.id.home_button);
        //mCollege_button = (Button)findViewById(R.id.college_button);
        //mMe_button = (Button)findViewById(R.id.me_layout);


        /**
         * get action
         */

        /*mHome_buton.setOnClickListener(action ->{

        });*/

        /*mCollege_button.setOnClickListener(action -> {
            Intent intent = CollegeActivity.getIntent(MotherActivity.this);
            startActivity(intent);
        });
        */


        bottomNavigationView.setOnNavigationItemSelectedListener(action -> {

            switch (action.getItemId()){

                case R.id.college_navigation : {
                    Intent intent = CollegeActivity.getIntent(MotherActivity.this);
                    startActivity(intent);
                    return true;
                }

                default:
                    return true;
            }
        });
    }


}
