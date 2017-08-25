package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.administrator.mycollegeguide.R;
import com.example.administrator.mycollegeguide.fragments.SecurityQuestionFragment;

/**
 * Created by Administrator on 2017/8/16 0016.
 */


/**
 * activity to hold the layout for
 * the forgot password
 */
public class ForgotPAssword1 extends AppCompatActivity implements View.OnClickListener{


    private EditText username , email;
    private RadioGroup group;
    private RadioButton email_recovery , question;
    private Button nextButton;



    /**
     * onCreate method
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password_layout_1);
        referenceElementOnLayout();
    }






    /**
     * gets references of element
     * on the layout
     */
    private void referenceElementOnLayout(){
        username = (EditText)findViewById(R.id.reset_username);
        email = (EditText)findViewById(R.id.reset_password);
        group = (RadioGroup)findViewById(R.id.reset_group);
        email_recovery = (RadioButton)findViewById(R.id.by_email);
        question = (RadioButton)findViewById(R.id.by_security);
        nextButton = (Button)findViewById(R.id.next_button_restore);

        question.setOnClickListener(this);

    }





    /**
     * returns an intent that will be used by some activity
     * @param context
     * @return
     */
    public static Intent getIntent(Context context){
        Intent intent = new Intent(context , ForgotPAssword1.class);
        return intent;
    }





    /**
     * onClick method
     * @param view
     */
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.by_security : {
                SecurityQuestionFragment fragment = new SecurityQuestionFragment();
                fragment.show(getSupportFragmentManager() , "dialog");
                break;
            }
        }
    }
}
