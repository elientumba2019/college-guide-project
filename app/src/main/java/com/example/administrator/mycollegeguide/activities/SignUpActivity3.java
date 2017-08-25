package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.administrator.mycollegeguide.R;
/**
 * Created by Administrator on 2017/8/15 0015.
 */


/**
 * last windows for sign up
 */
public class SignUpActivity3 extends AppCompatActivity {


    /**
     * onCreate
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_3);
    }



    /**
     * returns an intent that will be used by some activity to open this
     * @param context
     * @return
     */
    public static Intent getIntent(Context context){
        Intent intent = new Intent(context , SignUpActivity3.class);
        return intent;
    }
}
